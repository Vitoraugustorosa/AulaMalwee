package br.com.vitor;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		System.out.println("Informe o seu peso: " );
		double peso = tec.nextDouble();
		
		System.out.println("Informe a sua altura: ");
		double altura = tec.nextDouble();
		
		double IMC = peso / (altura*altura) ;
		
		if(IMC <= 18.5 ) {
			System.out.println("Abaixo do peso ");
		} else if (IMC > 18.5 && IMC < 25 ) {
			System.out.println("Peso ideal ");	
		} else if (IMC >= 25 && IMC < 30) {
			System.out.println("Levemente acima do peso ");
		} else if (IMC >= 30 && IMC < 35 ) {
			System.out.println("Obsidade grau I");
		} else if (IMC >= 35 && IMC < 40) {
			System.out.println("Obesidade grau II");
		} else {
			System.out.println("Obesidade grau III (morbida) ");
		
	
		
		
		
		}	
		
	}

}
