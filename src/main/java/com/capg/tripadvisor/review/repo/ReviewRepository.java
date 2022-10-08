package com.capg.tripadvisor.review.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.tripadvisor.review.entity.Review;

public interface ReviewRepository  extends JpaRepository<Review,Long> {

}
