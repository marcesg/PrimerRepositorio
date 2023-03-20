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
public class guia3_extra10_aleatorio {
    /*Realice un programa para que el usuario adivine el resultado de una multiplicación 
entre dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al 
usuario si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe
permitir al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio 
investigue como utilizar la función Math.random() de Java.*/


    public static void main(String[] args) {
        
        //Generar dos números aleatorios entre 0 y 10
        int num1 = (int)(Math.random() * 11);
        int num2 = (int)(Math.random() * 11);
        
        Scanner leer = new Scanner(System.in);
        int respuesta;
        boolean acertado = false; //Variable para controlar si se ha adivinado el resultado
        
        System.out.println("Adivina el resultado de la multiplicación entre " + num1 + " y " + num2);
        
        do {
            System.out.print("Introduce tu respuesta: ");
            respuesta = leer.nextInt();
            
            if (respuesta == num1*num2) {
                System.out.println("¡Correcto! Has adivinado el resultado.");
                acertado = true;
            } else {
                System.out.println("Respuesta incorrecta. Inténtalo de nuevo.");
            }
            
        } while (!acertado);
        
    }

}
