package com.capg.tripadvisor.review.mapstruct.dto;

public class ReviewDto {
	
	private long id;

	private String name;
	
	private String rating;

	private String comments;
	
	

	public ReviewDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReviewDto(long id, String name, String rating, String comments) {
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
