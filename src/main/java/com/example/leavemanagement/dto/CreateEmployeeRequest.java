package com.example.leavemanagement.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class CreateEmployeeRequest {

    private String name;
    private String email;
    private String department;
    private LocalDate dateOfJoining;
}
