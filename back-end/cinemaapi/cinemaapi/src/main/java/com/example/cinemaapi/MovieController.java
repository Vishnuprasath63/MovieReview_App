package com.example.cinemaapi;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api/cinema")
public class MovieController {

	@Autowired
	public MovieService service;
	
	@PostMapping("/addmovie")
	public Movie addMovie(@RequestBody  Movie obj) {
		return service.addMovie(obj);
	}
	
	@GetMapping("/getallmovie")
	public List<Movie> getAllMovie() {
		return service.getAllMovie();
	}
	
	@GetMapping("/getbyid/{id}")
	public Optional<Movie> getMovieById(@PathVariable("id") Long id) {
		return service.getMovieById(id);
	}
	
	@GetMapping("/getbyname/{name}")
	public List<Movie> getMovieByName(@PathVariable("name") String name) {
		return service.getMovieByName(name);
	}
	
	
	
}
