package br.com.vitor;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		int pares = 0;
		int impar = 0;
		
		Scanner tec = new Scanner(System.in);
		System.out.println("Informe o primeiro numero: ");
		int numero1 = tec.nextInt();
		
		System.out.println("Informe o segundo numero: ");
		int numero2 = tec.nextInt();
		
		if(numero1 > numero2) {
			while( numero1 >= numero2) {
				System.out.println(numero1);
				
				numero1 -= 1; 
			
				if(numero1 % 2 == 0) {
					pares+=1;		
				} else {
					impar+=1;
				}
			}
		}
		else if(numero1 < numero2) {
			while(numero1 <= numero2) {
				System.out.println(numero1);
				numero1 +=1;	
				
				if (numero1 % 2 == 0){
					pares+=1;
				} else {
					impar+= 1;
			}
			}
		}
				
		
		System.out.println("Quantidade de numeros pares é: " + pares);
		System.out.println("Quantidade de numeros impares é: " + impar);
		
	
	}
}
			
			
				
				
	

