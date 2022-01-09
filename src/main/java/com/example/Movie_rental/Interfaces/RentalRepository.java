package com.example.Movie_rental.Interfaces;

import com.example.Movie_rental.Entities.Rental;
import org.springframework.data.repository.CrudRepository;

public interface RentalRepository extends CrudRepository<Rental, Long> {
}
