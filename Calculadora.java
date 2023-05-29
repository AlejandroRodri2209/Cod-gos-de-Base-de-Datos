/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase_POO;

/**
 *
 * @author Aleja
 */
public class Calculadora {
    
    public static final int ultimo_numero_cedula = 9;

    public static double sumar(double num1, double num2, double num3, char operacion) throws Exception {
        if (num1 == ultimo_numero_cedula) {
            throw new Exception("No se puede utilizar " + num1 + " como primer número");
        }
        return num1 + num2 + num3;
    }

    public static double restar(double num1, double num2, double num3, char operacion) throws Exception {
        if (num1 == ultimo_numero_cedula) {
            throw new Exception("No se puede utilizar " + num1 + " como primer número");
        }
        return num1 - num2 - num3;
    }

    public static double multiplicar(double num1, double num2, double num3, char operacion) throws Exception {
        if (num1 == ultimo_numero_cedula) {
            throw new Exception("No se puede utilizar " + num1 + " como primer número");
        }
        return num1 * num2 * num3;
    }

    public static double dividir(double num1, double num2, double num3, char operacion) throws Exception {
        if (num1 == ultimo_numero_cedula) {
            throw new Exception("No se puede utilizar " + num1 + " como primer número");
        }
        if (num2 == 0) {
            throw new Exception("No se puede dividir entre cero");
        }
        return num1 / num2 / num3;
    }

    public static double potencia(double num1, double num2, double num3, char operacion) throws Exception {
        if (num1 == ultimo_numero_cedula) {
            throw new Exception("No se puede utilizar " + num1 + " como primer número");
        }
        return Math.pow(num1, num2 + num3);
    }

    public static double raizCuadrada(double num1, double num2, double num3, char operacion) throws Exception {
        if (num1 == ultimo_numero_cedula) {
            throw new Exception("No se puede utilizar " + num1 + " como primer número");
        }
        if (num1 < 0) {
            throw new Exception("No se puede calcular la raíz cuadrada de un número negativo");
        }
        return Math.sqrt(num1);
    }
}

