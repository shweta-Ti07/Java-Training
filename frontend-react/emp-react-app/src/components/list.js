import { useEffect, useState } from "react";
import {
  getAllEmployees,
  deleteEmployeeById
} from "../services/employeeService";
import "bootstrap/dist/css/bootstrap.min.css";
import { Link } from "react-router-dom";

export const List = () => {
  const [employees, setEmployees] = useState([]);

  const loadEmployees = () => {
    getAllEmployees()
      .then((response) => {
        console.log(response.data);
        setEmployees(response.data);
      })
      .catch((error) => {
        console.log(error);
      });
  };

  useEffect(() => {
    loadEmployees();
  }, []);

  const deleteEmployee = (id) => {
    deleteEmployeeById(id)
      .then(() => {
        console.log("Employee deleted successfully");

        // Remove the deleted employee from the table
        setEmployees(
          employees.filter((employee) => employee.id !== id)
        );
      })
      .catch((error) => {
        console.log(error);
      });
  };

  return (
    <div className="container mt-4">
      <h2 className="text-center mb-3">Employee List</h2>

      <table className="table table-bordered table-striped table-hover">
        <thead className="table-dark">
          <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Designation</th>
            <th>Actions</th>
          </tr>
        </thead>

        <tbody>
          {employees.map((employee) => (
            <tr key={employee.id}>
              <td>{employee.id}</td>
              <td>{employee.name}</td>
              <td>{employee.desg}</td>

              <td>
                <Link
                  to={`/update/${employee.id}`}
                  className="btn btn-warning btn-sm me-2"
                >
                  Update
                </Link>

                <Link
                  to={`/info/${employee.id}`}
                  className="btn btn-info btn-sm me-2"
                >
                  Info
                </Link>

                <button
                  className="btn btn-danger btn-sm"
                  onClick={() => deleteEmployee(employee.id)}
                >
                  Delete
                </button>
              </td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};