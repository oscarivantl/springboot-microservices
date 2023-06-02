package com.oitl.employeeservice.service;

import com.oitl.employeeservice.dto.APIResponseDto;
import com.oitl.employeeservice.dto.EmployeeDto;

public interface EmployeeService {

    EmployeeDto saveEmployee(EmployeeDto employeeDto);

    APIResponseDto getEmployeeById(Long employeeId);

}
