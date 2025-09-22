package com.example.leavemanagement.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;

@Data
public class UpdateEmployeeRequest {

    private String name;


    private String email;

    private String department;


    private LocalDate dateOfJoining;


    private Long version;
}
