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
public class guia5_extra2_vectoresIguales {
    /*Escriba un programa que averigüe si dos vectores de N enteros son iguales 
    (la comparación deberá detenerse en cuanto se detecte alguna diferencia
    entre los elementos).
*/


    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int n;
        boolean iguales = true;
        
        // Pedimos al usuario el tamaño de los vectores
        System.out.print("Ingrese el tamaño de los vectores: ");
        n = entrada.nextInt();
        
        // Creamos los vectores y pedimos los valores al usuario
        int[] vector1 = new int[n];
        int[] vector2 = new int[n];
        System.out.println("Ingrese los elementos del primer vector:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i+1) + ": ");
            vector1[i] = entrada.nextInt();
        }
        System.out.println("Ingrese los elementos del segundo vector:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i+1) + ": ");
            vector2[i] = entrada.nextInt();
        }
        
        // Comparamos los vectores
        for (int i = 0; i < n; i++) {
            if (vector1[i] != vector2[i]) {
                iguales = false;
                break;
            }
        }
        
        // Mostramos el resultado por pantalla
        if (iguales) {
            System.out.println("Los vectores son iguales.");
        } else {
            System.out.println("Los vectores son diferentes.");
        }
    }
}

