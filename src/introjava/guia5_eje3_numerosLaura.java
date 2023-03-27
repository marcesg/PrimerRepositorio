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
public class guia5_eje3_numerosLaura {
  public static void main(String[] args) {  
    int N;
        int cont1=0; 
        int cont2=0;
        int cont3=0;
        int cont4=0;
        int cont5=0;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("De qué tamaño será el vector");
        N=leer.nextInt();
        
        int [] vector = new int [N];
        
        for (int i = 0; i < N; i++) {
            vector[i]= (int) (Math.random()*99999+1); 
            if (vector[i]<10) {
                cont1+=1;
                
            }else if (vector[i]<100) {
                cont2+=1; 
                
            } else if (vector[i]<1000) {
                cont3+=1; 
                
            } else if (vector[i]<10000){
                cont4+=1;
                
            } else  
                cont5+=1;
            }
        
            System.out.println("Números de 1 dígito " + cont1);
            System.out.println("Números de 2 dígito " + cont2);
            System.out.println("Números de 3 dígito " + cont3);
            System.out.println("Números de 4 dígito " + cont4);
            System.out.println("Números de 5 dígito " + cont5);
            
            
        }
    
}

