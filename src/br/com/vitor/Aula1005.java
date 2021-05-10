package br.com.vitor;

import java.util.Scanner;

public class Aula1005 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Informe um numero inteiro: ");
		int numero = tec.nextInt();
		int multiplicador = 0;
		while(multiplicador < 10) {
			multiplicador +=1;
			System.out.println(numero + "x" + multiplicador + "é : " + (numero*multiplicador));
		
		}
		
		

	}

}
