package com.devssuperior.DSmovie.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_score")

public class Score {
	
	@EmbeddedId
	private ScorePK id = new ScorePK();
		
	private Double valure;

	public Score() {
	}
	
	public void setMovie(Movie movie) {
		id.setMovie(movie);
	}
	
	public void setUser(User user) {
		id.setUser(user);
	}

	public ScorePK getId() {
		return id;
	}

	public void setId(ScorePK id) {
		this.id = id;
	}

	public Double getValure() {
		return valure;
	}

	public void setValure(Double valure) {
		this.valure = valure;
	}
	
}
