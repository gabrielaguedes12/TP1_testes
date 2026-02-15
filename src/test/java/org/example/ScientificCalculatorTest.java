package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ScientificCalculatorTest {
    @Test
     /*void testCalcular() {
       setup-criação dos objetos, preparação
        ScientificCalculator calculator = new ScientificCalculator();

        execution-execução do método que esta sendo testado
        double result = calculator.add(2,3);

        assertion-verificação se o resultado é o esperado
        assertEquals(5, result);

        // teardown
    }*/

    void testSubtract() {
        /*setup-criação dos objetos, preparação*/
        ScientificCalculator calculator = new ScientificCalculator();

        /*execution-execução do metodo que esta sendo testado*/
        double result = calculator.subtract(2,1);

        /*assertion-verificação se o resultado é o esperado*/
        assertEquals(1, result);
    }
}
