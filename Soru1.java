package com;

import java.util.Random;
import java.util.Scanner;

public class Soru1 {
	public static void main(String[] args) {
		int[][] matrice=new int[3][3];
		for(int i=0; i<matrice.length; i++) {
			for(int j=0; j<matrice[0].length; j++) {
				Random random=new Random();
				matrice[i][j]=random.nextInt(2);
				System.out.print(matrice[i][j] + " ");
			}
			System.out.print("\n");
		}
		//Hocam algoritmas�n� kurmaya �al��t�m ama hata ald�m ve ilerletemedim.


		
	}
}
