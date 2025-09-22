package com.example.leavemanagement.config;

import com.example.leavemanagement.model.Employee;
import com.example.leavemanagement.model.LeaveRequest;
import com.example.leavemanagement.model.LeaveStatus;
import com.example.leavemanagement.repository.EmployeeRepository;
import com.example.leavemanagement.repository.LeaveRequestRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
@Slf4j
@RequiredArgsConstructor
public class DataInitializer {

    @Bean
    CommandLineRunner seedData(EmployeeRepository employeeRepository, LeaveRequestRepository leaveRequestRepository) {
        return args -> {
            leaveRequestRepository.deleteAll();
            employeeRepository.deleteAll();

            Employee alice = employeeRepository.save(Employee.builder()
                    .name("Alice Johnson")
                    .email("alice@example.com")
                    .department("Engineering")
                    .dateOfJoining(LocalDate.now().minusYears(2))
                    .build());

            Employee bob = employeeRepository.save(Employee.builder()
                    .name("Bob Smith")
                    .email("bob@example.com")
                    .department("HR")
                    .dateOfJoining(LocalDate.now().minusYears(1))
                    .build());

            leaveRequestRepository.save(LeaveRequest.builder()
                    .employee(alice)
                    .startDate(LocalDate.now().plusDays(3))
                    .endDate(LocalDate.now().plusDays(5))
                    .status(LeaveStatus.APPROVED)
                    .build());

            leaveRequestRepository.save(LeaveRequest.builder()
                    .employee(bob)
                    .startDate(LocalDate.now().plusDays(10))
                    .endDate(LocalDate.now().plusDays(12))
                    .status(LeaveStatus.PENDING)
                    .build());

            log.info("Seeded sample employees and leave requests");
        };
    }
}
