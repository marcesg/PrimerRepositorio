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
public class guia5_eje6_matrizMagica {
    /* Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 
    1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son idénticas. 
    Crear un programa que permita introducir un cuadrado por teclado y determine 
    si este cuadrado es mágico o no. El programa deberá comprobar que los números
    introducidos son correctos, es decir, están entre el 1 y el 9. */
    
  
    public static void main(String[] args) {

        int[][] cuadrado = new int[3][3];
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario que introduzca los números del cuadrado
        System.out.println("Introduce los números del cuadrado mágico:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Fila " + (i+1) + ", columna " + (j+1) + ": ");
                cuadrado[i][j] = sc.nextInt();
                // Comprobar que el número introducido está entre 1 y 9
                if (cuadrado[i][j] < 1 || cuadrado[i][j] > 9) {
                    System.out.println("Error: el número introducido debe estar entre 1 y 9");
                    return;
                }
            }
        }

        // Comprobar si es un cuadrado mágico
        if (esCuadradoMagico(cuadrado)) {
            System.out.println("¡Es un cuadrado mágico!");
        } else {
            System.out.println("No es un cuadrado mágico");
        }
    }

    // Función para comprobar si un cuadrado es mágico
    public static boolean esCuadradoMagico(int[][] cuadrado) {
        // Calcular la suma mágica (la suma que deben tener todas las filas, columnas y diagonales)
        int sumaMagica = cuadrado[0][0] + cuadrado[0][1] + cuadrado[0][2];

        // Comprobar que todas las filas tienen la suma mágica
        for (int i = 0; i < 3; i++) {
            int sumaFila = 0;
            for (int j = 0; j < 3; j++) {
                sumaFila += cuadrado[i][j];
            }
            if (sumaFila != sumaMagica) {
                return false;
            }
        }

        // Comprobar que todas las columnas tienen la suma mágica
        for (int j = 0; j < 3; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < 3; i++) {
                sumaColumna += cuadrado[i][j];
            }
            if (sumaColumna != sumaMagica) {
                return false;
            }
        }

        // Comprobar que las diagonales tienen la suma mágica
        if (cuadrado[0][0] + cuadrado[1][1] + cuadrado[2][2] != sumaMagica) {
            return false;
        }
        if (cuadrado[0][2] + cuadrado[1][1] + cuadrado[2][0] != sumaMagica) {
            return false;
        }

        // Si se han cumplido todas las comprobaciones anteriores, el cuadrado es mágico
        return true;
    }
}
