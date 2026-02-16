package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ScientificCalculatorTest {

    private ScientificCalculator calculator;

    // Executado antes de cada teste (Test Fixture)
    @BeforeEach
    void setUp() {
        calculator = new ScientificCalculator();

    }


    // Testes de Operações Aritméticas
    @Test
    void shouldReturnCorrectSumWhenAddingTwoNumbers() {
        double result = calculator.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    void shouldReturnCorrectDifferenceWhenSubtractingTwoNumbers() {
        double result = calculator.subtract(2, 1);
        assertEquals(1, result);
    }

    @Test
    void shouldReturnCorrectProductWhenMultiplyingTwoNumbers() {
        double result = calculator.multiply(2, 3);
        assertEquals(6, result);
    }

    @Test
    void shouldReturnCorrectQuotientWhenDividingTwoNumbers() {
        double result = calculator.divide(8, 2);
        assertEquals(4, result);
    }


    // Testes de Potência e Raiz
    @Test
    void shouldReturnCorrectPowerWhenBaseAndExponentAreValid() {
        double result = calculator.power(2, 3);
        assertEquals(8, result);
    }

    @Test
    void shouldReturnCorrectSquareRootWhenNumberIsPositive() {
        double result = calculator.squareRoot(9);
        assertEquals(3.0, result);
    }

    @Test
    void shouldThrowExceptionWhenSquareRootIsNegative() {
        assertThrows(IllegalArgumentException.class,
                () -> calculator.squareRoot(-6));
    }


    // Testes de Cenários de Exceção
    @Test
    void shouldThrowExceptionWhenDividingByZero() {
        assertThrows(IllegalArgumentException.class,
                () -> calculator.divide(10, 0));
    }


    // Testes de Funções Logarítmicas e Trigonométricas
    @Test
    void shouldReturnOneWhenCalculatingLogOfE() {
        double result = calculator.log(Math.E);
        assertEquals(1.0, result, 0.0001);
    }

    @Test
    void shouldReturnOneWhenCalculatingSinOf90Degrees() {
        double result = calculator.sin(90);
        assertEquals(1.0, result, 0.0001);
    }
}
