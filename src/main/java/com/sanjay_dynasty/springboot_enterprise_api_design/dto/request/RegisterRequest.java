package com.sanjay_dynasty.springboot_enterprise_api_design.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record RegisterRequest(

        @NotBlank(message = "Name is required") 
        @Size(min = 3, max = 100, message = "Name must be between 3 to 100 characters") 
        String name,

        @NotBlank(message = "Email is required")
        @Email(message = "Invalid email format")
        String email,

        @NotBlank(message = "Password is required")
        @Size(min = 4, max = 15, message = "Password length must be between 4 to 15 characters")
        String password

) {
}