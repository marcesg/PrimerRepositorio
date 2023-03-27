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
public class guia5_eje6_cuadradoMagMarcelo {
/* Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 
    1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son idénticas. 
    Crear un programa que permita introducir un cuadrado por teclado y determine 
    si este cuadrado es mágico o no. El programa deberá comprobar que los números
    introducidos son correctos, es decir, están entre el 1 y el 9. */
    
    
    
    /**
     *
     * @author alumno
     */
    /*
    
    // Ejercicio hecho en pseint, lo usamos de modelo
    
//// Una matriz mágica es una matriz cuadrada (tiene igual número de filas que de columnas) que
//// tiene como propiedad especial que la suma de las filas, las columnas y las diagonales es igual.
//// Por ejemplo:
////	2 7 6
////	9 5 1
////	4 3 8
////	
////	En la matriz de ejemplo las sumas son siempre 15. Considere el problema de construir un algoritmo
////	que compruebe si una matriz de datos enteros es mágica o no, y en caso de que sea
////    mágica escribir la suma. Además, el programa deberá comprobar que los números introducidos
////	son correctos, es decir, están entre el 1 y el 9. El usuario ingresa el tamaño de la matriz
////    que no debe superar orden igual a 10.


Algoritmo matriz_magica
	
	Definir matriz, f, c, d, n, m Como Entero
	
	
	
	Escribir "Ingrese el tamaño del cubo"
	//// el tamaño de la matriz no debe superar el orden igual a 10
	////	Entonces hacemos un ciclo Repetir
	Repetir
		Leer n
	Mientras Que n > 10 y n < 0

	m=n
	Dimension matriz(n,m)

	matrizCarga(matriz,n,m)
	Escribir " ************************ "
	matrizMostrar(matriz,n,m)
	Escribir " ************************ "
	matrizMagica(matriz,n,m)
	//Escribir " La matriz es magica? ", magica
	
FinAlgoritmo


////  *********************

SubProceso  matrizCarga(matriz, n, m)
	definir fila, colum, diag Como Entero
	Para fila = 0 Hasta n-1 Con Paso 1 Hacer
		Para colum = 0 Hasta m-1 Con Paso 1 Hacer
			Escribir Sin Saltar "Ingrese un valor para: ", fila+1, " y ", colum+1, " : "
			Repetir
				Leer matriz(fila,colum)
			Mientras Que matriz(fila,colum) < 0 y matriz(fila,colum) > 10
		FinPara
		
	FinPara
	
FinSubProceso

////  *********************
//// mostramos en pantalla los numeros que ingresamos y los 
////dejamos ordenados como un cuadrado

SubProceso matrizMostrar(matriz, n, m)
	Definir fila, colum, diag Como Entero
	
	Para fila = 0 Hasta n-1 Hacer
		Para colum = 0 hasta m-1 Hacer
			si colum <> m-1 Entonces
				Escribir Sin Saltar matriz(fila,colum), " - "
			SiNo
				Escribir matriz(fila,colum)
			FinSi
			
		FinPara
	FinPara
	
FinSubProceso

////  *********************

SubProceso  matrizMagica(matriz, n, m)
	definir fila, colum, diag Como Entero
	Definir diag1, diag2, f, c Como Entero
	Definir magica Como logico
	
	magica=verdadero
	
	diag1=0
	diag2=0
	colum=0
	
	Para fila = 0 Hasta n-1 Con Paso 1 Hacer
		
		colum=colum+matriz(fila,n-1)
		diag1=diag1+matriz(fila,fila) //// fila de izq a der de arriba hacia abajo
		diag2=diag2+matriz(fila,n-1-fila) //// fila de izq a der de abajo hacia arriba
	FinPara
//	Escribir " "
	Escribir "Diagonal 1: ", diag1, " | Diagonal 2: ", diag2 , " | fila: ", colum

	si diag1 = diag2  Entonces
				
		Para fila = 0 Hasta n-1 Hacer
			f=0
			c=0
			Para colum = 0 hasta m-1 Hacer
				f=f+matriz(fila,colum)
				c=c+matriz(colum,fila)
				
			FinPara
			
			si diag1 <> fila o diad1 <> colum o diag1 <> diag2 Entonces
				magica = falso
				fila=n-1
//			sino magica = verdadero
			FinSi
		FinPara
		
	SiNo
		magica=falso
	FinSi
    
	Escribir " La matriz es magica? : ", magica


FinSubProceso

////  *********************

     */
  
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            int[][] matriz;
            int n, m;
            boolean magica;

            do {
                System.out.print("Ingrese el tamaño del cubo (no mayor que 10): ");
                n = input.nextInt();
            } while (n < 0 || n > 10);

            m = n;
            matriz = new int[n][m];

            matrizCarga(matriz, n, m, input);
            System.out.println("************************");
            matrizMostrar(matriz, n, m);
            System.out.println("************************");
            magica = matrizMagica(matriz, n, m);
            System.out.println("La matriz es mágica? " + magica);
        }

        public static void matrizCarga(int[][] matriz, int n, int m, Scanner input) {
            int fila, colum;
            for (fila = 0; fila < n; fila++) {
                for (colum = 0; colum < m; colum++) {
                    System.out.print("Ingrese un valor para: " + (fila + 1) + " y " + (colum + 1) + ": ");
                    do {
                        matriz[fila][colum] = input.nextInt();
                    } while (matriz[fila][colum] < 1 || matriz[fila][colum] > 9);
                }
            }
        }

        public static void matrizMostrar(int[][] matriz, int n, int m) {
            int fila, colum;
            for (fila = 0; fila < n; fila++) {
                for (colum = 0; colum < m; colum++) {
                    if (colum != m - 1) {
                        System.out.print(matriz[fila][colum] + " - ");
                    } else {
                        System.out.println(matriz[fila][colum]);
                    }
                }
            }
        }

        public static boolean matrizMagica(int[][] matriz, int n, int m) {
            int fila, colum, diag1, diag2, f, c;
            boolean magica = true;

            diag1 = 0;
            diag2 = 0;
            colum = 0;

            for (fila = 0; fila < n; fila++) {
                colum += matriz[fila][n - 1];
                diag1 += matriz[fila][fila]; // fila de izq a der de arriba hacia abajo
                diag2 += matriz[fila][n - 1 - fila]; // fila de izq a der de abajo hacia arriba
            }
            System.out.println("Diagonal 1: " + diag1 + " | Diagonal 2: " + diag2 + " | fila: " + colum);

            if (diag1 == diag2) {
                for (fila = 0; fila < n; fila++) {
                    f = 0;
                    c = 0;
                    for (colum = 0; colum < m; colum++) {
                        f += matriz[fila][colum];
                        c += matriz[colum][fila];
                    }

                    if (diag1 != f || diag1 != c || diag1 != diag2) {
                        magica = false;
                        fila = n - 1;
                    }
                }
            } else {
                magica = false;
            }

            return magica;
        }
    }


