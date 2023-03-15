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
public class guia2_ejerc6_menu {
    /*Realizar un programa que pida dos números enteros positivos por teclado
y muestre por pantalla el siguiente menú:El usuario deberá elegir una opción 
y el programa deberá mostrar el resultado por pantalla y luego volver al menú. 
El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta
que, si el usuario selecciona la opción 5, en vez de salir del programa directamente, 
se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir 
del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, 
caso contrario se vuelve a mostrar el menú.*/

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int num1, num2;
        char opcion;

        // Pedimos al usuario que introduzca los dos números
        System.out.print("Introduce el primer número: ");
        num1 = leer.nextInt();
        System.out.print("Introduce el segundo número: ");
        num2 = leer.nextInt();

        // Bucle principal del programa
        do {
            // Mostramos el menú de opciones
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");

            // Pedimos al usuario que elija una opción
            System.out.print("Elige una opción: ");
            opcion = leer.next().charAt(0);

            // Realizamos la operación correspondiente según la opción elegida
            switch (opcion) {
                case '1':
                    System.out.println("La suma de los números es: " + (num1 + num2));
                    break;
                case '2':
                    System.out.println("La resta de los números es: " + (num1 - num2));
                    break;
                case '3':
                    System.out.println("El producto de los números es: " + (num1 * num2));
                    break;
                case '4':
                    if (num2 != 0) {
                        System.out.println("La división de los números es: " + ((double)num1 / num2));
                    } else {
                        System.out.println("Error: no se puede dividir entre cero");
                    }
                    break;
                case '5':
                    // Preguntamos al usuario si está seguro de querer salir
                    System.out.print("¿Está seguro que desea salir del programa (S/N)? ");
                    char confirmacion = leer.next().charAt(0);
                    if (confirmacion == 'S' || confirmacion == 's') {
                        System.out.println("Saliendo del programa...");
                        return;
                    }
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, elige una opción del 1 al 5");
            }

        } while (opcion != '5');
    }
}

    

