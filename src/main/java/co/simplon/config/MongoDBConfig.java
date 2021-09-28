//package co.simplon.config;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.stereotype.Service;
//
//import com.mongodb.client.MongoClient;
//import com.mongodb.client.MongoClients;
//
//@Configuration
//@Service
//public class MongoDBConfig {
//	
//	@Bean
//	public MongoClient mongoClient(@Value("${spring.mongodb.uri}") String connectionString) {
//
////		ConnectionString connString = new ConnectionString(connectionString);
//
//		return MongoClients.create(connectionString);
//
//	}
//}
