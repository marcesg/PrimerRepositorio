/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

/**
 *
 * @author alumno
 */
public class guia4_intro_eje12_1 {
  /*Crea un procedimiento EsMultiplo que reciba los dos números pasados por el
usuario, validando que el primer número múltiplo del segundo e imprima si el primer
número es múltiplo del segundo, sino informe que no lo son.*/

    
    public static void main(String[] args) {
        int num1 = 15;  // primer número
        int num2 = 3;   // segundo número

        // llamando al procedimiento EsMultiplo
        EsMultiplo(num1, num2);
    }

    public static void EsMultiplo(int num1, int num2) {
        if (num1 % num2 == 0) {
            System.out.println(num1 + " es múltiplo de " + num2);
        } else {
            System.out.println(num1 + " no es múltiplo de " + num2);
        }
    }
}

    
