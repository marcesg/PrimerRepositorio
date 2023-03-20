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
public class guia3_ejerc4_letraA {
    /*Escriba un programa que pida una frase o palabra y valide si la primera
letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de
imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se 
deberá imprimir “INCORRECTO”. Nota: investigar la función Substring y equals() de Java.*/

    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la frase desde la entrada estándar
        Scanner leer = new Scanner(System.in);
        System.out.print("Introduce una frase o palabra: ");

        // Leemos la frase desde la entrada estándar
        String frase = leer.nextLine();

        // Obtenemos la primera letra de la frase  con equalsIgnoreCase ignoramos si es mayuscula o minuscula
        if (frase.substring(0, 1).equalsIgnoreCase("a")) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
}



