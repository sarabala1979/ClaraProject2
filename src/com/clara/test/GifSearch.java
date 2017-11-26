package com.clara.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
public class GifSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(GifSearch.class, args);

	}

}
