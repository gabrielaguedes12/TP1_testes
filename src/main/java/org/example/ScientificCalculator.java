package org.example;

public class ScientificCalculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double squareRoot(double number) {
    if(number < 0){
        throw new IllegalArgumentException("Sem numero negativo aqui bb");
    }
    return Math.sqrt(number);
    }
}