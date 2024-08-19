package com.example.cinemaapi;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService{

	@Autowired
	public MovieRepository repo;
	
	@Override
	public Movie addMovie(Movie obj) {
		return repo.save(obj);
	}

	@Override
	public List<Movie> getAllMovie() {
		
		return repo.findAll();
	}

	@Override
	public Optional<Movie> getMovieById(Long id) {
		
		return repo.findById(id);
	}

	@Override
	public List<Movie> getMovieByName(String name) {
		return repo.findByTitleLike("%"+name+"%");
	}

}
