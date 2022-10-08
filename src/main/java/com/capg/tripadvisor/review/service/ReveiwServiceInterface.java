package com.capg.tripadvisor.review.service;

import java.util.List;

import com.capg.tripadvisor.review.entity.Review;
import com.capg.tripadvisor.review.mapstruct.dto.ReviewDto;

public interface ReveiwServiceInterface {
	
	ReviewDto createReview(Review review);
	
	ReviewDto updateReview(Review review);
	
	String deleteReview(long id);
	
	List<ReviewDto> getAllReview();
	
	ReviewDto getReviewById(long id);
	
}
