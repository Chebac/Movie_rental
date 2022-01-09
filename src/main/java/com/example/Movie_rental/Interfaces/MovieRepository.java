package com.example.Movie_rental.Interfaces;

import com.example.Movie_rental.Entities.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Movie, Long> {
}
