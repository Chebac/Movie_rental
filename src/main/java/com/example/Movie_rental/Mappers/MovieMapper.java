package com.example.Movie_rental.Mappers;


import com.example.Movie_rental.Dtos.MovieDto;
import com.example.Movie_rental.Entities.Movie;

public class MovieMapper {
    public MovieDto toDo(Movie movie){
        MovieDto movieDto = new MovieDto();
        movieDto.id = movie.getId();
        movieDto.cantitate = movie.getCantitate();
        movieDto.name = movie.getName();
        movieDto.pret = movie.getPret();
        movieDto.descriere = movie.getDescriere();
        return movieDto;
    }
}
