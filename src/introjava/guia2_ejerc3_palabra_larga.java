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
public class guia2_ejerc3_palabra_larga {
    /*Realizar un programa que solo permita introducir solo frases o palabras
de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de
imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se 
deberá imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.*/

    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la frase desde la entrada estándar
        Scanner leer = new Scanner(System.in);
        System.out.print("Introduce una frase o palabra de 8 caracteres: ");

        // Leemos la frase desde la entrada estándar
        String frase = leer.nextLine();

        // Comprobamos si la frase tiene 8 caracteres de longitud
        if (frase.length() == 8) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
}


    

