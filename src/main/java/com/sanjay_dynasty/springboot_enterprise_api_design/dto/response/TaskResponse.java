package com.sanjay_dynasty.springboot_enterprise_api_design.dto.response;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.sanjay_dynasty.springboot_enterprise_api_design.enums.Priority;
import com.sanjay_dynasty.springboot_enterprise_api_design.enums.TaskStatus;

public record TaskResponse(

        Long id,

        String title,

        String description,

        TaskStatus status,

        Priority priority,

        LocalDate dueDate,

        TaskOwnerResponse owner,

        LocalDateTime createdAt

) {
}