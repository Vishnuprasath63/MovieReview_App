package com.example.cinemaapi;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api/reviews")
public class ReviewController {

	@Autowired
	public ReviewService service;
	
	@PostMapping("/addreview")
	public Reviews addReview(@RequestBody Map<String,String> map) {
		return service.addReview(map.get("body"),map.get("id"));
	}
	
	@GetMapping("/delete/{id}")
	public String deleteReviews(@PathVariable("id") Long id) {
		return service.delete(id);
	}
}
