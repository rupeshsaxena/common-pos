package com.common.pos.common_pos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;

@EnableConfigServer
@Configuration
@SpringBootApplication
public class CommonPosApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommonPosApplication.class, args);
	}

}
