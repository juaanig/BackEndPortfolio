package com.porfolio.jig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class JigApplication {

	public static void main(String[] args) {
		SpringApplication.run(JigApplication.class, args);
	}

}
