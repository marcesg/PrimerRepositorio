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
public class guia5_eje3_numeros {
    /*Recorrer un vector de N enteros contabilizando cuántos números son de 1 
    dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).*/
     

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Introduce el tamaño del vector: ");
        n = sc.nextInt();
        int[] numeros = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Introduce el número " + (i+1) + ": ");
            numeros[i] = sc.nextInt();
        }
        int[] digitos = new int[6];
        for (int i = 0; i < n; i++) {
            int numDigitos = String.valueOf(numeros[i]).length();
            if (numDigitos > 5) {
                digitos[5]++;
            } else {
                digitos[numDigitos]++;
            }
        }
        System.out.println("Número de dígitos:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " dígito(s): " + digitos[i]);
        }
    }
}

    
    

