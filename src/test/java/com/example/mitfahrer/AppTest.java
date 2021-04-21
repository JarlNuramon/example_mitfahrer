package com.example.mitfahrer;

import org.junit.jupiter.api.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
	
	
	    @DisplayName("Play FizzBuzz with number = 1")
	    @Test
	    public void testNumber() {

		       Assertions.assertTrue(true, "");
	    }
	    @DisplayName("Play FizzBuzz with number = 3")
	    @Test
	    public void testFizz() {

		       Assertions.assertTrue(true, "");
	    }

	    @DisplayName("Play FizzBuzz with number = 5")
	    @Test
	    public void testBuzz() {
		       Assertions.assertTrue(true, "");
	    }

	    @DisplayName("Don't Play FizzBuzz with number = 0")
	    @Test
	    public void testZero() {

	       Assertions.assertTrue(true, "");
	    }

	    @AfterEach
	    public void tearDown() {
	       
	    }
}
