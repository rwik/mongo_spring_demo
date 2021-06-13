package io.github.rwik.mogo_demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class MogoDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(MogoDemoApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(StudentRepository studentRP){
		return args -> {
			Student st =new Student(
					"Ravi Raj",
					"23/3 suinho street ,kolkata 45",
					List.of("Harry potter", "Gita")
			);
			studentRP.insert(st);

		};
	}

}
