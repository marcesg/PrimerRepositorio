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
public class guia4_eje4_numeroPrimos2 {
       /*Crea una aplicación que nos pida un número por teclado y con una función se 
lo pasamos por parámetro para que nos indique si es o no un número primo, debe devolver 
true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. 
Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.*/
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un numero");
        numero = leer.nextInt();
        
        if (numero == 1) {
            System.out.println("No es primo");
        } else {
           System.out.println(esMultiplo(numero)); 
        }
        
    }
    
    public static String esMultiplo(int numero){
        String respuesta = null;
        int contador = 1;
        for (int i = 1; i < numero; i++) {
            if (numero%i==0) {
                contador += 1;  
            }
            if (contador == 2) {
                respuesta = "Es numero primo";
            } else {
                respuesta = "No es numero primo";
            }
               
        }

        return respuesta;
    }
    
    
}
    
    

