package org.example;

import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Positivity Tests")
public class PositivityTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @ParameterizedTest
    @ValueSource(longs = {1, 100, 9999})
    @DisplayName("Check if a number is positive")
    void testIsPositive(long number) {
        assertTrue(calculator.isPositive(number));
    }

    @Test
    @DisplayName("Zero should not be positive")
    void testZero() {
        assertFalse(calculator.isPositive(0));
    }

    @AfterEach
    void tearDown() {
        System.out.println("Positivity test completed.");
    }
}
