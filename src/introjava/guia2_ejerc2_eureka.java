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
public class guia2_ejerc2_eureka {

 public static void main(String[] args) {
     /*Crear un programa que pida una frase y si esa frase es igual a “eureka”
el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. 
Nota: investigar la función equals() en Java.*/

        // Creamos un objeto Scanner para leer la frase desde la entrada estándar
        Scanner leer = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String frase = leer.nextLine();

        // Comprobamos si la frase es igual a "eureka" con equals nos devuelve true
        if (frase.equals("eureka")) {
            System.out.println("Correcto.");
        } else {
            System.out.println("Incorrecto.");
        }
    }
}

    
    

