package com.example.leavemanagement.repository;

import com.example.leavemanagement.model.LeaveRequest;
import com.example.leavemanagement.model.LeaveStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface LeaveRequestRepository extends JpaRepository<LeaveRequest, Long> {

    @Query("select lr from LeaveRequest lr where lr.employee.id = :employeeId and lr.status = 'APPROVED' and lr.startDate <= :endDate and lr.endDate >= :startDate")
    List<LeaveRequest> findApprovedOverlapping(@Param("employeeId") Long employeeId,
                                               @Param("startDate") LocalDate startDate,
                                               @Param("endDate") LocalDate endDate);

    List<LeaveRequest> findByEmployee_Id(Long employeeId);
}
