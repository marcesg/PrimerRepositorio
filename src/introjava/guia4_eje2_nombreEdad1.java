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
public class guia4_eje2_nombreEdad1 {
   /*Diseñe una función que pida el nombre y la edad de N personas e imprima los datos
de las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir 
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.*/

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String nombre;
        int edad;
        String respuesta1;
           
        do {
           
            System.out.println("Desea agregar una persona? (S/N)");
            respuesta1 = leer.next();
                if ("S".equals(respuesta1)) {
                    System.out.println("Ingrese el nombre");
                    nombre = leer.next();
                    System.out.println("Ingrese la edad");
                    edad = leer.nextInt();
                    System.out.println(nombre+" "+MayorMenor(edad));
                }
        } while (!respuesta1.equals("N"));   

    }
    
    public static String MayorMenor(int edad){
        String respuesta;
        if (edad>=18) {
            return respuesta = "es mayor";
        } else { 
        return respuesta = "no es mayor de edad";}
    }

}
    
    
