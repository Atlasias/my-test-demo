package com.demo.example.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix="app-settings")
@ConfigurationPropertiesScan
public class AppSettingConfig {

	private String test;
	private String serverName;
	private String corpCode;
	
}
