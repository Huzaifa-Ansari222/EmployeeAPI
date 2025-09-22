package com.example.leavemanagement.service;

import com.example.leavemanagement.dto.CreateLeaveRequest;
import com.example.leavemanagement.dto.LeaveRequestDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface LeaveRequestService {
    LeaveRequestDto createLeaveRequest(CreateLeaveRequest request);
    LeaveRequestDto getLeaveRequest(Long id);
    Page<LeaveRequestDto> getLeaveRequests(Pageable pageable);
    List<LeaveRequestDto> getLeaveRequestsByEmployee(Long employeeId);
    LeaveRequestDto approveLeave(Long id, String roleHeader);
    LeaveRequestDto rejectLeave(Long id, String roleHeader);
}
