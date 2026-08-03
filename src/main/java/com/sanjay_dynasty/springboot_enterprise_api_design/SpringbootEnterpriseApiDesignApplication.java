package com.sanjay_dynasty.springboot_enterprise_api_design;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.sanjay_dynasty.springboot_enterprise_api_design.config.JwtProperties;

@SpringBootApplication
@EnableConfigurationProperties(JwtProperties.class)
public class SpringbootEnterpriseApiDesignApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootEnterpriseApiDesignApplication.class, args);
		System.out.println("Application is running ..... ");
	}

}
