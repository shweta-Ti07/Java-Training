import { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";
import {
  getEmployeeById,
  updateEmployee
} from "../services/employeeService";
import "bootstrap/dist/css/bootstrap.min.css";

export const UpdateEmployee = () => {
  const { id } = useParams();
  const navigate = useNavigate();

  const [employee, setEmployee] = useState({
    id: "",
    name: "",
    desg: ""
  });

  useEffect(() => {
    getEmployeeById(id)
      .then((response) => {
        console.log(response.data);
        setEmployee(response.data);
      })
      .catch((error) => {
        console.log("Error while fetching employee:", error);
      });
  }, [id]);

  const handleChange = (event) => {
    const { name, value } = event.target;

    setEmployee({
      ...employee,
      [name]: value
    });
  };

  const modifyEmployee = (event) => {
    event.preventDefault();

    const updatedEmployee = {
      ...employee,
      id: Number(employee.id)
    };

    updateEmployee(id, updatedEmployee)
      .then((response) => {
        console.log("Employee updated successfully:", response.data);
        navigate("/");
      })
      .catch((error) => {
        console.log("Error while updating employee:", error);
      });
  };

  return (
    <div className="container mt-4">
      <div className="card shadow">
        <div className="card-header bg-warning">
          <h3 className="mb-0">Update Employee</h3>
        </div>

        <div className="card-body">
          <form onSubmit={modifyEmployee}>
            <div className="mb-3">
              <label className="form-label">Employee ID</label>

              <input
                type="number"
                className="form-control"
                name="id"
                value={employee.id}
                readOnly
              />
            </div>

            <div className="mb-3">
              <label className="form-label">Employee Name</label>

              <input
                type="text"
                className="form-control"
                name="name"
                value={employee.name}
                onChange={handleChange}
                required
              />
            </div>

            <div className="mb-3">
              <label className="form-label">Designation</label>

              <input
                type="text"
                className="form-control"
                name="desg"
                value={employee.desg}
                onChange={handleChange}
                required
              />
            </div>

            <button type="submit" className="btn btn-warning me-2">
              Update Employee
            </button>

            <button
              type="button"
              className="btn btn-secondary"
              onClick={() => navigate("/")}
            >
              Cancel
            </button>
          </form>
        </div>
      </div>
    </div>
  );
};