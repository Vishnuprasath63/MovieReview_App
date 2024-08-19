package com.example.cinemaapi;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name = "movie")
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String releaseDate;
	private String poster;
	private String trailerLink;
	private List<String> genres;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Reviews> reviews;

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

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getPoster() {
		return poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}

	public String getTrailerLink() {
		return trailerLink;
	}

	public void setTrailerLink(String trailerLink) {
		this.trailerLink = trailerLink;
	}

	public List<String> getGenres() {
		return genres;
	}

	public void setGenres(List<String> genres) {
		this.genres = genres;
	}

	public List<Reviews> getReviews() {
		return reviews;
	}

	public void setReviews(List<Reviews> reviews) {
		this.reviews = reviews;
	}

	public Movie(Long id, String title, String releaseDate, String poster, String trailerLink, List<String> genres,
			List<Reviews> reviews) {
		super();
		this.id = id;
		this.title = title;
		this.releaseDate = releaseDate;
		this.poster = poster;
		this.trailerLink = trailerLink;
		this.genres = genres;
		this.reviews = reviews;
	}

	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

}
