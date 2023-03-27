/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
***********************************
Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios
y muestre la suma de sus elementos.
***********************************
 */
package introjava;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author alumno
 */
public class guia5_extra5_relleno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Ingrese el valor de N:");
        int n = leer.nextInt();
        System.out.println("Ingrese el valor de M:");
        int m = leer.nextInt();

        int[][] matriz = new int[n][m];
        int suma = 0;

        // Rellenar la matriz con valores aleatorios y sumar sus elementos
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = rand.nextInt(100); // Genera números aleatorios entre 0 y 99
                suma += matriz[i][j];
            }
        }

        // Mostrar la matriz y la suma de sus elementos
        System.out.println("Matriz generada:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("La suma de los elementos de la matriz es: " + suma);
    }

}
