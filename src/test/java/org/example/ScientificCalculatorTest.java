package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ScientificCalculatorTest {
    @Test
    void testCalcular() {
        //setup
        ScientificCalculator calculator = new ScientificCalculator();

        //execu
        double result = calculator.add(2,3);

        //assertion
        assertEquals(5, result);
    }
}
