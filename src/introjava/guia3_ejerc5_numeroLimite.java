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
public class guia3_ejerc5_numeroLimite {
    /*Escriba un programa en el cual se ingrese un valor límite positivo, 
y a continuación solicite números al usuario hasta que la suma de los números
introducidos supere el límite inicial.*/

    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer los números desde la entrada estándar
        Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario que introduzca el límite positivo
        System.out.print("Introduce un límite positivo: ");
        int limite = scanner.nextInt();

        int suma = 0;
        int numero;

        // Solicitamos números al usuario hasta que la suma supere el límite
        do {
            System.out.print("Introduce un número: ");
            numero = scanner.nextInt();
            suma += numero;
        } while (suma <= limite);

        System.out.println("La suma de los números introducidos es " + suma);
    }
}

    

