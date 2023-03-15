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
public class guia2_extra7_valorMax_while {
    /*Realice un programa que calcule y visualice el valor máximo, el valor 
mínimo y el promedio de n números (n>0). El valor de n se solicitará al principio 
del programa y los números serán introducidos por el usuario. Realice dos versiones
del programa, una usando el bucle “while” y otra con el bucle “do - while”.*/
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, num, suma = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, cont = 0;
        double promedio;

        System.out.print("Ingrese la cantidad de números a ingresar: ");
        n = sc.nextInt();

        while (n > 0) {
            System.out.print("Ingrese un número: ");
            num = sc.nextInt();

            if (num % 2 == 0 && num >= 0) {
                cont++;
            }

            if (num >= 0) {
                suma += num;

                if (num > max) {
                    max = num;
                }

                if (num < min) {
                    min = num;
                }
            }

            if (num % 5 == 0) {
                break;
            }

            n--;
        }

        if (suma == 0) {
            System.out.println("No se ingresaron números válidos.");
        } else {
            promedio = (double) suma / (double) (cont > 0 ? cont : 1);

            System.out.println("Cantidad de números leídos: " + (cont + (n < 0 ? n : 0)));
            System.out.println("Cantidad de números pares leídos: " + cont);
            System.out.println("Cantidad de números impares leídos: " + ((n < 0 ? n + 1 : n) - cont));
            System.out.println("Valor máximo leído: " + (max == Integer.MIN_VALUE ? "No se ingresaron números válidos." : max));
            System.out.println("Valor mínimo leído: " + (min == Integer.MAX_VALUE ? "No se ingresaron números válidos." : min));
            System.out.println("Promedio de números leídos: " + promedio);
        }
    }
}


