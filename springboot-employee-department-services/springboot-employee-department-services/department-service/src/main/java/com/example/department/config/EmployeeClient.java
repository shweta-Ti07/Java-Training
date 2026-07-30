package com.example.department.config;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.department.dto.EmployeeDto;

@FeignClient(name = "EMPLOYEE-SERVICE", fallback = EmployeeCilentFallBack.class)
public interface EmployeeClient {
	
	@GetMapping("/api/employees/department/{did}")
	List<EmployeeDto> getEmployeesByDid(@PathVariable("did") Integer did);
	
}
