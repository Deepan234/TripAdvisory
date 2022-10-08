package com.capg.tripadvisor.review.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capg.tripadvisor.review.entity.Review;
import com.capg.tripadvisor.review.mapstruct.dto.ReviewDto;
import com.capg.tripadvisor.review.mapstruct.mappers.MapperInterface;
import com.capg.tripadvisor.review.service.ReveiwServiceInterface;



@RestController
@RequestMapping("/review")
public class ReviewController {
	
	@Autowired
	ReveiwServiceInterface reviewService;
	
	@PostMapping("/add")
	public ResponseEntity<ReviewDto> createReview(@RequestBody ReviewDto reviewDto){
	    Review review = MapperInterface.INSTANCE.ReviewDaotoReview(reviewDto);
		ReviewDto createdReviewDto = reviewService.createReview(review);
		return new ResponseEntity<ReviewDto>(createdReviewDto,HttpStatus.OK);
	}
	
	
	@PutMapping("/update")
	public ResponseEntity<ReviewDto> updateReview(@RequestBody ReviewDto reviewDto){
	    Review review = MapperInterface.INSTANCE.ReviewDaotoReview(reviewDto);
		ReviewDto updatedReviewDto = reviewService.updateReview(review);
		return new ResponseEntity<ReviewDto>(updatedReviewDto,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete")
	public String DeleteReview(@RequestParam long Id) {
		String deletedMessage =  reviewService.deleteReview(Id);
		return deletedMessage;
	}
	
	@GetMapping("/findall")
	public List<ReviewDto> getAllReview(){
		List<ReviewDto> reviewList = reviewService.getAllReview();
		return reviewList;
	}
	
   @GetMapping("/getById")
   public ResponseEntity<ReviewDto>  getByIdReview(@RequestParam long id){
		ReviewDto updatedReviewDto = reviewService.getReviewById(id);
		return new ResponseEntity<ReviewDto>(updatedReviewDto,HttpStatus.OK);
	}
	

}
