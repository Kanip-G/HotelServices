package com.acks.Impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acks.Entities.Rating;
import com.acks.Repository.RatingRepository;
import com.acks.Services.RatingServices;

@Service
public class RatingServicesImpl implements RatingServices {
	
	@Autowired
	private RatingRepository ratingRepository;
	
	@Override
	public Rating createRating(Rating rating) {
		// TODO Auto-generated method stub
		String ratingId = UUID.randomUUID().toString();
		rating.setRatingId(ratingId);
		Rating save = ratingRepository.save(rating);
		return save;
	}

	@Override
	public List<Rating> getAllRating() {
		// TODO Auto-generated method stub
		return ratingRepository.findAll();
	
	}

	@Override
	public List<Rating> getRatingsByUserId(String userId) {
		// TODO Auto-generated method stub
		return ratingRepository.findByUserId(userId);
	} 

	@Override
	public List<Rating> getRatingByHotelId(String hotelId) {
		// TODO Auto-generated method stub
		return ratingRepository.findByHotelId(hotelId);
	}

}
