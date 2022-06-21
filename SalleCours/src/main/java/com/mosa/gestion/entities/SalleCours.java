package com.mosa.gestion.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class SalleCours {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idSalleCours;
	@NotNull
	public String clubConcerne;
	@NotNull
	public String activite;
	public Long getIdSalleCours() {
		return idSalleCours;
	}
	public SalleCours(String clubConcerné, String activité) {
		super();
		this.clubConcerne = clubConcerné;
		this.activite = activité;
	}
	public SalleCours() {
		super();
	}
	public void setIdSalleCours(Long idSalleCours) {
		this.idSalleCours = idSalleCours;
	}
	public String getClubConcerne() {
		return clubConcerne;
	}
	public void setClubConcerne(String clubConcerné) {
		this.clubConcerne = clubConcerné;
	}
	public String getActivite() {
		return activite;
	}
	public void setActivite(String activité) {
		this.activite = activité;
	}
	@Override
	public String toString() {
		return "SalleCours [idSalleCours=" + idSalleCours + ", clubConcerné=" + clubConcerne + ", activité=" + activite + "]";
	}
	
	
	

}
