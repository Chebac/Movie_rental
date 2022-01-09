package com.example.Movie_rental.Services;

import com.example.Movie_rental.Entities.Rental;
import com.example.Movie_rental.Interfaces.RentalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentalService {

    @Autowired
    private RentalRepository rentalRepository;

    public List<Rental> getRentals(){
        return (List<Rental>) rentalRepository.findAll();
    }

    public Rental getRentalById(Long id) {
        return rentalRepository.findById(id).orElse(null);
    }

    public Rental addOrUpdateRental(Rental Rental) {
        return rentalRepository.save(Rental);
    }

    public Rental deleteRental(Long id) throws Exception {
        Rental deleteRental = null;
        try{

            deleteRental = rentalRepository.findById(id).orElse(null);
            if (deleteRental == null)
            {
                throw new Exception("Rental does not exist");
            }else{
                rentalRepository.deleteById(id);
            }

        } catch (Exception ex){
            throw ex;
        }
        return deleteRental;
    }

}
