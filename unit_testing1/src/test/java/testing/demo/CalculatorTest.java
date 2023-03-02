package testing.demo;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    @Disabled
    void test_add_small_numbers() {
        // arrange
        Calculator calc = new Calculator();
        int a = 3;
        int b = 4;

        // act
        int expected = 7;
        int actual = calc.add(a, b);

        // assert
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void test_sub_small_numbers() {
        // arrange
        Calculator calc = new Calculator();
        int a = 3;
        int b = 4;

        // act
        int expected = -1;
        int actual = calc.sub(a, b);

        // assert
        Assertions.assertEquals(expected, actual);
    }
}
