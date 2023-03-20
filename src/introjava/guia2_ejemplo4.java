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
public class guia2_ejemplo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
 /* Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese dos valores");
    
    double num1 = leer.nextDouble();
    double num2 = leer.nextDouble();
    double resta = num1 - num2;
    System.out.println("La resta es " + resta);
    double div = num1 / num2;
    System.out.println("La division de los numeros es " + div);
    boolean logico = num1 < num2;
        System.out.println(num1 + " es menor que " + num2 + "? " + logico);*/
        Scanner leer = new Scanner(System.in);
        String nombre;
        int num;
        System.out.println("Ingrese su nombre: ");
        nombre = leer.nextLine();
        System.out.println("Ingrese tu edad");
        num = leer.nextInt();
        System.out.println("Tu nombre es: " + nombre + " y tienes " + num + " años de edad");

    }

}
