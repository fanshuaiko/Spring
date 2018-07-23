package com.Annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;

@Configuration
@ImportResource("classpath:Spring_Properties.xml")
public class ConfigJDBC {

	@Value("${jdbc.driver}")
	private String driver;
	@Value("${jdbc.name}")
	private String name;
	@Value("${jdbc.password}")
	private String password;
	
	@Bean(name="manager")
	@Scope("prototype")
	public MyJdbcDriverManager myJdbcDriverManager() {
		return new MyJdbcDriverManager( driver,name, password);
	}
	
}
