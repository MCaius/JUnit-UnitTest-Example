package org.example;

import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Square Root Tests")
public class SquareRootTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @ParameterizedTest
    @CsvSource({
            "4.0, 2.0",
            "9.0, 3.0",
            "16.0, 4.0",
            "0.0, 0.0",
            "-4.0, 2.0",  // sqrt(-4) should be sqrt(4) due to abs() implementation
            "-9.0, 3.0"   // sqrt(-9) should be sqrt(9)
    })
    @DisplayName("Square Root Calculation")
    void testSqrt(double input, double expected) {
        assertEquals(expected, calculator.sqrt(input), 0.001);
    }

    @AfterEach
    void tearDown() {
        System.out.println("Square Root test completed.");
    }
}
