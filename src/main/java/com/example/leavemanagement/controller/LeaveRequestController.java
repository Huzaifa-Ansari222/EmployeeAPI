package com.example.leavemanagement.controller;

import com.example.leavemanagement.dto.CreateLeaveRequest;
import com.example.leavemanagement.dto.LeaveRequestDto;
import com.example.leavemanagement.service.LeaveRequestService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/leaves")
public class LeaveRequestController {

   // private final LeaveRequestService leaveRequestService;

    @PostMapping
    public ResponseEntity<LeaveRequestDto> createLeave(@Valid @RequestBody CreateLeaveRequest request) {

        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<LeaveRequestDto> getLeave(@PathVariable Long id) {
        return null;
    }

    @GetMapping
    public ResponseEntity<?> getLeaves(@RequestParam(required = false) Long employeeId,
                                       @ParameterObject Pageable pageable) {
        return null;
    }

    @PutMapping("/{id}/approve")
    public ResponseEntity<LeaveRequestDto> approve(@PathVariable Long id,
                                                   @RequestHeader(name = "X-ROLE", required = false) String role) {
        return null;
    }

    @PutMapping("/{id}/reject")
    public ResponseEntity<LeaveRequestDto> reject(@PathVariable Long id,
                                                  @RequestHeader(name = "X-ROLE", required = false) String role) {
        return null;
    }
}
