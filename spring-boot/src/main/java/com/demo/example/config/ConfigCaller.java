package com.demo.example.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Component
@Getter
public class ConfigCaller {
	
	@Autowired
	private AppSettingConfig appSettingConfig;
}