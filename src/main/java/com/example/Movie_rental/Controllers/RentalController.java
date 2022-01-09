package com.example.Movie_rental.Controllers;


import com.example.Movie_rental.Entities.Movie;
import com.example.Movie_rental.Entities.Rental;
import com.example.Movie_rental.Services.RentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/Movie-Rental/Rental")
public class RentalController {

    private RentalService rentalService;

    @Autowired
    public RentalController(RentalService rentalService){
        this.rentalService = rentalService;
    }

    public List<Rental> getRentals(){
        return rentalService.getRentals();
    }

    @GetMapping("/getRentalById")
    public Rental getRentalById(Long id){
        return rentalService.getRentalById(id);
    }

    @PostMapping("/addOrUpdateRental")
    public ResponseEntity<Rental> addOrUpdate(@RequestBody Rental rental){
        Rental rentals = null;
        try{

            rentals = rentalService.addOrUpdateRental(rental);

        }catch (Exception ex){
            ex.getMessage();
        }
        return new ResponseEntity<Rental>(rental, HttpStatus.OK);
    }

    @DeleteMapping("/deleteRental")
    public Rental deleteRental(Long id) throws Exception{
        return rentalService.deleteRental(id);
    }

    @GetMapping("/allRentals")
    public ResponseEntity<List<Rental>> getAllRental(){
        List<Rental> rentals = null;
        try{

            rentals = rentalService.getRentals();

        }catch (Exception ex){
            ex.getMessage();
        }
        return new ResponseEntity<List<Rental>>(rentals, HttpStatus.OK);
    }

}
