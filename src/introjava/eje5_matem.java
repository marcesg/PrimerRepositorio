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
public class eje5_matem {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero entero");
        num = leer.nextInt();
        System.out.println("El doble del numero es: " + (num * 2));
        System.out.println("El triple del numero es: " + (num * 3));
        System.out.println("La raiz del numero es: " + Math.sqrt(num));

    }
}
