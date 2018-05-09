package com.twu.biblioteca;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ExampleTest {

    private BibliotecaApp bibliotecaApp;

    @Before
    public void setup(){
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
//        bibliotecaApp.movies.put()
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
    public void testCheckoutMovie(){

    }

}
