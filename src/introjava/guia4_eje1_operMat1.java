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
public class guia4_eje1_operMat1 {
    /*Crea una aplicación que le pida dos números al usuario y este pueda elegir entre 
sumar, restar, multiplicar y dividir. La aplicación debe tener una función para cada
operación matemática y deben devolver sus resultados para imprimirlos en el main. */
   

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        double num1 = leer.nextDouble();
        System.out.print("Introduce el segundo número: ");
        double num2 = leer.nextDouble();
        
        System.out.println("Elige una operación:");
        System.out.println("1 - Sumar");
        System.out.println("2 - Restar");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        int opcion = leer.nextInt();
        
        switch (opcion) {
            case 1:
                System.out.println("Resultado de la suma: " + sumar(num1, num2));
                break;
            case 2:
                System.out.println("Resultado de la resta: " + restar(num1, num2));
                break;
            case 3:
                System.out.println("Resultado de la multiplicación: " + multiplicar(num1, num2));
                break;
            case 4:
                System.out.println("Resultado de la división: " + dividir(num1, num2));
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }
    
    public static double sumar(double num1, double num2) {
        return num1 + num2;
    }
    
    public static double restar(double num1, double num2) {
        return num1 - num2;
    }
    
    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }
    
    public static double dividir(double num1, double num2) {
        return num1 / num2;
    }
}
