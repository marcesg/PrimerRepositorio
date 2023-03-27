/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

/**
 *
 * @author alumno
 */
public class guia5_eje5_matrizAntiLaura {
    //Realice un programa que compruebe si una matriz dada es antisimétrica. 
    //Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta, pero cambiada de signo. 
    //Es decir, A es antisimétrica si A = -AT. La matriz traspuesta de una matriz A se denota por AT y 
    //se obtiene cambiando sus filas por columnas (o viceversa).

     public static void main(String[] args) {
    int[][] matrizA = new int[2][2];

    int[][] matrizB = new int[2][2];

    System.out.println("Matriz A");
        for (int i = 0; i< 2; i++) {
            for (int j = 0; j < 2; j++) {
            if (i == j) {
                matrizA[i][j] = 0;
            } else {
                matrizA[i][j] = (int) (Math.random() * 9 - 9);
            }

            System.out.print("[" + matrizA[i][j] + "]");
        }
        System.out.println(" ");
    }

    System.out.println(" ");
    System.out.println("Matriz B traspuesta");
    System.out.println(" ");
    for (int i = 0; i< 2; i++) {
            for (int j = 0; j < 2; j++) {
            matrizB[i][j] = matrizA[j][i];
            System.out.print("[" + matrizB[i][j] + "]");
        }
        System.out.println(" ");
    }

    if (matrizA[0][1] == -matrizB[0][1]) {
                if (matrizA[1][0] == matrizB[1][0]) {
            System.out.println("ES ANTISIMÉTRICA");
        }

    }

    
        else {
       System.out.println("NO ES ANTISIMÉTRICA");
    }
}
}
