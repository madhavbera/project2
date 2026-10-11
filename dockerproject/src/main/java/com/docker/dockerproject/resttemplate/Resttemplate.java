package com.docker.dockerproject.resttemplate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Resttemplate {
	@Bean
	public RestTemplate resttemp()
	{
		return new RestTemplate();
	}

}
