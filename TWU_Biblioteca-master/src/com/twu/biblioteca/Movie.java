package com.twu.biblioteca;

public class Movie {

    private final String name;
    private final String year;
    private final String director;
    private final String rating;
    private String checkout;

    public Movie(String name, String year, String director, String rating){

        this.name = name;
        this.year = year;
        this.director = director;
        this.rating = rating;
        this.checkout = "";
    }

    public String getName() {
        return name;
    }

    public String getYear() {
        return year;
    }

    public String getDirector() {
        return director;
    }

    public String getRating() {
        return rating;
    }

    public String getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout){
        this.checkout = checkout;
    }
}
