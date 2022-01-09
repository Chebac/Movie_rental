package com.example.Movie_rental.Mappers;

import com.example.Movie_rental.Dtos.CustomerDto;
import com.example.Movie_rental.Entities.Customer;

public class CustomerMapper {
    public CustomerDto toDo(Customer customer){
        CustomerDto customerDto = new CustomerDto();
        customerDto.id = customer.getId();
        customerDto.adresa = customer.getAdresa();
        customerDto.nume = customer.getNume();
        customerDto.prenume = customer.getPrenume();
        customerDto.varsta = customer.getVarsta();
        return customerDto;
    }
}
