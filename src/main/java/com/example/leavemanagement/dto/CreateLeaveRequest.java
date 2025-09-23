package com.example.leavemanagement.dto;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;


public class CreateLeaveRequest {
    @NotNull
    private Long employeeId;

    @NotNull
    private LocalDate startDate;

    @NotNull
    private LocalDate endDate;
}
