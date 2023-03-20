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
public class guia3_ejerc1_par_impar {
    //Crear un programa que dado un número determine si es par o impar.

    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer el número desde la entrada estándar
        Scanner leer = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");

        // Leemos el número desde la entrada estándar
        int numero = leer.nextInt();

        // Comprobamos si el número es par o impar
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }
    }
}

    
