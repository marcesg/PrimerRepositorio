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
public class guia2_extra5_obraSocial {
    /*Una obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en 
todos los tipos de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para 
los mismos tratamientos que los socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que 
represente el costo del tratamiento (previo al descuento) y determine el importe en efectivo 
a pagar por dicho socio.*/


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese la letra que representa la clase de socio (A, B o C): ");
        char tipoSocio = sc.next().charAt(0);
        
        System.out.print("Ingrese el costo del tratamiento: ");
        double costoTratamiento = sc.nextDouble();
        
        double descuento = 0;
        switch(tipoSocio) {
            case 'A':
                descuento = 0.5;
                break;
            case 'B':
                descuento = 0.35;
                break;
            case 'C':
                descuento = 0;
                break;
            default:
                System.out.println("Tipo de socio incorrecto.");
                return;
        }
        
        double costoFinal = costoTratamiento * (1 - descuento);
        System.out.println("El importe a pagar es: " + costoFinal);
    }
}
