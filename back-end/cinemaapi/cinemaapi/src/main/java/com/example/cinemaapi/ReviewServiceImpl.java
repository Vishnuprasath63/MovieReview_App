package com.example.cinemaapi;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewServiceImpl implements ReviewService{

	@Autowired
	public ReviewRepository repo;
	
	@Autowired
	public MovieRepository repo2;
	
	@Override
	public Reviews addReview(String string, String string2) {
		Reviews obj=new Reviews();
		obj.setBody(string);
		
		Reviews saved = repo.save(obj);
		
		Optional<Movie> findById = repo2.findById(Long.parseLong(string2));
		Movie movie = findById.get();
		
		List<Reviews> reviews = movie.getReviews();
		reviews.add(saved);
		
		repo2.save(movie);
		
		return saved;
	}

	@Override
	public String delete(Long id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		return "deleted successfully";	}

}
