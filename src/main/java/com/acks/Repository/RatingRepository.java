package com.acks.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acks.Entities.Rating;

public interface RatingRepository extends JpaRepository<Rating, String> {
	
	List<Rating> findByUserId(String userId);
	List<Rating> findByHotelId(String hotelId);
}
