package com.capg.tripadvisor.review.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Review {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@NotNull(message="Name Should not Left Null")
	private String name;
	
	@NotNull(message="Rating Should not Left Null")
	private String rating;

	@NotNull(message="Comments Should not Left Null")
	private String comments;

	
	public Review() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Review(long id, @NotNull(message = "Name Should not Left Null") String name,
			@NotNull(message = "Rating Should not Left Null") String rating,
			@NotNull(message = "Comments Should not Left Null") String comments) {
		super();
		this.id = id;
		this.name = name;
		this.rating = rating;
		this.comments = comments;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	
}
