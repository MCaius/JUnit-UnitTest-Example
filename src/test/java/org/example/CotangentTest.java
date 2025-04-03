package org.example;

import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Cotangent Function Tests")
public class CotangentTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @ParameterizedTest
    @CsvSource({
            "0, 0",
            "1, 0.7616",
            "2, 0.964",
            "3, 0.9950"
    })
    @DisplayName("Cotangent function values")
    void testCotangent(double input, double expected) {
        assertEquals(expected, calculator.ctg(input), 0.001);
    }

    @AfterEach
    void tearDown() {
        System.out.println("Cotangent test completed.");
    }
}
