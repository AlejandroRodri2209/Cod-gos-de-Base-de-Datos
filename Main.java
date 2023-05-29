/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase_POO;

/**
 *
 * @author Aleja
 */
public class Main {

    public static void main(String[] args) {
        int num1 = 9;
        int num2 = 2;
        int num3 = 8;
        char operacion = '+';

        try {
            double resultado = Calculadora.sumar(num1, num2, num3, operacion);
            System.out.println(num1 + " " + operacion + " " + num2 + " " + operacion + " " + num3 + " = " + resultado);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        operacion = '-';

        try {
            double resultado = Calculadora.restar(num1, num2, num3, operacion);
            System.out.println(num1 + " " + operacion + " " + num2 + " " + operacion + " " + num3 + " = " + resultado);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        operacion = '*';

        try {
            double resultado = Calculadora.multiplicar(num1, num2, num3, operacion);
            System.out.println(num1 + " " + operacion + " " + num2 + " " + operacion + " " + num3 + " = " + resultado);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        operacion = '/';

        try {
            double resultado = Calculadora.dividir(num1, num2, num3, operacion);
            System.out.println(num1 + " " + operacion + " " + num2 + " " + operacion + " " + num3 + " = " + resultado);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        operacion = '^';

        try {
            double resultado = Calculadora.potencia(num1, num2, num3, operacion);
            System.out.println(num1 + " " + operacion + " " + num2 + " " + operacion + " " + num3 + " = " + resultado);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            double resultado = Calculadora.raizCuadrada(num1, num2, num3, operacion);
            System.out.println("La raíz cuadrada de " + num1 + " es " + resultado);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}

