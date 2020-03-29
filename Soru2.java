package com;

public class Soru2 {
	public static void main(String[] args) {
		int[][] matrice=new int[3][3];
		matrice[0][0]=1;
		matrice[0][1]=9;
		matrice[0][2]=7;
		matrice[1][0]=8;
		matrice[1][1]=4;
		matrice[1][2]=3;
		matrice[2][0]=9;
		matrice[2][1]=3;
		matrice[2][2]=0;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(matrice[i][j] + " ");
				
			}
			System.out.print("\n");
		}
		int matriceGoster;
		int sayac=0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				matriceGoster=matrice[i][j];
				sayac++;
			}
		}
		for(int i=1; i<=sayac; i++) {
			System.out.print(i + " ");
		}

	}

}
