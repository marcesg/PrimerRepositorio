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
public class guia5_extra1_sumaVector {
    /*Realizar un algoritmo que calcule la suma de todos los elementos de un vector 
    de tamaño N, con los valores ingresados por el usuario.  */
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int n;
        int suma = 0;
        
        // Pedimos al usuario el tamaño del vector
        System.out.print("Ingrese el tamaño del vector: ");
        n = entrada.nextInt();
        
        // Creamos el vector y pedimos los valores al usuario
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el elemento " + (i+1) + ": ");
            vector[i] = entrada.nextInt();
        }
        
        // Calculamos la suma de los elementos del vector
        for (int i = 0; i < n; i++) {
            suma += vector[i];
        }
        
        // Mostramos el resultado por pantalla
        System.out.println("La suma de los elementos del vector es: " + suma);
    }
}

