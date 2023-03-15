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
public class guia2_ejemplo6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2;

        System.out.println("Introduce un numero entero");
        num1 = leer.nextInt();
        System.out.println("Intreduce otro numero entero");
        num2 = leer.nextInt();

        System.out.println("Ahora vamos a ver cual numero es mayor y menor o si son iguales");
        if (num1 >= num2) {
            //lo hacemos el si anidado
            if (num1 == num2 & num1 == 25) {
                System.out.println("Los numeros ingresados son iguales a 25");
            } else if (num1 > 25) {
                System.out.println("El primer numero ingresado es " + num1 + " y es mayor que 25");
            }
        } else if (num2 > 25) {
            System.out.println("El segundo numero ingresado es " + num2 + " y es mayor que 25 ");
        }

    }
}
