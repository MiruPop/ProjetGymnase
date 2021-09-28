package co.simplon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import co.simplon.api.repository.GymnaseRepository;

@SpringBootApplication
@EnableMongoRepositories
//(basePackageClasses = GymnaseRepository.class)
public class GymnaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(GymnaseApplication.class, args);
	}

}
