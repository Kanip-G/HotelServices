package com.acks.Services;

import java.util.List;

import com.acks.Entities.Rating;

public interface RatingServices {
	
	//craete
	Rating createRating(Rating rating);
	
	//get all
	List<Rating> getAllRating();
	
	//get by UserID 
	List<Rating> getRatingsByUserId(String userId);
	
	//get By Hotel
	List<Rating> getRatingByHotelId(String hotelId);
	
}
