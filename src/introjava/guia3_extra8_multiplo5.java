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
public class guia3_extra8_multiplo5 {
    /*Escriba un programa que lea números enteros. Si el número es múltiplo de 
cinco debe detener la lectura y mostrar la cantidad de números leídos, la cantidad 
de números pares y la cantidad de números impares. Al igual que en el ejercicio 
anterior los números negativos no deben sumarse. Nota: recordar el uso de la sentencia break.*/


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, cantidad = 0, pares = 0, impares = 0;

        while (true) {
            System.out.print("Ingrese un número entero (0 para salir): ");
            num = input.nextInt();

            if (num == 0) {
                break;
            } else if (num < 0 || num % 5 == 0) {
                continue;
            }

            cantidad++;

            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Cantidad de números leídos: " + cantidad);
        System.out.println("Cantidad de números pares: " + pares);
        System.out.println("Cantidad de números impares: " + impares);

        input.close();
    }
}

