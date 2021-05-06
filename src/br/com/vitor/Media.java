package br.com.vitor;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		
		
		Scanner tec = new Scanner(System.in);
		System.out.println("Informe o nome: ");
		String nome = tec.next();
		
		
		System.out.println("Informe a primeira nota : ");
		double nota1 = tec.nextDouble();
		System.out.println("Informe a segunda nota : ");
		double nota2 = tec.nextDouble();
		System.out.println("Informe a terceira nota : ");
		double nota3 = tec.nextDouble();
		System.out.println("Informe a quarta nota : ");
		double nota4 = tec.nextDouble();
		
		System.out.println(nota1 + "-" + nota2 + "-" + nota3 + "-" + nota4  );
		double media = (nota1 + nota2 + nota3 + nota4 )/4 ;
		System.out.println(media);
		
		if(media >= 7) {
			System.out.println(nome + " voce foi aprovado" );
		} else if (media  < 7 && media > 4 ) {
			System.out.println(nome + " voce ficou em exame"); 
		} else  {
			System.out.println("voce reprovou");
	
			
		
		}
		
	}

}

	


