import { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";
import { getEmployeeById } from "../services/employeeService";
import "bootstrap/dist/css/bootstrap.min.css";

export const InfoEmployee = () => {
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

  return (
    <div className="container mt-4">
      <div className="card shadow">
        <div className="card-header bg-info">
          <h3 className="mb-0">Employee Information</h3>
        </div>

        <div className="card-body">
          <table className="table table-bordered">
            <tbody>
              <tr>
                <th>Employee ID</th>
                <td>{employee.id}</td>
              </tr>

              <tr>
                <th>Employee Name</th>
                <td>{employee.name}</td>
              </tr>

              <tr>
                <th>Designation</th>
                <td>{employee.desg}</td>
              </tr>
            </tbody>
          </table>

          <button
            className="btn btn-primary"
            onClick={() => navigate("/")}
          >
            Back to Employee List
          </button>
        </div>
      </div>
    </div>
  );
};