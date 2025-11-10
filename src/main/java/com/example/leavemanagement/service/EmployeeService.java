package com.example.leavemanagement.service;

import com.example.leavemanagement.dto.CreateEmployeeRequest;
import com.example.leavemanagement.dto.EmployeeDto;
import com.example.leavemanagement.dto.UpdateEmployeeRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {
    EmployeeDto createEmployee(CreateEmployeeRequest request);
    EmployeeDto getEmployee(Long id);
    Page<EmployeeDto> getEmployees(Pageable pageable);
    EmployeeDto updateEmployee(Long id, UpdateEmployeeRequest request);
    void deleteEmployee(Long id);
}
