/*
 * Cree un programa que permita generar  matrices cuadradas.
 * Si el usuario elige una matriz Diagonal, los números de la diagonal deben generarse randómicamente
 * 
 * 2021 Victor Bayas
 */
package clases;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GenerarMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m,n,op;
		Scanner sc = new Scanner(System.in);
		System.out.println("=== BIENVENIDO ===");
		System.out.println("Ingrese las dimensiones de la matriz a crear");
		//validacion de entradas
		while(true) {//iteramos hasta romper el bucle
			try {
				System.out.print("Cantidad de filas y columnas: ");
				m=sc.nextInt();
				break;//rompemos el bucle
			} catch (InputMismatchException e) {
				System.out.println("ERROR: El valor ingresado no es un numero entero ");
				sc.next();//limpiamos buffer de scanner
			}
		}
		//creamos matriz de la dimension deseada
		int[][] matriz2 = new int[m][m];
		int filas=matriz2.length, columnas=matriz2[0].length;
		//menu
		System.out.println("\n1) Identidad\n2) Diagonal");
		while(true) {//iteramos hasta romper el bucle
			try {
				System.out.print("Ingrese una opcion (1-2): ");
				op=sc.nextInt();
				break;//rompemos el bucle
			} catch (InputMismatchException e) {
				System.out.println("ERROR: El valor ingresado no es un numero entero ");
				sc.next();//limpiamos buffer de scanner
			}
		}
		sc.close();
		switch(op) {
		case 1:
			System.out.println("\n=== MATRIZ GENERADA ===\n");
			for(int i=0;i<filas;i++) {
				for(int j=0;j<columnas;j++) {
					if(i==j) {
						matriz2[i][j]=1;
					}
					else {
						matriz2[i][j]=0;
					}
					System.out.print(matriz2[i][j]+"\t");
				}
				System.out.println();
			}
			break;
		case 2:
			System.out.println("\n=== MATRIZ GENERADA ===\n");
			for(int i=0;i<filas;i++) {
				for(int j=0;j<columnas;j++) {
					if(i==j) {
						matriz2[i][j]=(int)(Math.random()*50);
					}
					else {
						matriz2[i][j]=0;
					}
					System.out.print(matriz2[i][j]+"\t");
				}
				System.out.println();
			}
			break;
		default:
			System.out.println("ERROR: La opcion seleccionada no existe");
		}
	}
}
