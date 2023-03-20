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
public class guia4_eje3_conversorMoneda1 {
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
        System.out.print("Introduce la cantidad de euros a convertir: ");
        double cantidad = leer.nextDouble();
        System.out.print("Introduce la moneda a la que se desea convertir (libras, dólares o yenes): ");
        String moneda = leer.next();
        convertirMoneda(cantidad, moneda);
    }
    
    public static void convertirMoneda(double cantidad, String moneda) {
        double resultado = 0;
        String simbolo = "";
        switch(moneda) {
            case "libras":
                resultado = cantidad * 0.86;
                simbolo = "£";
                break;
            case "dólares":
                resultado = cantidad * 1.28611;
                simbolo = "$";
                break;
            case "yenes":
                resultado = cantidad * 129.852;
                simbolo = "¥";
                break;
            default:
                System.out.println("La moneda introducida no es válida.");
                return;
        }
        System.out.println(cantidad + " € equivalen a " + resultado + " " + simbolo + ".");
    }
}

