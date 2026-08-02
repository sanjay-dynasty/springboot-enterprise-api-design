package com.sanjay_dynasty.springboot_enterprise_api_design.dto.response;

import java.time.LocalDateTime;

import com.sanjay_dynasty.springboot_enterprise_api_design.enums.Role;

public record UserResponse(

        Long id,

        String name,

        String email,

        Role role,

        boolean enabled,

        LocalDateTime createdAt

) {
}