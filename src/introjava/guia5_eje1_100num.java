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
public class guia5_eje1_100num {
    public static void main(String[] args) {
    int[] numeros = new int[99];

        for (int i = 0; i < 99; i++) {
            numeros[i] = i + 1;
        }

        System.out.println("los numeros enteros en forma decreciente son: ");
        for (int i = 99; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}

    
    
    

