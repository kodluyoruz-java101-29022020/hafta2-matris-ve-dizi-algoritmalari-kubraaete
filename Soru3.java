package com;

import java.util.Random;
import java.util.Scanner;

public class Soru3 {
	public static int row;
	public static int column;

	public static void firstMatrice(int[][] firstMatrice) {
		Random random=new Random();
		for(int i=0; i<row; i++) {
			for(int j=0; j<column; j++) {
				int matriceValue=random.nextInt(10);
				firstMatrice[i][j]=matriceValue;
				System.out.print(firstMatrice[i][j] + " ");
			}
			System.out.print("\n");
		}
	}
	public static void secondMatrice(int[][] secondMatrice) {
		Random random=new Random();
		for(int i=0; i<row; i++) {
			for(int j=0; j<column; j++) {
				int matriceValue=random.nextInt(10);
				secondMatrice[i][j]=matriceValue;
				System.out.print(secondMatrice[i][j] + " ");
			}
			System.out.print("\n");
		}
	}
	public static void matriceCarpimHesaplama(int[][] firstMatrice, int[][] secondMatrice){
		int[][] result=new int[firstMatrice.length][secondMatrice[0].length];
		for(int i=0; i < result.length; i++) {
			
			for(int j=0; j < result[0].length; j++) {
				
				int sonuc = 0;
				for(int k=0; k < secondMatrice.length; k++) {
					sonuc += firstMatrice[i][k] * secondMatrice[k][j];
				}
				result[i][j] = sonuc;
			}
		
		}
		
		for(int i=0; i<result.length; i++) {
			for(int j=0; j<result[0].length; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.print("\n");
		}
	}

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Satýr sayýsý girin.");
		row=scn.nextInt();
		System.out.println("Sütun sayýsý girin.");
		column=scn.nextInt();
		int[][] firstMatrice=new int[row][column];
		int[][] secondMatrice=new int[row][column];
		firstMatrice(firstMatrice);
		secondMatrice(secondMatrice);
		matriceCarpimHesaplama(firstMatrice, secondMatrice);
		

	}

}
