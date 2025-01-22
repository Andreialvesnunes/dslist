package com.devsuperior.dslits.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "tb_name")
public class Game {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	private String title;
	@Column(name = "game_year")
	private Integer year;
	private String genre;
	private String plataforms;
	private Double score;
	private String imageUrl;
	@Column(columnDefinition = "TEXT")
	private String shorDescription;
	@Column(columnDefinition = "TEXT")
	private String longDescription;
	
	public Game() {
		
	}

	public Game(Long id, String title, Integer year, String genre, String plataforms, String imageUrl,
			String shorDescription, String longDescription, Double score) {
		super();
		this.id = id;
		this.title = title;
		this.year = year;
		this.genre = genre;
		this.plataforms = plataforms;
		this.imageUrl = imageUrl;
		this.shorDescription = shorDescription;
		this.longDescription = longDescription;
		this.score = score;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPlataform() {
		return plataforms;
	}

	public void setPlataform(String plataforms) {
		this.plataforms = plataforms;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getShorDescription() {
		return shorDescription;
	}

	public void setShorDescription(String shorDescription) {
		this.shorDescription = shorDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Game other = (Game) obj;
		return Objects.equals(id, other.id);
	}

	
	
	
}
