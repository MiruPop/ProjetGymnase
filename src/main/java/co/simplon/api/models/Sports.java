package co.simplon.api.models;

import java.util.List;

public class Sports {
	private List<String> jouer;
	private List<String> arbitrer;
	private List<String> entrainer;

	public Sports() {
		super();
	}

	public List<String> getJouer() {
		return jouer;
	}

	public void setJouer(List<String> jouer) {
		this.jouer = jouer;
	}

	public List<String> getArbitrer() {
		return arbitrer;
	}

	public void setArbitrer(List<String> arbitrer) {
		this.arbitrer = arbitrer;
	}

	public List<String> getEntrainer() {
		return entrainer;
	}

	public void setEntrainer(List<String> entrainer) {
		this.entrainer = entrainer;
	}

}
