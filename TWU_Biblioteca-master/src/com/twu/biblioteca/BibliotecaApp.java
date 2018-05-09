package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.HashMap;

public class BibliotecaApp {

    HashMap<String,Movie> movies = new HashMap<String, Movie>();
    HashMap<String,User> users = new HashMap<String, User>();


    public void login(String id){
        if (users.containsKey(id)){
            User user = users.get(id);
            if (user.isCustomer()){
                showUserInformation(user);
            }else{
                ListMoviesHasBeenCheckedOut();
            }
        }else{
            System.out.println("user not found");
        }
    }
    public void showUserInformation(User user){
        System.out.println(
                "name\n"+user.getName()+"\n"
                +"email address\n"+user.getEmail()+"\n"
                +"phone number\n" + user.getPhone()+"\n"
        );
    }

    public void ListMoviesHasBeenCheckedOut(){
        System.out.println("name\tcheck out");
        for (Movie m:movies.values()){
            if (!m.getCheckout().equals("")){
                System.out.println(m.getName()+"\t"+m.getCheckout());
            }
        }
    }
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
