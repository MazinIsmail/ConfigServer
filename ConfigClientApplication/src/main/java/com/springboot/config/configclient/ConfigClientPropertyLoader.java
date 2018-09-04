package com.springboot.config.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@Configuration
@RefreshScope
public class ConfigClientPropertyLoader {

	@Value("${msg:Hello world - Config Server is not working..pelase check}")
	private String msg;

	public String getMsg() {
		return msg;
	}

}
