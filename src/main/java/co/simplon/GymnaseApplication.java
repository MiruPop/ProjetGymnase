package co.simplon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import co.simplon.api.repository.GymnaseRepository;
import co.simplon.api.repository.SportifRepository;

@SpringBootApplication
@EnableMongoRepositories (basePackageClasses = {SportifRepository.class,GymnaseRepository.class})
public class GymnaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(GymnaseApplication.class, args);
	}

}
