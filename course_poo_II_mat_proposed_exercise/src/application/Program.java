package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler dois números inteiros M e N, e depois ler uma
		 * matriz de M linhas por N colunas contendo números inteiros, podendo haver
		 * repetições. Em seguida, ler um número inteiro X que pertence à matriz. 
		 * Para cada ocorrência de X, mostrar os valores à esquerda, acima, à direita 
		 * e abaixo de X, quando houver, conforme exemplo.
		 * Exemplo:
		 * 3 4
		 * 10 8 15 12
		 * 21 11 23 8
         * 14 5 13 19
         * 8
         * Position 0,1:
         * Left: 10
         * Right: 15
         * Down: 11
         * Position 1,3:
         * Left: 23
         * Up: 12
         * Down: 19
		 */

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] mat = new int[n][m];
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		int x = sc.nextInt();
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] == x) {
					System.out.printf("Position %d, %d%n", i, j);
					if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if( j < mat[i].length - 1 ) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if (i < mat.length - 1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
				}
			}
		}
	
		sc.close();
	}

}
