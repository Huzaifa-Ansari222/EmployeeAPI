package com.example.leavemanagement.service.impl;

import com.example.leavemanagement.dto.CreateLeaveRequest;
import com.example.leavemanagement.dto.LeaveRequestDto;
import com.example.leavemanagement.exception.BadRequestException;
import com.example.leavemanagement.exception.ForbiddenOperationException;
import com.example.leavemanagement.exception.NotFoundException;
import com.example.leavemanagement.model.Employee;
import com.example.leavemanagement.model.LeaveRequest;
import com.example.leavemanagement.model.LeaveStatus;
import com.example.leavemanagement.repository.EmployeeRepository;
import com.example.leavemanagement.repository.LeaveRequestRepository;
import com.example.leavemanagement.service.LeaveRequestService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class LeaveRequestServiceImpl implements LeaveRequestService {

    private final LeaveRequestRepository leaveRequestRepository;
    private final EmployeeRepository employeeRepository;

    @Override
    public LeaveRequestDto createLeaveRequest(CreateLeaveRequest request) {
        return new LeaveRequestDto();
    }

    @Override
    public LeaveRequestDto getLeaveRequest(Long id) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public Page<LeaveRequestDto> getLeaveRequests(Pageable pageable) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public List<LeaveRequestDto> getLeaveRequestsByEmployee(Long employeeId) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public LeaveRequestDto approveLeave(Long id, String roleHeader) {

        return new LeaveRequestDto();
    }

    @Override
    public LeaveRequestDto rejectLeave(Long id, String roleHeader) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Async
    protected void sendNotificationAsync(String message) {
        log.info("Async notification: {}", message);
    }

    private LeaveRequestDto toDto(LeaveRequest lr) {
        return LeaveRequestDto.builder()
                .id(lr.getId())
                .employeeId(lr.getEmployee().getId())
                .startDate(lr.getStartDate())
                .endDate(lr.getEndDate())
                .status(lr.getStatus())
                .build();
    }
}
