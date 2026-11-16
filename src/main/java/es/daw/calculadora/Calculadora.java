package es.daw.calculadora;

public class Calculadora {

    // Suma dos números
    public double sumar(double a, double b) {
        return a + b;
    }

    // Resta el segundo número al primero
    public double restar(double a, double b) {
        return a - b;
    }

    // Multiplica dos números
    public double multiplicar(double a, double b) {
        return a * b;
    }

    // Divide el primer número entre el segundo
    public double dividir(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException(
                "No se puede dividir entre cero"
            );
        }
        return a / b;
        }
    // Calcula la potencia de una base elevada a un exponente
    public double potencia(double base, double exponente) {
        double resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado = resultado * base;
        }
        return resultado;
    }
      
        
            // Calcula el resto de la división entre dos números
    public double modulo(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException(
                "No se puede calcular el módulo entre cero"
            );
        }
        return a % b;
    }

    }