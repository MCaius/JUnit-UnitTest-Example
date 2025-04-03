package org.example;

import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Negativity Tests")
public class NegativityTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @ParameterizedTest
    @ValueSource(longs = {-1, -100, -9999})
    @DisplayName("Check if a number is negative")
    void testIsNegative(long number) {
        assertTrue(calculator.isNegative(number));
    }

    @Test
    @DisplayName("Zero should not be negative")
    void testZero() {
        assertFalse(calculator.isNegative(0));
    }

    @AfterEach
    void tearDown() {
        System.out.println("Negativity test completed.");
    }
}
