package vn.codegym;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (anhnb (anhnbt.it@gmail.com))
 * Date: 2024/09/18
 * Time: 14:27
 */
class FizzBuzzTest {

    @Test
    void testFizz() {
        assertEquals("Fizz", FizzBuzz.translate(3));
        assertEquals("Fizz", FizzBuzz.translate(9));
    }

    @Test
    void testBuzz() {
        assertEquals("Buzz", FizzBuzz.translate(5));
        assertEquals("Buzz", FizzBuzz.translate(10));
    }

    @Test
    void testFizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzz.translate(15));
        assertEquals("FizzBuzz", FizzBuzz.translate(30));
    }

    @Test
    void testAnyNumber() {
        assertEquals("1", FizzBuzz.translate(1));
        assertEquals("7", FizzBuzz.translate(7));
    }
}