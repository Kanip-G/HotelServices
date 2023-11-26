package com.acks.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity(name="Rating")
public class Rating {
	
		@Id
		private String ratingId;
		private String userId;
		private String hotelId;
		private int rating;
		private String feedBack;
}
