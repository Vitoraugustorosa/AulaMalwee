package br.com.vitor;

import java.util.Scanner;

public class MenuRepete1305 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		String opcao = "s";
		int opcaoDoMenu;
		
		do {
			System.out.println(" MENU ");
			System.out.println(" 1) Tabuada com Do while");
			System.out.println(" 2) tabuada com for ");
			System.out.println(" 3) Editar ");
			System.out.println(" 4) Excluir ");
			System.out.println(" 5) Sair");
			System.out.println(" ----------- ");
			System.out.print(" informe a opção desejada: ");
			opcaoDoMenu = tec.nextInt();
			switch(opcaoDoMenu) {
			
			case 1:
				System.out.println("-- Tabuada---");
				int valor;
				int multiplicador = 0;
				System.out.println("Informe um valor inteiro: ");
				valor = tec.nextInt();
				
				do {
					System.out.println(valor + "x" + multiplicador + "=" + (valor * multiplicador));
					multiplicador += 1;
				} while(multiplicador <= 10);
				break;
			
			case 2:
				System.out.println("--- tabuada for ---");
				int valor2;
				System.out.print("Informe o valor: ");
				valor2= tec.nextInt();
				for(int i = 0; i <=10; i++) {  // i = 0, depois define ele como 0 > faz teste lógico > por final faz encremento 
					System.out.println(valor2 + "x" + i + "=" +(valor2 * i));
				}
				break;
			case 3:
				System.out.println("--- Editar ---");
				break;
			case 4:
				System.out.println("--- Excluir ---");
				break;
			case 5:
				opcao= "n";
			
			
			default:
				System.out.println("opção invalida.");
				break;
				
			}
		
		} while(opcao.equalsIgnoreCase("s"));
		
		System.out.println("Sistema finalizado");
		
		
		// opcao.equalsIgnoreCase("s"));  ignora se a letra é maiuscula ou minuscula 
		// opcao.equals("s")); se digitar em Maisculo ele da false 
	
		
				
				
	
	}
}
