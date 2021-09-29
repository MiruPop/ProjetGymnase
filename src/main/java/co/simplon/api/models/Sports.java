package co.simplon.api.models;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Sports {
	@Field(name = "Jouer")
	private List<String> jouer;
	@Field(name = "Arbitrer")
	private List<String> arbitrer;
	@Field(name = "Entrainer")
	private List<String> entrainer;

}
