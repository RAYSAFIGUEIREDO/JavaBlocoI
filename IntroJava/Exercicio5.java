package lista1;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		
		
		int x, somaNumeros = 0;
		System.out.println("entre com o numero:  ");
		x = sc.nextInt();
		
		
		do {
			somaNumeros = somaNumeros + x;
			System.out.println("entre com um numero:  ");
			x = sc.nextInt();
		}
		while (x!=0);
		 System.out.println("A soma é:  " + somaNumeros);
		 sc.close();

		
		
		

	}

}

