package org.example;

import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Sine Function Tests")
public class SinTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @ParameterizedTest
    @CsvSource({
            "0, 0",
            "90, 1",
            "180, 0",
            "270, -1",
            "360, 0"
    })
    @DisplayName("Sin function values")
    void testSin(double degrees, double expected) {
        assertEquals(expected, calculator.sin(Math.toRadians(degrees)), 0.001);
    }

    @AfterEach
    void tearDown() {
        System.out.println("Sine test completed.");
    }
}
