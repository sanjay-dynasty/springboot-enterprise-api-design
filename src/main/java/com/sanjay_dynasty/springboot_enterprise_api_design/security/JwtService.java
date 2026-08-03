package com.sanjay_dynasty.springboot_enterprise_api_design.security;

import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.HashMap;

import javax.crypto.SecretKey;

import org.springframework.stereotype.Service;

import com.sanjay_dynasty.springboot_enterprise_api_design.config.JwtProperties;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class JwtService {

    private final JwtProperties jwtProperties;

    public String generateToken(String username) {

        SecretKey key = Keys.hmacShaKeyFor(jwtProperties
                .secret()
                .getBytes(StandardCharsets.UTF_8));

        return Jwts.builder()
                .claims(new HashMap<>())
                .subject(username)
                .issuedAt(new Date())
                .expiration(new Date(System.currentTimeMillis() + jwtProperties.expiration()))
                .signWith(key)
                .compact();
    }

}
