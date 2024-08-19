package com.example.cinemaapi;

import java.util.List;
import java.util.Optional;

public interface MovieService {
public Movie addMovie(Movie obj);

public List<Movie> getAllMovie();

public Optional<Movie> getMovieById(Long id);

public List<Movie> getMovieByName(String name);
}
