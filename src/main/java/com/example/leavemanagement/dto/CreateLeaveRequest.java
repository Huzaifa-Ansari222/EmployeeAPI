package com.example.leavemanagement.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;

@Data
public class CreateLeaveRequest {
    @NotNull
    private Long employeeId;

    @NotNull
    private LocalDate startDate;

    @NotNull
    private LocalDate endDate;
}
