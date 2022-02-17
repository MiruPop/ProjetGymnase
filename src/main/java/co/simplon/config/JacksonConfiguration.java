package co.simplon.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

/* 
 * Les objets saisis dans les formulaires d'ajout et de modification dans l'interface
 * Angular (pour lesquels aucun _id n'a été fourni) arrivent vers l'api du back
 * avec un String vide comme valeur du champ _id
 * 
 * Cette classe permet d'interpréter les String vides comme des champs NULL, laissant ainsi
 * MongoDB générer seul l'ObjectId
 */

@Configuration
public class JacksonConfiguration {
	@Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper()
                .enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT );
    }
}
