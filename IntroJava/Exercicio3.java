package lista1;

import java.util.Scanner;

public class Exercicio3{

	public static void main(String[] args) {
		
	Scanner sc = new Scanner (System.in);
	int idade, menor21 = 0, maior50 = 0;
	System.out.println("digite sua idade:   ");
	idade = sc.nextInt();
	while (idade != -99) {
		if (idade <21) {
			menor21 = menor21 + 1;
		}
		
		else if (idade> 50) {
			maior50 = maior50 +1;
		}
			
			System.out.println("digite uma idade:   ");
			idade = sc.nextInt();
	}
	
			System.out.println("total de pessoas com menos de 21 anos:"+menor21 );
			
			System.out.println("total de pessoas com 50 anos:"+ maior50);
			
			
		

	}

}
