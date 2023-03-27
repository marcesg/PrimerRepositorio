/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
****************************************
Crear una función rellene un vector con números aleatorios, pasándole un arreglo 
por parámetro. Después haremos otra función o procedimiento que imprima el vector.

****************************************
 */
package introjava;

import java.util.Random;

/**
 *
 * @author alumno
 */
public class guia5_extra3_aleatorios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] miVector = new int[10];
        rellenarVector(miVector);
        imprimirVector(miVector);
    }

    public static void rellenarVector(int[] vector) {
        Random rand = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = rand.nextInt(100); // Genera números aleatorios entre 0 y 99
        }
    }

    public static void imprimirVector(int[] vector) {
        System.out.print("[ ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println("]");
    }

}
