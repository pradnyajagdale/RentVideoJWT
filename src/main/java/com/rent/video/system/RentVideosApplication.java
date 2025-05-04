package com.rent.video.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class RentVideosApplication {

	public static void main(String[] args) {
		SpringApplication.run(RentVideosApplication.class, args);
		log.info("In RentVideosApplication");
	}

}
