package com.example.Movie_rental.Services;

import com.example.Movie_rental.Entities.Movie;
import com.example.Movie_rental.Interfaces.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> getMovies(){
        return (List<Movie>) movieRepository.findAll();
    }

    public Movie getMovieById(Long id) {
        return movieRepository.findById(id).orElse(null);
    }

    public Movie addOrUpdateMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    public Movie deleteMovie(Long id) throws Exception {
        Movie deleteMovie = null;
        try{

            deleteMovie = movieRepository.findById(id).orElse(null);
            if (deleteMovie == null)
            {
                throw new Exception("Movie does not exist");
            }else{
                movieRepository.deleteById(id);
            }

        } catch (Exception ex){
            throw ex;
        }
        return deleteMovie;
    }

}
