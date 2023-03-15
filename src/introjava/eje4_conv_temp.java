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
public class eje4_conv_temp {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float c, f;
        System.out.println("Ingrese la temperatura a convertir a grados Fahrenheit");
        c = leer.nextFloat();
        f = 32 + (9 * c/5);
        System.out.println(c + "° grados Centigrados es igual a: " + f + "° grados Fahrenheit");
        
        
    
    }
}
