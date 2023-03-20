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
public class guia3_extra7_valorMax_doWhile {
   /*Realice un programa que calcule y visualice el valor máximo, el valor 
mínimo y el promedio de n números (n>0). El valor de n se solicitará al principio 
del programa y los números serán introducidos por el usuario. Realice dos versiones
del programa, una usando el bucle “while” y otra con el bucle “do - while”.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el valor de n: ");
        int n = sc.nextInt();
        int i = 1;
        int num;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        do {
            System.out.print("Ingrese el número " + i + ": ");
            num = sc.nextInt();
            if (num % 2 == 0 && num >= 0) { // Solo se consideran los números pares y positivos
                sum += num;
                if (num > max) {
                    max = num;
                }
                if (num < min) {
                    min = num;
                }
                i++;
            } else if (num % 5 == 0) { // Se detiene la lectura si se ingresa un múltiplo de 5
                System.out.println("Se ingresó un múltiplo de 5.");
                break;
            }
        } while (i <= n);
        if (i == 1) { // En caso de que no se hayan ingresado números válidos
            System.out.println("No se ingresaron números pares y positivos.");
        } else {
            double promedio = (double) sum / (i - 1);
            System.out.println("Cantidad de números leídos: " + (i - 1));
            System.out.println("Cantidad de números pares: " + (i - 1));
            System.out.println("Cantidad de números impares: 0");
        }
    }
}

