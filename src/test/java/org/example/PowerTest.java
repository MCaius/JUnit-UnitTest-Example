package org.example;

import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Power Tests")
public class PowerTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @ParameterizedTest
    @CsvSource({
            "2, 3, 8",
            "5, 2, 25",
            "10, 0, 1"
    })
    @DisplayName("Power function")
    void testPow(double base, double exponent, double expected) {
        assertEquals(expected, calculator.pow(base, exponent), 0.001);
    }

    @AfterEach
    void tearDown() {
        System.out.println("Power test completed.");
    }
}
