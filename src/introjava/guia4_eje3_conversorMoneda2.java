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
public class guia4_eje3_conversorMoneda2 {
    /*Crea una aplicación que a través de una función nos convierta una cantidad de 
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras.
La función tendrá como parámetros, la cantidad de euros y la moneda a convertir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €*/
    
public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de euros");
        int X1 = leer.nextInt();

        int operacion;
        
        do {
            
        System.out.println("---Menu---");
        System.out.println("1. Convertir a dolar");
        System.out.println("2. Convertir a yenes");
        System.out.println("3. Convertir a libra");
        System.out.println("4. Salir");
        System.out.println("¿Que operacion desea realizar?");
        operacion = leer.nextInt();
   

        switch (operacion) {
           case 1:
               System.out.println("Son " +dolar(X1)+ " dolares.");
               break;
           case 2:
               System.out.println("Son " +yenes(X1)+ " yenes.");
               break;
           case 3:
               System.out.println("Son " +libra(X1)+ " libra.");
               break;
           case 4:
               break;
            } 
        } while (operacion != 4);
    }
   
    public static double dolar(double X1){
        double resultado = X1 * 1.28611;
        return resultado;       
    }
    
    public static double yenes(double X1){
        double resultado = X1 * 129.852;
        return resultado;        
    }
    
    public static double libra(double X1){
        double resultado = X1 * 0.86;
        return resultado;        
    }
     
}


