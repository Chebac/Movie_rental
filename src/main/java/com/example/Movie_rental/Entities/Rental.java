package com.example.Movie_rental.Entities;

import org.hibernate.annotations.Columns;

import javax.persistence.*;

@Entity
@Table(name = "rentals")
public class Rental {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idrentals")
    private Long id;

    @Column(name = "idmovies")
    private Long idMovie;

    @Column(name = "idcustomers")
    private Long idCustomer;

    @Column(name = "start_date")
    private String startDate;

    @Column(name = "end_date")
    private String endDate;

    public Rental() {

    }

    public Rental(Long idMovie, Long idCustomer, String startDate, String endDate) {
        this.idMovie = idMovie;
        this.idCustomer = idCustomer;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Rental(Long id, Long idMovie, Long idCustomer, String startDate, String endDate) {
        this.id = id;
        this.idMovie = idMovie;
        this.idCustomer = idCustomer;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getidMovie() {
        return idMovie;
    }

    public void setidMovie(Long idMovie) {
        this.idMovie = idMovie;
    }

    public Long getidCustomer() {
        return idCustomer;
    }

    public void setidCustomer(Long idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Rental{" +
                "id=" + id +
                ", idMovie='" + idMovie + '\'' +
                ", idCustomer='" + idCustomer + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
