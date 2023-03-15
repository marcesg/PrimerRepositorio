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
public class guia2_extra3_vocal {
    /*Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se 
trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar 
la función equals() de la clase String.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una letra: ");
        String letra = sc.nextLine().toLowerCase(); // Convertir a minúsculas
        
        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
            System.out.println("La letra ingresada es una vocal.");
        } else {
            System.out.println("La letra ingresada NO es una vocal.");
        }
    }
}


