package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ScientificCalculatorTest {
    private ScientificCalculator calculator;

    //tarefa 4
    @BeforeEach
    void setUp() {
        calculator = new ScientificCalculator();
        System.out.println("Teste para cada nova execução!");
    }

    /*Tarefa 2*/
    @Test
    void testCalcular() {
        //execution-execução do método que esta sendo testado
        double result = calculator.add(2,3);

        //assertion-verificação se o resultado é o esperado
        assertEquals(5, result);
        // teardown
    }

    //Tarefa 3
@Test
    void testSubtract() {
        /*execution-execução do metodo que esta sendo testado*/
        double result = calculator.subtract(2,1);
        /*assertion-verificação se o resultado é o esperado*/
        assertEquals(1, result);
    }

    @Test
    void testMultiplicar() {
        double result = calculator.multiply(2,3);
        assertEquals(6, result);
    }

    @Test
    void testDivide() {
        double result = calculator.divide(8,2);
        assertEquals(4, result);
    }
    @Test
    void testPower() {
        double result = calculator.power(2,3);
        assertEquals(8, result);
    }

    //Taarefa 5
    @Test
    void testSquareRootPositive() {
        double result = calculator.squareRoot(9);
        assertEquals(3.0, result);
    }

    //Tarefa 6
    @Test
    void testSquareRootNegative() {
        assertThrows(IllegalArgumentException.class, ()->{
            calculator.squareRoot(-6);
        });
    }

    //Tarefa 7
    @Test
    void testDivideByZero() {
    assertThrows(IllegalArgumentException.class,
            ()-> calculator.divide(10,0));
    }

    //Tarefa 8
    @Test
    void testLog() {
        double result = calculator.log(Math.E);
        assertEquals(1.0, result, 0.0001);
    }

    @Test
    void testSin() {
        double result = calculator.sin(90);
        assertEquals(1.0, result, 0.0001);
    }
}
