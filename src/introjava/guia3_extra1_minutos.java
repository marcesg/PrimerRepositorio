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
public class guia3_extra1_minutos {
    /*Dado un tiempo en minutos, calcular su equivalente en días y horas. 
    Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe 
     calcular su equivalente: 1 día, 2 horas.*/

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el tiempo en minutos: ");
        int minutos = leer.nextInt();

        int dias = minutos / 1440; // 1 día tiene 1440 minutos
        int horas = (minutos % 1440) / 60; // 1 hora tiene 60 minutos
        int minutosRestantes = minutos % 60;

        System.out.println(minutos + " minutos equivalen a " + dias + " día(s), " + horas + " hora(s) y " + minutosRestantes + " minuto(s).");
    }
}


