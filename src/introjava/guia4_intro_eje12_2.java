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
public class guia4_intro_eje12_2 {
    /*Crea un procedimiento EsMultiplo que reciba los dos números pasados por el
usuario, validando que el primer número múltiplo del segundo e imprima si el primer 
número es múltiplo del segundo, sino informe que no lo son.*/

 
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingrese el valor de X1");
        num1 = leer.nextInt();
        System.out.println("Ingrese el valor de X2");
        num2 = leer.nextInt();
        
        EsMultiplo(num1, num2);
    }
    
    public static void EsMultiplo(int num1, int num2) {
        
        if (num1%num2==0) {
            System.out.println("Num1 es multiplo de num2");
        } else { System.out.println("No son multiplo");
            
        }
        
    }
    
}
