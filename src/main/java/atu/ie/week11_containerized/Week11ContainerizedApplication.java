package atu.ie.week11_containerized;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Week11ContainerizedApplication {
	public static void main(String[] args) {
		SpringApplication.run(Week11ContainerizedApplication.class, args);
	}

}

