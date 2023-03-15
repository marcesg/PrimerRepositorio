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
public class guia2_extra9_restaSucesiva {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el dividendo: ");
        int dividendo = leer.nextInt();
        System.out.print("Ingrese el divisor: ");
        int divisor = leer.nextInt();

        int cociente = 0;
        int residuo = dividendo;

        while (residuo >= divisor) {
            residuo -= divisor;
            cociente++;
        }

        System.out.println("El cociente es: " + cociente);
        System.out.println("El residuo es: " + residuo);
    }
}

