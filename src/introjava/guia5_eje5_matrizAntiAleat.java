/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Random;

/**
 *
 * @author alumno
 */
public class guia5_eje5_matrizAntiAleat {
    /* Realice un programa que compruebe si una matriz dada es antisimétrica.
    Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia
    traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. 
    La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando
    sus filas por columnas (o viceversa).    */

    public static void main(String[] args) {
        int[][] matriz = generarMatrizAleatoria(4, 4);

        // Imprimir matriz original
        System.out.println("Matriz original:");
        imprimirMatriz(matriz);

        // Comprobar si es antisimétrica
        if (esAntisimetrica(matriz)) {
            System.out.println("La matriz es antisimétrica");
        } else {
            System.out.println("La matriz no es antisimétrica");
        }
    }

    // Función para generar una matriz aleatoria
    public static int[][] generarMatrizAleatoria(int filas, int columnas) {
        int[][] matriz = new int[filas][columnas];
        Random rnd = new Random();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = rnd.nextInt(21) - 10; // Genera valores aleatorios entre -10 y 10
            }
        }

        return matriz;
    }

    // Función para comprobar si una matriz es antisimétrica
    public static boolean esAntisimetrica(int[][] matriz) {
        int[][] traspuesta = calcularTraspuesta(matriz);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] != -traspuesta[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }

    // Función para calcular la matriz traspuesta
    public static int[][] calcularTraspuesta(int[][] matriz) {
        int[][] traspuesta = new int[matriz.length][matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                traspuesta[i][j] = matriz[j][i];
            }
        }

        return traspuesta;
    }

    // Función para imprimir una matriz en la consola
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

