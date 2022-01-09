package com.example.Movie_rental.Entities;

import javax.persistence.*;


@Entity
@Table(name = "movies")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idmovies")
    private Long id;

    @Column(name = "movie_name")
    private String name;

    @Column(name = "quantity")
    private int cantitate;

    @Column(name = "price")
    private int pret;

    @Column(name = "description")
    private String descriere;

    public Movie() {

    }

    public Movie(String name, int cantitate, int pret, String descriere) {
        this.name = name;
        this.cantitate = cantitate;
        this.pret = pret;
        this.descriere = descriere;
    }

    public Movie(Long id, String name, int cantitate, int pret, String descriere) {
        this.id = id;
        this.name = name;
        this.cantitate = cantitate;
        this.pret = pret;
        this.descriere = descriere;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCantitate() {
        return cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cantitate=" + cantitate +
                ", pret=" + pret +
                ", descriere='" + descriere + '\'' +
                '}';
    }
}
