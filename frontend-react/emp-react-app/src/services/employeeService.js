import axios from "axios";
import { Employee } from "../model/employee";
const BASE_URL="http://localhost:8080/api/employees";

export const getAllEmployees=()=>{
    return axios.get(BASE_URL)
}
export const deleteEmployeeById=(id)=>{
    return axios.delete(`${BASE_URL}/${id}`)
}

export const addEmployee=(employee)=>{
    return axios.post(`${BASE_URL}`,employee)
}

export const getEmployeeById=(id)=>{
    return axios.get(`${BASE_URL}/${id}`)
}

export const updateEmployee=(id,employee)=>{
    return axios.put(`${BASE_URL}/${id}`,employee)
}