package com.gaozhaoxi.springbooteleven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching  //要加上@EnableCaching注解才会生效。
@SpringBootApplication
public class SpringBootElevenApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootElevenApplication.class, args);
	}
}
