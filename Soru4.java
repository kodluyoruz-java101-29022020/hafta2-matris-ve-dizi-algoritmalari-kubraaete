package com;

import java.util.Random;
import java.util.Scanner;

public class Soru4 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Dizi boyutu girin");
		int N=scn.nextInt();
		Random random=new Random();
		int[] dizi=new int[N];
		for(int i=0; i<N; i++) {
			dizi[i]=random.nextInt(10);
			System.out.print(dizi[i] + " ");
		}
		//Hocam tekrarlayan sayýyý bulan algoritma ama tekrarlayan sayýyý birkaç defa yazýyor. O kýsmý düzeltemedim.
		for(int i=0; i<dizi.length; i++) {
			int sayac=0;
			for(int j=0; j<i; j++) {
				if(dizi[i]==dizi[j]) {
					sayac++;
					break;
					
				}
			}
			if(sayac>0) {
				System.out.println(dizi[i] + " ");


		}

		}
		
	}


}
