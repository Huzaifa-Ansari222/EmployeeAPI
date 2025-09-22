package com.example.leavemanagement.service.impl;

import com.example.leavemanagement.dto.CreateEmployeeRequest;
import com.example.leavemanagement.dto.EmployeeDto;
import com.example.leavemanagement.dto.UpdateEmployeeRequest;
import com.example.leavemanagement.service.EmployeeService;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service

public class EmployeeServiceImpl implements EmployeeService {


    //private final EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(CreateEmployeeRequest request) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    @Cacheable(cacheNames = "employee", key = "#id")
    public EmployeeDto getEmployee(Long id) {
        throw new UnsupportedOperationException("Not implemented yet");
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
