package com.appsdeveloperblog.app.ws.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;


// read properties from application.properties 
@Component
public class AppProperties {

	@Autowired
	private Environment env; 
	// it has every elements of applicaion.properties file
	
	public String getTokenSecret() {
		return env.getProperty("tokenSecret");
	}
}
