package com.google.ssm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@SpringBootApplication
@ComponentScan(basePackages={"com.google.ssm"})
//@MapperScan("com.google.ssm.dao")
@ServletComponentScan
public class SsmApplication {

	public static void main(String[] args) {
		SpringApplication.run(SsmApplication.class, args);
		System.out.println("success!!!!!!!!!!");
	}

//	@Bean
//	public FilterRegistrationBean testFilterRegistration() {
//
//		FilterRegistrationBean registration = new FilterRegistrationBean();
//		registration.setFilter(new MyFilter1());
//		registration.addUrlPatterns("/*");
//		registration.addInitParameter("paramName", "paramValue");
//		registration.setName("MyFilter1");
//		registration.setOrder(1);
//		return registration;
//	}

}
