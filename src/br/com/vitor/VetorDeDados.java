package br.com.vitor;

import java.util.Scanner;

public class VetorDeDados {


	public static void main(String[] args) { 
		int idade[] = {5, 18, 16,21, 20, 4, 28, 32}; // vetor que contem os dados   // tem que informar qual posição voce quer que imprime // .lenght PARA COMPARAR VARIAVEL COM ULTIMA POSIÇÃO DO TAMANHO DO VETOR
		
		
		Scanner tec = new Scanner(System.in);
		
		String addNovo = "s";
		do {
			System.out.println("informe o index do vetor: ");
			for(int i = 0; i < idade.length; i++) {
				System.out.print(idade[i] + " / ");
			}
			
			System.out.print("Vetor ordenado");
			int aux;
			for(int i = 0; i < idade.length - 1; i++){
				for(int j = i + 1; j < idade.length; j++) {
					if(idade[i]> idade[j]) {
						aux = idade[i];
						idade[i] = idade[j];
						idade[j] = aux;
					}
				}
			}
			
			
			
			System.out.println("->");
			int index = tec.nextInt();
			
			System.out.println("Informe a idade: ");
			idade[index] = tec.nextInt();
	
			System.out.println("Deseja informar uma nova idade? s n ");
			addNovo= tec.next();
		}while(addNovo.equals("s"));
		
		for( int i = 0; i < idade.length; i++) {  
			System.out.println(idade[i]);

		}
	}
}
