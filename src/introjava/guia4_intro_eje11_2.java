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
public class guia4_intro_eje11_2 {
  public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        
        reemplazo(frase);  
     
    }
    
    public static void reemplazo(String frase){
        for (int i = 0; i < frase.length(); i++) {
             String aux = frase.substring(i, i+1);
        
           switch (aux) {
              case "A":
                      System.out.print("@");
                  break;
              case "E":
                  System.out.print("#");
                  break;
              case "I":
                  System.out.print("$");
                  break;
              case "O":
                  System.out.print("%");
                  break;
              case "U":
                  System.out.print("*");
                  break; 
              default: System.out.print(aux);
            } 
           
        }
        System.out.println("");  
    }            
      
}
