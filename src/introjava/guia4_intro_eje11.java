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
public class guia4_intro_eje11 {
 /*Escribir un programa en java que procese una secuencia de caracteres ingresada
por teclado y terminada en punto, y luego codifique la palabra o frase ingresada
de la siguiente manera: cada vocal se reemplaza por el carácter que se indica en 
la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se mantienen sin cambios.
a = @, e = #, i = $, o = %, u = *
Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación
correspondiente. Utilice la estructura “según” para la transformación. 
Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.*/
    
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese una frase terminada en punto: ");
        String entrada = leer.nextLine();
        String salida = codificarVocales(entrada);
        System.out.println("La nueva frase es: " + salida);
        leer.close();
    }
    
    public static String codificarVocales(String cadena) {
        String resultado = "";
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            switch (c) {
                case 'a':
                    resultado += '@';
                    break;
                case 'e':
                    resultado += '#';
                    break;
                case 'i':
                    resultado += '$';
                    break;
                case 'o':
                    resultado += '%';
                    break;
                case 'u':
                    resultado += '*';
                    break;
                case 'A':
                    resultado += '@';
                    break;
                case 'E':
                    resultado += '#';
                    break;
                case 'I':
                    resultado += '$';
                    break;
                case 'O':
                    resultado += '%';
                    break;
                case 'U':
                    resultado += '*';
                    break;
                default:
                    resultado += c;
                    break;
            }
        }
        return resultado;
    }
}
