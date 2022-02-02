package lista1;

import java.util.Scanner;

public class Exercicio6 {
public static void main(String[] args) {
	
		
	Scanner sc = new Scanner (System.in);
	Scanner ler "new sca"
	
	
	int numero,media,soma =0, quant = 0;
	
	System.out.println("digite um numero:   ");
	numero = sc.nexInt();
	
	do {
		if (numero%3==0) {
			soma =soma + numero;
			quant = quant + 1;
		}
	System.out.println("Digite um nummero:  ");
	numero = sc.nextInt();
	}
	while (numero !=0);
	
	media = (double) soma / quant;
	
	System.out.printf("A media dos múltiplos de 3 é:   %.2f%n ,media");
	ler.close();
	
		}
	}
}
