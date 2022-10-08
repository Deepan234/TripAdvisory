package com.capg.tripadvisor.review.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.tripadvisor.review.entity.Review;
import com.capg.tripadvisor.review.mapstruct.dto.ReviewDto;
import com.capg.tripadvisor.review.repo.ReviewRepository;
import com.capg.tripadvisor.review.mapstruct.mappers.MapperInterface;

@Service("Review Service")
public class ReviewServiceImpl implements ReveiwServiceInterface {
	
	@Autowired
	ReviewRepository reviewRepo;
	
	

	@Override
	public ReviewDto createReview(Review review) {
		Review reviews = reviewRepo.save(review);
		return MapperInterface.INSTANCE.ReviewtoReviewDao(reviews);
	}

	@Override
	public ReviewDto updateReview(Review review) {
		Review fetchReview = reviewRepo.findById(review.getId()).orElse(null);
		fetchReview.setComments(review.getComments());
		fetchReview.setName(review.getName());
		fetchReview.setRating(review.getRating());
		Review reviews = reviewRepo.save(fetchReview);
		return MapperInterface.INSTANCE.ReviewtoReviewDao(reviews);
	}

	@Override
	public String deleteReview(long id) {
		// TODO Auto-generated method stub
	   Review reviews = reviewRepo.findById(id).orElse(null);
	   reviewRepo.delete(reviews);
	   return "Account is Deleted";
	}

	@Override
	public List<ReviewDto> getAllReview() {
		// TODO Auto-generated method stub
		List<Review> reviewList = reviewRepo.findAll();
		return MapperInterface.INSTANCE.ReviewListToReviewDtoList(reviewList);
	}

	@Override
	public ReviewDto getReviewById(long id) {
		// TODO Auto-generated method stub
		Review review = reviewRepo.findById(id).orElse(null);
		return MapperInterface.INSTANCE.ReviewtoReviewDao(review);
	}

}
