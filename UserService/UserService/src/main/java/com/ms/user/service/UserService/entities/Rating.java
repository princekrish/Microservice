package com.ms.user.service.UserService.entities;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Rating {

	private String rating_id;
	private String userid;
	private String hotelId;
	private int rating;
	private String feedback;
	
}
