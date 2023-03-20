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
public class guia4_eje4_numPrimos1 {
    /*Crea una aplicación que nos pida un número por teclado y con una función se 
lo pasamos por parámetro para que nos indique si es o no un número primo, debe devolver 
true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. 
Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.*/

    
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Introduce un número entero positivo: ");
        int numero = leer.nextInt();
        boolean esPrimo = esPrimo(numero);
        if(esPrimo) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }
    }
    
    public static boolean esPrimo(int numero) {
        if(numero <= 1) {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(numero); i++) {
            if(numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
  
    

