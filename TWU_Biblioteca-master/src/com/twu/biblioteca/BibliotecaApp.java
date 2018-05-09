package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.HashMap;

public class BibliotecaApp {

    HashMap<String,Movie> movies = new HashMap<String, Movie>();
    public void ListMovies(){
        System.out.println("name\tyear\tdirector\trating");
        for (Movie m:movies.values()) {
           System.out.println(m.getName()+"\t"+m.getYear()
                   +"\t"+m.getDirector()+"\t"+m.getRating());
        }
    }

    public void CheckoutMovie(String name,User user){
        if (movies.containsKey(name)){
            Movie m = movies.get(name);
            if (m.getCheckout().equals("")){
                m.setCheckout(user.getName());
                movies.put(m.getName(),m);
                System.out.println("check out success");
            }else{
                System.out.println("the movie has been checked out");
            }

        }else{
            System.out.println("the movie is not found");
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }
}
