package com.example.Movie_rental.Controllers;


import com.example.Movie_rental.Entities.Movie;
import com.example.Movie_rental.Services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/Movie-Rental/Movie")
public class MovieController {

    private MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService){
        this.movieService = movieService;
    }

    public List<Movie> getMovies(){
        return movieService.getMovies();
    }

    @GetMapping("/getMovieById")
    public Movie getMovieById(Long id){
        return movieService.getMovieById(id);
    }

    @PostMapping("/addOrUpdateMovie")
    public ResponseEntity<Movie> addOrUpdate(@RequestBody Movie movie){
        Movie movies = null;
        try{

            movies = movieService.addOrUpdateMovie(movie);

        }catch (Exception ex){
            ex.getMessage();
        }
        return new ResponseEntity<Movie>(movie, HttpStatus.OK);
    }

    @DeleteMapping("/deleteMovie")
    public Movie deleteMovie(Long id) throws Exception{
        return movieService.deleteMovie(id);
    }

    @GetMapping("/allMovies")
    public ResponseEntity<List<Movie>> getAllMovie(){
        List<Movie> movies = null;
        try{

            movies = movieService.getMovies();

        }catch (Exception ex){
            ex.getMessage();
        }
        return new ResponseEntity<List<Movie>>(movies, HttpStatus.OK);
    }

}
