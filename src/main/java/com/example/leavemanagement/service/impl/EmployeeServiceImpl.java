package com.example.leavemanagement.service.impl;

import com.example.leavemanagement.dto.CreateEmployeeRequest;
import com.example.leavemanagement.dto.EmployeeDto;
import com.example.leavemanagement.dto.UpdateEmployeeRequest;
import com.example.leavemanagement.exception.EntityNotFoundException;
import com.example.leavemanagement.model.Employee;
import com.example.leavemanagement.repository.EmployeeRepository;
import com.example.leavemanagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public EmployeeDto createEmployee(CreateEmployeeRequest request) {
        // Convert request DTO → entity
        Employee employee = Employee.builder()
                .name(request.getName())
                .email(request.getEmail())
                .department(request.getDepartment())
                .dateOfJoining(request.getDateOfJoining())
                .build();

        // Save in DB
        Employee savedEmployee = employeeRepository.save(employee);

        // Convert entity → response DTO
        return EmployeeDto.builder()
                .id(savedEmployee.getId())
                .name(savedEmployee.getName())
                .email(savedEmployee.getEmail())
                .department(savedEmployee.getDepartment())
                .dateOfJoining(savedEmployee.getDateOfJoining())
                .build();
    }

    @Override
    @Cacheable(cacheNames = "employee", key = "#id")
    public EmployeeDto getEmployee(Long id) {
        // Step 1: Fetch employee from database using repository
        // findById() returns Optional<Employee>
        // If present → return Employee
        // If not found → throw exception
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Employee not found with id: " + id));

        // Step 2: Convert Entity → DTO manually
        // We never return the Entity directly in API response for security & good practice
        EmployeeDto empResponseDto = new EmployeeDto();
        empResponseDto.setId(employee.getId());
        empResponseDto.setName(employee.getName());
        empResponseDto.setEmail(employee.getEmail());
        empResponseDto.setDepartment(employee.getDepartment());
        empResponseDto.setDateOfJoining(employee.getDateOfJoining());
        empResponseDto.setVersion(employee.getVersion());

        // Step 3: Return only DTO to controller
        return empResponseDto;
        // throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public Page<EmployeeDto> getEmployees(Pageable pageable) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    @CachePut(cacheNames = "employee", key = "#id")
    public EmployeeDto updateEmployee(Long id, UpdateEmployeeRequest request) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    @CacheEvict(cacheNames = "employee", key = "#id")
    public void deleteEmployee(Long id) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
