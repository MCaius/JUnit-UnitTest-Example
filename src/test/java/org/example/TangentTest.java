package org.example;

import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Tangent Function Tests")
public class TangentTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @ParameterizedTest
    @CsvSource({
            "0, 0",
            "45, 1",
            "135, -1",
            "225, 1",
            "315, -1"
    })
    @DisplayName("Valid Tangent function values")
    void testValidTangent(double degrees, double expected) {
        assertEquals(expected, calculator.tg(Math.toRadians(degrees)), 0.001);
    }

    @ParameterizedTest
    @CsvSource({
            "90",
            "270"
    })
    @DisplayName("Tangent function undefined cases")
    void testUndefinedTangent(double degrees) {
        assertTrue(Double.isNaN(calculator.tg(Math.toRadians(degrees))),
                "Tangent should be undefined (NaN) for 90° and 270°");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Tangent test completed." +
                "The test fails because incorrect implementation of the Calculator.class" +
                " | cos(a) should return cosine, but in Calculator.java, cos() actually calls sin() ");
    }
}
