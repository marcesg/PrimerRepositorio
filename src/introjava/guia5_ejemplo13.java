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
public class guia5_ejemplo13 {



    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
/*Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros 
de equipo y define su tipo de dato de tal manera que te permita alojar
sus nombres más adelante.*/
        String[] equipo = new String[9]; //vector, somos 9 los inegrantes

  /* Utilizando un Bucle for, aloja en el vector Equipo, los nombres de t
        us compañeros de equipo*/      
        System.out.println("Ingrese el nombre de los 9 integrantes del equipo:");

        for (int i = 0; i < equipo.length; i++) {
            System.out.print("Integrante n° " + (i+1) + ": "); //Pedimos los nombres
            equipo[i] = leer.nextLine(); //leemos los nombres y almacenamos
        }
        
        System.out.println(" ");
        System.out.println("Los integrantes del equipo son:");
        System.out.println(" ");
        
        for (int i = 0; i < equipo.length; i++) {
            System.out.println("Los integrantes son: n° " + (i+1) +" - "+ equipo[i]);
        }
    }
}
