/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class guia5_eje2_aleatorio {
    /*Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios
y le pida al usuario un número a buscar en el vector. El programa mostrará dónde 
se encuentra el numero y si se encuentra repetido*/

  
    
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        
        // Pedir el tamaño del vector y crearlo
        System.out.print("Introduce el tamaño del vector: ");
        int tam = leer.nextInt();
        int[] vector = new int[tam];
        
        // Llenar el vector con valores aleatorios, se usa Random 
        Random rnd = new Random();
        for (int i = 0; i < tam; i++) {
            vector[i] = rnd.nextInt(100);
        }
        
        // Mostrar el vector con salto de linea.
        System.out.print("Vector: ");
        for (int i = 0; i < tam; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
        
        // Pedir el número a buscar
        System.out.print("Introduce el número a buscar: ");
        int num = leer.nextInt();
        
        // Buscar el número en el vector
        int posicion = -1;
        boolean repetido = false;
        for (int i = 0; i < tam; i++) {
            if (vector[i] == num) {
                if (posicion == -1) {
                    posicion = i;
                } else {
                    repetido = true;
                }
            }
        }
        
        // Mostrar resultado
        if (posicion == -1) {
            System.out.println("El número no se encuentra en el vector.");
        } else {
            System.out.println("El número se encuentra en la posición " + posicion + " del vector.");
            if (repetido) {
                System.out.println("El número se encuentra repetido en el vector.");
            }
        }
        
        leer.close();
    }

}

    
    
    
    

