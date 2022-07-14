package com.demo.example.app;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.example.config.AppSettingConfig;

@RestController
public class AccountController {

	@Autowired
	private AppSettingConfig appSettingConfig;

	//protected String MY_SERVER = appSettingConfig.getServerName();
	//protected String MY_CORP = appSettingConfig.getCorpCode();
	
	
	@RequestMapping(value = "/getConfig" ,method = RequestMethod.GET)
	public Map<String,Object> configReturnMethod(){
		
		Map<String,Object> map = new HashMap<>();
		
		map.put("MY_SERVER", appSettingConfig.getServerName());
		map.put("MY_CORP", appSettingConfig.getCorpCode());
		return map;
		
	}
}
