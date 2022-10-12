package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.FizzBuzz;

class FizzBuzzTest {

	FizzBuzz fb ;
	
	@BeforeEach
	void setUp() throws Exception {
		fb = new FizzBuzz();
	}
	
	@Test
	@DisplayName("Input = 1, Expected Result = 1")
	void testfb_1() {
        String testfb = fb.anotherFizzBuzz(1);
        assertEquals("1", testfb);   
    }
	
	@Test
	@DisplayName("Input = 2, Expected Result = 2")
	void testfb_2() {
        String testfb = fb.anotherFizzBuzz(2);
        assertEquals("2", testfb);   
    }
	
	@Test
	@DisplayName("Input = 3, Expected Result = Fizz")
	void testfb_3() {
        String testfb = fb.anotherFizzBuzz(3);
        assertEquals("Fizz", testfb);   
    }
	
	@Test
	@DisplayName("Input = 5, Expected Result = Buzz")
	void testfb_4() {
        String testfb = fb.anotherFizzBuzz(5);
        assertEquals("Buzz", testfb);   
    }

	@Test
	@DisplayName("Input = 15, Expected Result = FizzBuzz")
	void testfb_5() {
        String testfb = fb.anotherFizzBuzz(15);
        assertEquals("FizzBuzz", testfb);   
    }
	
}
