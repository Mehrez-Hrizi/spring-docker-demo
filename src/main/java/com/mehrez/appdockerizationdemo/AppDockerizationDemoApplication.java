package com.mehrez.appdockerizationdemo;

import com.mehrez.appdockerizationdemo.entity.DemoEntity;
import com.mehrez.appdockerizationdemo.repository.DemoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AppDockerizationDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppDockerizationDemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(DemoRepository repository) {
		return args -> {
			repository.save(new DemoEntity("docker", "demo description"));
		};
	}

}
