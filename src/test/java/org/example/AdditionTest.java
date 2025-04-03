package org.example;

import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Addition Tests")
public class AdditionTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/AdditionTestLongNumber.csv")
    @DisplayName("Sum of two long numbers")
    void testSumLong(long a, long b, long expected) {
        assertEquals(expected, calculator.sum(a, b));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/AdditionTestDoubleNumber.csv")
    @DisplayName("Sum of two double numbers")
    void testSumDouble(double a, double b, double expected) {
        assertEquals(expected, calculator.sum(a, b), 0.001);
    }

    @AfterEach
    void tearDown() {
        System.out.println("Addition test completed.");
    }
}
