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
public class guia2_extra11_contarDigito {
    /*Escribir un programa que lea un número entero y devuelva el número de dígitos 
que componen ese número. Por ejemplo, si introducimos el número 12345, el programa 
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el 
operador de división. Nota: recordar que las variables de tipo entero truncan 
los números o resultados.*/


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int numero = sc.nextInt();
        
        int contador = 0;
        
        while (numero != 0) {
            numero = numero / 10;
            contador++;
        }
        
        System.out.println("El número de dígitos del número introducido es: " + contador);

    }

}
