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
public class guia2_ejemplo8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double nota = 0;
        boolean notavalida = false;

        while (!notavalida) {
            System.out.println("Ingrese la nota entre 0 y 10");
            nota = leer.nextDouble();
            if (nota >= 0 & nota <= 10) {
                notavalida = true;
            } else {
                System.out.println("La nota ingresada no es valida, intentelo nuevamente");
            }
        }
        System.out.println("La nota ingresada es: " + nota);

    }

}


