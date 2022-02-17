package co.simplon;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsConfigurationSource;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@SpringBootApplication
public class GymnaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(GymnaseApplication.class, args);
	}
	
	/*
	 * Ce Bean permet à tous les endpoints de l'application de communiquer
	 * de manière croisée avec une application tournant sur un autre domaine,
	 * dans le cas présent avec le domaine de l'interface Angular
	 */
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
				.allowedOrigins("http://localhost:4200")
				.allowedMethods("GET", "PUT", "POST", "PATCH", "DELETE", "OPTIONS")
				.allowCredentials(true)
				.allowedHeaders("Origin", "Access-Control-Allow-Origin", "Content-Type",
				"Accept", "Authorization", "Origin, Accept", "X-Requested-With", "Access-Control-Request-Method",
				"Access-Control-Request-Headers")
				.exposedHeaders("Origin", "Content-Type", "Accept", "Authorization", "Access-Control-Allow-Origin", "Access-Control-Allow-Credentials");
			}
		};
	}

}
