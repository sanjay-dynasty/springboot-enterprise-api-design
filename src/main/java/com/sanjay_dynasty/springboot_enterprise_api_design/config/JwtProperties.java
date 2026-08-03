package com.sanjay_dynasty.springboot_enterprise_api_design.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "jwt")
public record JwtProperties(

        String secret,

        Long expiration
) {
}