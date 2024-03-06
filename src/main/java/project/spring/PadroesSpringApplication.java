package project.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto Spring Boot
 * -Spring Data JPA
 * -Spring Web
 * -H2 Database
 * -OpenFeign
 *
 * @author Cristphe
 */

@EnableFeignClients
@SpringBootApplication
public class PadroesSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(PadroesSpringApplication.class, args);
	}

}
