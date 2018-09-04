package com.springboot.config.configclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {

	@Autowired
	private ConfigClientPropertyLoader configClientPropertyLoader;

	@RequestMapping("/greeting")
	public String greeting() {
		return configClientPropertyLoader.getMsg();
	}
}
