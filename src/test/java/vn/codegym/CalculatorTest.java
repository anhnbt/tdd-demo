package vn.codegym;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (anhnb (anhnbt.it@gmail.com))
 * Date: 2024/09/18
 * Time: 14:09
 */
class CalculatorTest {

    @org.junit.jupiter.api.Test
    void add1and1() {
        int result = Calculator.add(1, 1);
        assertEquals(2, result);
    }

    @org.junit.jupiter.api.Test
    void add2and2() {
        int result = Calculator.add(2, 2);
        assertEquals(4, result);
    }

    @org.junit.jupiter.api.Test
    void add2sub2() {
        int result = Calculator.sub(2, 2);
        assertEquals(0, result);
    }
}