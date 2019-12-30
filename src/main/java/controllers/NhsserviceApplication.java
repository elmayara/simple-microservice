package controllers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan("models")
@EnableJpaRepositories("Repositories")
@SpringBootConfiguration
public class NhsserviceApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(NhsserviceApplication.class, args);
	}
}
