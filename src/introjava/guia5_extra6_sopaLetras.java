/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*****************************************
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a 
medida que el usuario las va ingresando, construya una “sopa de letras para niños” 
de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal
en una fila que será seleccionada de manera aleatoria. Una vez concluida la ubicación 
de las palabras, rellene los espacios no utilizados con un número aleatorio del 0 al 9. 
Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes
funciones de Java substring(), Length() y Math.random().
*****************************************

 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class guia5_extra6_sopaLetras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);

        // Pedir al usuario que ingrese 5 palabras de mínimo 3 y máximo 5 caracteres
        String[] palabras = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese la palabra " + (i+1) + " (debe tener entre 3 y 5 caracteres):");
            palabras[i] = leer.nextLine().toUpperCase(); // Convertir la palabra a mayúsculas
            while (palabras[i].length() < 3 || palabras[i].length() > 5) {
                System.out.println("La palabra debe tener entre 3 y 5 caracteres. Ingrese nuevamente:");
                palabras[i] = leer.nextLine().toUpperCase();
            }
        }

        // Crear una sopa de letras de tamaño 20x20 y rellenarla con números aleatorios
        char[][] sopa = new char[20][20];
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                sopa[i][j] = (char) (Math.random() * 10 + '0'); // Generar un número aleatorio entre 0 y 9
            }
        }

        // Elegir una fila aleatoria para ubicar las palabras
        int fila = (int) (Math.random() * 20);

        // Ubicar las palabras en la fila elegida de manera horizontal
        int columna = 0;
        for (String palabra : palabras) {
            sopa[fila][columna] = palabra.charAt(0); // Colocar la primera letra de la palabra
            for (int i = 1; i < palabra.length(); i++) {
                columna++;
                sopa[fila][columna] = palabra.charAt(i); // Colocar las letras restantes de la palabra
            }
            columna++; // Dejar un espacio en blanco entre cada palabra
        }

        // Mostrar la sopa de letras por pantalla
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(sopa[i][j] + " ");
            }
            System.out.println();
        }
    }

}
