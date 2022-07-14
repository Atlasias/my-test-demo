package com.demo.example.app;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.example.config.AppSettingConfig;
import com.demo.example.config.ConfigCaller;

@Lazy
@RestController
public class Account2Controller {
	
	protected String MY_SERVER_E;
	protected String MY_CORP_E;
	
	public Account2Controller(@Autowired AppSettingConfig appSettingConfig) {
		MY_SERVER_E = appSettingConfig.getServerName();
		 MY_CORP_E = appSettingConfig.getCorpCode();
	}
	
	
	@RequestMapping(value = "/getConfig2" ,method = RequestMethod.GET)
	public Map<String,Object> configReturnMethod(){
		
		Map<String,Object> map = new HashMap<>();
		map.put("MY_SERVER_E", MY_SERVER_E);
		map.put("MY_CORP_E", MY_CORP_E);
		return map;
		
	}
}


