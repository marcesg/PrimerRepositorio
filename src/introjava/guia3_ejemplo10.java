/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class guia3_ejemplo10 {
    /*Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima
el número ingresado seguido de tantos asteriscos como indique su valor.*/
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[4];

        // Leer los números ingresados por el usuario
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un número entre 1 y 20: ");
            numeros[i] = scanner.nextInt();

            // Verificar que el número esté dentro del rango especificado
            if (numeros[i] < 1 || numeros[i] > 20) {
                System.out.println("Número fuera de rango. Por favor, ingrese un número entre 1 y 20.");
                i--; // Volver a pedir el mismo número
            }
        }

        // Imprimir los números y los asteriscos correspondientes
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + ": ");
            for (int j = 0; j < numeros[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}