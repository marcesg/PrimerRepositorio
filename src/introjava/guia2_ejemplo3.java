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
public class guia2_ejemplo3 {

    public static void main(String[] args) {
//Define variables donde puedas alojar los resultados y prueba usar dos operadores de cada tipo.

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos valores");
        double num1 = leer.nextDouble();
        double num2 = leer.nextDouble();

        //OPERADORES ARITMETICOS 
        System.out.println("--OPERADORES ARIEMETICOS --");
        double suma = num1 + num2;
        System.out.println("La suma es " + suma);
        double resta = num1 - num2;
        System.out.println("La resta es " + resta);
        double mult = num1 * num2;
        System.out.println("La multiplicaciones es " + mult);
        double div = num1 / num2;
        System.out.println("La division de los numeros es " + div);
        double modulo = num1 % num2;
        System.out.println("El modulo es " + modulo);
        //OPERADORES UNARIOS
        System.out.println("   ");
        System.out.println(" -------------------- ");
        System.out.println("--OPERADORES UNARIOS--");
        //Podemos colocar los operadores directamente en el Print.. siempre dolante del numero
        System.out.println("El numero 1 = " + num1 + " en incremento ++ da = " + ++num1);
        System.out.println("El numero 2 = " + num2 + " en decremento -- da = " + --num2);
        /* Como los valores de num1 y num2 han cambiado porque los incrementamos y los decrementamos
        demos volverlos a sus valores originales. es decir, ahora el num1 le tenemos que decrementar
        y al num2 tenemos que incrementarlos.*/
       
       num1 = --num1; 
       num2 = ++num2;
       
        // Tambien podemos colocar en una variable nueva y les damos incremento o decremento
        System.out.println(" ");
        System.out.println("Otra forma de hacerlo, es como otra variable");
        double incremento = num1;
        System.out.println("El numero 1 = " + num1 + " en incremento ++ da = " + ++incremento);
        double decremento = num2;
        System.out.println("El numero 2 = " + num2 + " en decremento -- da = " + --decremento);
        /* En esta forma, solamente nombramos la variable nueva como decremento e incremento
        y le asignamos los valores de cada numero. Luego, en la nueva variable le colocamos
        los simbolos ++ o --
        */
        System.out.println(" ");
     //OPERADORES DE IGUALDAD Y RELACION
     System.out.println(" -------------------- ");
        System.out.println("--OPERADORES DE IGUALDAD Y RELACION--");
        System.out.println("   ");
        boolean logico = num1 < num2;
        System.out.println(num1 + " es menor que " + num2 + "? " + logico);
        boolean logicom = num1 > num2;
        System.out.println(num1 + " es mayor que " + num2 + "? " + logicom);
        boolean logicoi = num1 == num2;
        System.out.println(num1 + " es igual que " + num2 + "? " + logicoi);
        boolean logicomi = num1 <= num2;
        System.out.println(num1 + " es menor o igual que " + num2 + "? " + logicomi);
        boolean logicoim = num1 >= num2;
        System.out.println(num1 + " es mayor o igual que " + num2 + "? " + logicoim);
        boolean logicod = num1 != num2;
        System.out.println(num1 + " es distinto que " + num2 + "? " + logicod);
    }
}
