package com.hamitmizrak;

import java.util.Scanner;

public class _22x1_Faktoriyel {
	
	// user data
	public static int useData() {
		Scanner klavye = new Scanner(System.in);
		System.out.println("+++++++\nLutfen bir sayi giriniz");
		int number = klavye.nextInt();
		return number;
	}
	
	// iterative faktoriyel method
	public static Integer iterativeFactoriyel(int facNumber) throws HamitMizrakException {
		int temp = 1;// carpmada etkisiz eleman 1
		if (facNumber < 0)
			throw new HamitMizrakException("Sifirdan kucuk sayi girmeyiniz");
		if (facNumber == 0 || facNumber == 1) {
			return 1;
		} else {
			for (int i = facNumber; i >= 1; i--) {
				temp *= i;
			}
		}
		return temp;
	}
	
	// recursive faktoriyel method
	public static Integer recursiveFactoriyel(int facNumber) throws HamitMizrakException {
		if (facNumber < 0)
			throw new HamitMizrakException("Sifirdan kucuk sayi girmeyiniz");
		if (facNumber == 0 || facNumber == 1) {
			return 1;
		}
		return facNumber * recursiveFactoriyel(facNumber - 1);
	}
	
	public static void main(String[] args) throws HamitMizrakException {
		// for (;;) {
		// int result = iterativeFactoriyel(useData());
		// System.out.println(result);
		// }
		
		while (true) {
			int result = recursiveFactoriyel(useData());
			System.out.println(result);
		}
		
	}
	
}
