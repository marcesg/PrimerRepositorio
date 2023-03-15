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
public class guia2_ejemplo9 {
 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        for (int i = 0; i < 20; i++) {
            System.out.print("Introduzca un número: ");
            int num = sc.nextInt();
            if (num == 0) {
                System.out.println("Se capturó el número cero");
                break;
            }
            if (num > 0) {
                suma += num;
            }
        }
        System.out.println("La suma de los números leídos es: " + suma);
    }
}

