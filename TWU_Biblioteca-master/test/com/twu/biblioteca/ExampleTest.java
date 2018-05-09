package com.twu.biblioteca;


import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ExampleTest {

    private BibliotecaApp bibliotecaApp;
    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();


    @Before
    public void setup(){
        System.setOut(new PrintStream(outContent));
        bibliotecaApp = new BibliotecaApp();
        bibliotecaApp.movies.put("name", new Movie("name"
                ,"2018-10-1","director","rating"));
        bibliotecaApp.movies.put("name2", new Movie("name2"
                ,"2018-10-2","director2","rating2"));

        Movie m = new Movie("name3"
                ,"2018-10-3","director3","rating3");
        m.setCheckout("user1");
        bibliotecaApp.movies.put("name3", m);
        bibliotecaApp.users.put("user1",new User("1","user1","email1","phone1"
                ,true));
        bibliotecaApp.users.put("user2",new User("2","user2","email2","phone2"
                ,true));


    }

    @Test
    public void test() {
        assertEquals(1, 1);
    }

    @Test
    public  void TestMovieModel() throws Exception{
        Movie  m = new Movie("name"
                ,"2018-10","director","rating");

        assertEquals(m.getName(),"name");
        assertEquals(m.getYear(),"2018-10");
        assertEquals(m.getDirector(),"director");
        assertEquals(m.getRating(),"rating");
        assertEquals(m.getCheckout(),"");

    }

    @Test
    public void TestUserModel() throws Exception{
        User u = new User("1","user1","email1","phone1"
        ,true);
        assertEquals(u.getId(),"1");
        assertEquals(u.getName(),"user1");
        assertEquals(u.getEmail(),"email1");
        assertEquals(u.getPhone(),"phone1");
        assertEquals(u.isCustomer(),true);
    }

    @Test
    public void TestShowUserInformation() throws Exception{
        User u = new User("1","user1","email1","phone1"
                ,true);
        bibliotecaApp.showUserInformation(u);
        assertTrue(outContent.toString().endsWith("name\nuser1\nemail address\nemail1\nphone number\nphone1\n"));

    }

    @Test
    public void TestListMoviesHasBeenCheckedOut() throws Exception{
        bibliotecaApp.ListMoviesHasBeenCheckedOut();
        assertTrue(outContent.toString().endsWith("name3\tuser1\n"));
    }

}
