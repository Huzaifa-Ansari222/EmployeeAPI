package com.example.leavemanagement.service;
import com.example.leavemanagement.dto.CreateEmployeeRequest;
import com.example.leavemanagement.dto.EmployeeDto;
import com.example.leavemanagement.dto.UpdateEmployeeRequest;
import com.example.leavemanagement.model.Employee;
import com.example.leavemanagement.repository.EmployeeRepository;
import com.example.leavemanagement.service.impl.EmployeeServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.cache.CacheManager;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


public class EmployeeServiceTest {

    @Mock
    private CacheManager cacheManager;

    @InjectMocks
    private com.example.leavemanagement.service.impl.EmployeeServiceImpl employeeService;

//    @Autowired
    private MockMvc mockMvc;

    @Mock
    private EmployeeRepository employeeRepository;

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
        // Given (Mock repository response)
        Employee employee = new Employee();
        employee.setId(1L);
        employee.setName("John");
        employee.setEmail("john@example.com");

        when(employeeRepository.findById(1L)).thenReturn(Optional.of(employee));

        // When
        EmployeeDto result = employeeService.getEmployee(1L);

        // Then
        assertEquals("John", result.getName());
        assertEquals("john@example.com", result.getEmail());    }

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
