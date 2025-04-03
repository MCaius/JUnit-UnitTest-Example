package org.example;

import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Division Tests")
public class DivisionTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @ParameterizedTest
    @CsvSource({
            "10, 2, 5",
            "9, 3, 3",
            "-6, 2, -3",
            "0, 5, 0"
    })
    @DisplayName("Division of two long numbers")
    void testDivLong(long a, long b, long expected) {
        assertEquals(expected, calculator.div(a, b));
    }

    @ParameterizedTest
    @CsvSource({
            "10.5, 2.0, 5.25",
            "9.9, 3.3, 3.0",
            "-6.6, 2.2, -3.0",
            "0.0, 5.5, 0.0"
    })
    @DisplayName("Division of two double numbers")
    void testDivDouble(double a, double b, double expected) {
        assertEquals(expected, calculator.div(a, b), 0.001);
    }

    @Test
    @DisplayName("Division by Zero should throw exception")
    void testDivByZero() {
        Exception exception = assertThrows(NumberFormatException.class, () -> calculator.div(5, 0));
        assertEquals("Attempt to divide by zero", exception.getMessage());
    }

    @AfterEach
    void tearDown() {
        System.out.println("Division test completed.");
    }
}
