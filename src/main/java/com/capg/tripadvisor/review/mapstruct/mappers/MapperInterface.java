package com.capg.tripadvisor.review.mapstruct.mappers;


import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import com.capg.tripadvisor.review.entity.Review;
import com.capg.tripadvisor.review.mapstruct.dto.ReviewDto;


@Mapper(componentModel="spring")
public interface MapperInterface {

	MapperInterface INSTANCE = Mappers.getMapper(MapperInterface.class);
	
	@Mapping(source="id",target="id")
	ReviewDto ReviewtoReviewDao(Review review);
	
	@Mapping(source="id",target="id")
	Review ReviewDaotoReview(ReviewDto reviewDao);
	
	@Mapping(source="id",target="id")
	List<ReviewDto> ReviewListToReviewDtoList(List<Review> reviewList);
	
	@Mapping(source="id",target="id")
	List<Review> ReviewDtoListToReviewList(List<ReviewDto> reviewDtoList);
    	
}

