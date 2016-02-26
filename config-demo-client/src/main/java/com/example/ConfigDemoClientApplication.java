package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@SpringBootApplication
@RestController
public class ConfigDemoClientApplication  {

	//@Value("${accessTokenUri}")
	//String name = "World";

	@Autowired
	Environment environment;

	@RequestMapping("/")
	@ResponseBody
	public Map properties() {
		RelaxedPropertyResolver resolver = new RelaxedPropertyResolver(environment);
		Map<String, Object> properties = resolver.getSubProperties("plans.");
		return properties;
	}


	public static void main(String[] args) {
		SpringApplication.run(ConfigDemoClientApplication.class, args);
	}

}
