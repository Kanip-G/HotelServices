package com.acks.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.acks.Entities.Rating;
import com.acks.Services.RatingServices;

@RestController
@RequestMapping("/ratings")
public class RatingController {
	
	@Autowired
	private RatingServices ratingServices;
	
	//get Rating 
	@PostMapping("/create")
	public ResponseEntity<Rating> createRating(@RequestBody Rating rating){
		return ResponseEntity.status(HttpStatus.CREATED).body(ratingServices.createRating(rating));
	}
	
	//get All Rating 
	@GetMapping
	public ResponseEntity<List<Rating>> getAllRating(){
		return ResponseEntity.ok(ratingServices.getAllRating());
	}
	
	@GetMapping("/users/{userId}")
	public ResponseEntity<List<Rating>> getRatingByUserId(@PathVariable String userId){
		return ResponseEntity.ok(ratingServices.getRatingsByUserId(userId));
	}
	
	@GetMapping("/hotel/{hotelId}")
	public ResponseEntity<List<Rating>> getRatingByHotelId(@PathVariable String hotelId){
		return ResponseEntity.ok(ratingServices.getRatingByHotelId(hotelId));
	}
}
