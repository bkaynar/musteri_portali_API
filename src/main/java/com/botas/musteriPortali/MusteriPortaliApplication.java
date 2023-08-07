package com.botas.musteriPortali;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class MusteriPortaliApplication {

	public static void main(String[] args) {
		SpringApplication.run(MusteriPortaliApplication.class, args);
	}

}
