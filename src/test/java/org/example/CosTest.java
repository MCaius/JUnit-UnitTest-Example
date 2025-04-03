package org.example;

import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Cosine Function Tests")
public class CosTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @ParameterizedTest
    @CsvSource({
            "0, 1",
            "90, 0",
            "180, -1",
            "270, 0",
            "360, 1"
    })
    @DisplayName("Cos function values")
    void testCos(double degrees, double expected) {
        assertEquals(expected, calculator.cos(Math.toRadians(degrees)), 0.001);
    }

    @AfterEach
    void tearDown() {
        System.out.println("Cosine test completed. " +
                "The test fails because of incorrect implementation in the Calcualtor class at line 65 " +
                " | return Math.sin(a); is Incorrect! Should be Math.cos(a)");
    }
}
