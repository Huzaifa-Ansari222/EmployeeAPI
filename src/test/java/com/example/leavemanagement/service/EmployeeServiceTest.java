package com.example.leavemanagement.service;

import com.example.leavemanagement.dto.CreateEmployeeRequest;
import com.example.leavemanagement.dto.UpdateEmployeeRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.cache.CacheManager;
import org.springframework.data.domain.PageRequest;

public class EmployeeServiceTest {

    @Mock
    private CacheManager cacheManager;

    @InjectMocks
    private com.example.leavemanagement.service.impl.EmployeeServiceImpl employeeService;

    @BeforeEach
    void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void createEmployee_shouldCreate() {
        CreateEmployeeRequest request = new CreateEmployeeRequest();
        // TODO: add when implementing
    }

    @Test
    void getEmployee_shouldReturn() {
        // TODO
    }

    @Test
    void getEmployees_shouldPage() {
        PageRequest pageable = PageRequest.of(0, 10);
        // TODO
    }

    @Test
    void updateEmployee_shouldUpdate() {
        UpdateEmployeeRequest request = new UpdateEmployeeRequest();
        // TODO
    }

    @Test
    void deleteEmployee_shouldDelete() {
        // TODO
    }
}
