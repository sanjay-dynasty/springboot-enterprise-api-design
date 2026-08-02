package com.sanjay_dynasty.springboot_enterprise_api_design.dto.request;

import java.time.LocalDate;

import com.sanjay_dynasty.springboot_enterprise_api_design.enums.Priority;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record TaskRequest(

        @NotBlank(message = "Title is required")
        @Size(max = 100, message = "Title can't exceed 100 characters")
        String title,

        @Size(max = 200, message = "Description can't exceed 200 characters")
        String description,

        @NotNull(message = "Priority is required")
        Priority priority,

        @FutureOrPresent(message = "Due date can't be in past")
        LocalDate dueDate

) {
}