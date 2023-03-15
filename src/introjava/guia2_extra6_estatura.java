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
public class guia2_extra6_estatura {
    /*Leer la altura de N personas y determinar el promedio de estaturas que 
se encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.*/

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
 
        System.out.print("Ingrese la cantidad de personas: ");
        int n = leer.nextInt();

        double[] alturas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Ingrese la altura de la persona %d en metros: ", i + 1);
            alturas[i] = leer.nextDouble();
        }

        double promedioTotal = 0;
        double promedioBajo160 = 0;
        int cantidadBajo160 = 0;

        for (double altura : alturas) {
            promedioTotal += altura;
            if (altura < 1.6) {
                promedioBajo160 += altura;
                cantidadBajo160++;
            }
        }

        promedioTotal /= n;

        if (cantidadBajo160 > 0) {
            promedioBajo160 /= cantidadBajo160;
            System.out.printf("El promedio de estaturas por debajo de 1.60 mts. es %.2f\n", promedioBajo160);
        } else {
            System.out.println("No se encontraron estaturas por debajo de 1.60 mts.");
        }

        System.out.printf("El promedio de estaturas en general es %.2f\n", promedioTotal);
    }
}
