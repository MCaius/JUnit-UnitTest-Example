package org.example;

import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Subtraction Tests")
public class SubtractionTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @ParameterizedTest
    @CsvSource({
            "10, 5, 5",
            "0, 3, -3",
            "-4, -2, -2"
    })
    @DisplayName("Subtraction of two long numbers")
    void testSubLong(long a, long b, long expected) {
        assertEquals(expected, calculator.sub(a, b));
    }

    @ParameterizedTest
    @CsvSource({
            "5.5, 1.5, 4.0",
            "-3.3, -2.2, -1.1"
    })
    @DisplayName("Subtraction of two double numbers")
    void testSubDouble(double a, double b, double expected) {
        assertEquals(expected, calculator.sub(a, b), 0.001);
    }

    @AfterEach
    void tearDown() {
        System.out.println("Subtraction test completed.");
    }
}
