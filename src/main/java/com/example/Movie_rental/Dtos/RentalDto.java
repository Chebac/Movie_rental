package com.example.Movie_rental.Dtos;

import javax.persistence.Column;

public class RentalDto {
    public Long id;
    public Long idMovie;
    public Long idCustomer;
    public String startDate;
    public String endDate;
}
