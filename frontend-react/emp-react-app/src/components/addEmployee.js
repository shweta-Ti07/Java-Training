import { useState } from "react";
import { useNavigate } from "react-router-dom";
import { addEmployee } from "../services/employeeService";
import "bootstrap/dist/css/bootstrap.min.css";

export const AddEmployee = () => {
  const [employee, setEmployee] = useState({
    id: "",
    name: "",
    desg: ""
  });

  const navigate = useNavigate();

  const handleChange = (event) => {
    const { name, value } = event.target;

    setEmployee({
      ...employee,
      [name]: value
    });
  };

  const saveEmployee = (event) => {
    event.preventDefault();

    const employeeData = {
      id: Number(employee.id),
      name: employee.name,
      desg: employee.desg
    };

    addEmployee(employeeData)
      .then((response) => {
        console.log("Employee added successfully:", response.data);
        navigate("/");
      })
      .catch((error) => {
        console.log("Error while adding employee:", error);
      });
  };

  return (
    <div className="container mt-4">
      <div className="card shadow">
        <div className="card-header bg-primary text-white">
          <h3 className="mb-0">Add Employee</h3>
        </div>

        <div className="card-body">
          <form onSubmit={saveEmployee}>
            <div className="mb-3">
              <label className="form-label">Employee ID</label>

              <input
                type="number"
                className="form-control"
                name="id"
                value={employee.id}
                onChange={handleChange}
                placeholder="Enter employee ID"
                required
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
                placeholder="Enter employee name"
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
                placeholder="Enter designation"
                required
              />
            </div>

            <button type="submit" className="btn btn-success me-2">
              Add Employee
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