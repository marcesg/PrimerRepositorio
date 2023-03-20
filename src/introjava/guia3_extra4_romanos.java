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
public class guia3_extra4_romanos {
    /*Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y
se muestre su equivalente en romano.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        String romano = "";

        System.out.print("Ingrese un número entre 1 y 10: ");
        numero = sc.nextInt();

        switch (numero) {
            case 1:
                romano = "I";
                break;
            case 2:
                romano = "II";
                break;
            case 3:
                romano = "III";
                break;
            case 4:
                romano = "IV";
                break;
            case 5:
                romano = "V";
                break;
            case 6:
                romano = "VI";
                break;
            case 7:
                romano = "VII";
                break;
            case 8:
                romano = "VIII";
                break;
            case 9:
                romano = "IX";
                break;
            case 10:
                romano = "X";
                break;
            default:
                System.out.println("El número ingresado no está en el rango de 1 a 10.");
                break;
        }

        if (!romano.equals("")) {
            System.out.println("El número " + numero + " en romano es: " + romano);
        }

        sc.close();
    }
}


