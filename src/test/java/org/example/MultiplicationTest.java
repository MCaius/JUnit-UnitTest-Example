package org.example;

import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Multiplication Tests")
public class MultiplicationTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @ParameterizedTest
    @CsvSource({
            "2, 3, 6",
            "-2, 3, -6",
            "0, 5, 0"
    })
    @DisplayName("Multiplication of two long numbers")
    void testMultLong(long a, long b, long expected) {
        assertEquals(expected, calculator.mult(a, b));
    }

    @AfterEach
    void tearDown() {
        System.out.println("Multiplication test completed.");
    }
}
