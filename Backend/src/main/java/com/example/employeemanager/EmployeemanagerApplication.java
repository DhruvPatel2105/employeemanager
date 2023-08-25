package com.example.employeemanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@SpringBootApplication
public class EmployeemanagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeemanagerApplication.class, args);
	}


	//	For Error = "localhost/:1 Access to XMLHttpRequest at 'http://localhost:8080/employee/all' from origin 'http://localhost:4200' has been blocked by CORS policy: No 'Access-Control-Allow-Origin' header is present on the requested resource."
	//	I created this method called corsConfigurer by taking reference from the https://docs.spring.io/spring-framework/reference/web/webmvc-cors.html and also one youTube video (https://www.youtube.com/watch?v=X2hjlquVess) Please prefer the last moment of the video
	@Bean
	public WebMvcConfigurer corsConfigurer(){
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
						.allowedOrigins("http://localhost:4200")
						.allowedMethods("GET","POST","PUT","DELETE","OPTIONS")
						.allowedHeaders("Origin","Access-Control-Allow-Origin","Content-Type",
				"Accept","Authorization","Origin,Accept","X-Requested-With",
				"Access-Control-Request-Method","Access-Control-Request-Headers")
						.exposedHeaders("Origin","Content-Type","Accept","Authorization",
				"Access-Control-Allow-Origin","Access-Control-Allow-Credentials")
						.allowCredentials(true).maxAge(3600);
			}
		};
	}



}
