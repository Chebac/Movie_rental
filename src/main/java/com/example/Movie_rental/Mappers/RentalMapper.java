package com.example.Movie_rental.Mappers;

import com.example.Movie_rental.Dtos.RentalDto;
import com.example.Movie_rental.Entities.Rental;

public class RentalMapper {
    public RentalDto toDo(Rental rental){
        RentalDto rentalDto = new RentalDto();
        rentalDto.id = rental.getId();
        rentalDto.idCustomer = rental.getidCustomer();
        rentalDto.idMovie = rental.getidMovie();
        rentalDto.startDate = rental.getStartDate();
        rentalDto.endDate = rental.getEndDate();
        return rentalDto;
    }
}
