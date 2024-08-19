package com.example.cinemaapi;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long>{

	List<Movie> findByTitleLike(String title);
}
