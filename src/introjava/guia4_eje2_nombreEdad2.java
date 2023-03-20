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
public class guia4_eje2_nombreEdad2 {
   /*Diseñe una función que pida el nombre y la edad de N personas e imprima los
datos de las personas ingresadas por teclado e indique si son mayores o menores de 
edad. Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.*/
 
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String seguirMostrando = "Sí";
        while(seguirMostrando.equalsIgnoreCase("Sí")) {
            System.out.print("Introduce el número de personas: ");
            int numPersonas = leer.nextInt();
            String[] nombres = new String[numPersonas];
            int[] edades = new int[numPersonas];
            for(int i = 0; i < numPersonas; i++) {
                System.out.print("Introduce el nombre de la persona " + (i+1) + ": ");
                nombres[i] = leer.next();
                System.out.print("Introduce la edad de la persona " + (i+1) + ": ");
                edades[i] = leer.nextInt();
            }
            System.out.println("Datos de las personas:");
            for(int i = 0; i < numPersonas; i++) {
                System.out.println(nombres[i] + " tiene " + edades[i] + " años y es " + (edades[i] >= 18 ? "mayor" : "menor") + " de edad.");
            }
            System.out.print("¿Deseas seguir mostrando personas? (Sí/No): ");
            seguirMostrando = leer.next();
        }
    }
}
