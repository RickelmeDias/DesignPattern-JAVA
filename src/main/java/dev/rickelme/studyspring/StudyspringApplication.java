package dev.rickelme.studyspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class StudyspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudyspringApplication.class, args);
	}

}
