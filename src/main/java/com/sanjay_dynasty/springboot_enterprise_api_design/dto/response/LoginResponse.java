package com.sanjay_dynasty.springboot_enterprise_api_design.dto.response;

public record LoginResponse(

        String accessToken,

        String tokenType

) {
}