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
public class guia2_extra14_familias {
    /*Se dispone de un conjunto de N familias, cada una de las cuales tiene una 
M cantidad de hijos. Escriba un programa que pida la cantidad de familias y para 
cada familia la cantidad de hijos para averiguar la media de edad de los hijos 
de todas las familias.*/
   

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la cantidad de familias: ");
        int nFamilias = sc.nextInt();
        
        int totalHijos = 0;
        int totalEdades = 0;
        
        for (int i = 1; i <= nFamilias; i++) {
            System.out.print("Introduce la cantidad de hijos de la familia " + i + ": ");
            int nHijos = sc.nextInt();
            totalHijos += nHijos;
            for (int j = 1; j <= nHijos; j++) {
                System.out.print("Introduce la edad del hijo " + j + " de la familia " + i + ": ");
                int edad = sc.nextInt();
                totalEdades += edad;
            }
        }
        
        double mediaEdad = (double) totalEdades / totalHijos;
        System.out.println("La media de edad de los hijos de todas las familias es: " + mediaEdad);

    }

}

