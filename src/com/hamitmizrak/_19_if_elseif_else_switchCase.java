package com.hamitmizrak;

public class _19_if_elseif_else_switchCase {
	public static void main(String[] args) {
		
		// if else
		int number1 = 15;
		if (number1 > 10) {
			System.out.println("karar");
			System.out.println("Büyüktür");
		} else {
			System.out.println("Küçüktür");
		}
		
		System.out.println("***********************************");
		// Ternary
		String result = (number1 > 10) ? "Büyüktür" : "Küçüktür";
		System.out.println(result);
		
	}
}
