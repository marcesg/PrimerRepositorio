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
public class guia5_eje4_matrizTrasp {
    /*Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios 
    y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A se
    denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
*/
  
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        Random random = new Random();

        // Rellenar matriz con valores aleatorios
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = random.nextInt(10); // Valores entre 0 y 9
            }
        }

        // Imprimir matriz original
        System.out.println("Matriz original:");
        imprimirMatriz(matriz);

        // Calcular y mostrar la traspuesta
        int[][] traspuesta = calcularTraspuesta(matriz);
        System.out.println("Matriz traspuesta:");
        imprimirMatriz(traspuesta);
    }

    // Función para calcular la matriz traspuesta
    public static int[][] calcularTraspuesta(int[][] matriz) {
        int[][] traspuesta = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                traspuesta[i][j] = matriz[j][i];
            }
        }

        return traspuesta;
    }

    // Función para imprimir una matriz en la consola
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

    
