package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ScientificCalculatorTest {
    private ScientificCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new ScientificCalculator();
        System.out.println("Teste Feito!");
    }

    @Test
    void testCalcular() {
        //execution-execução do método que esta sendo testado
        double result = calculator.add(2,3);

        //assertion-verificação se o resultado é o esperado
        assertEquals(5, result);

        // teardown
    }
@Test
    void testSubtract() {
        /*execution-execução do metodo que esta sendo testado*/
        double result = calculator.subtract(2,1);
        /*assertion-verificação se o resultado é o esperado*/
        assertEquals(1, result);
    }
}
