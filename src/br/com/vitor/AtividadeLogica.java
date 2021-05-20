package br.com.vitor;

import java.util.Scanner;

public class AtividadeLogica {

	public static void main(String[] args) {
		String continuar = "s";
		Scanner tec = new Scanner(System.in);
		int OpcaoMenu;
		String opcao = "s";
		
		do { 
			System.out.println("--- MENU EM JAVA ---");
			System.out.println("1 - Verificar sexo e idade");
			System.out.println("2 - Contagem de valores");
			System.out.println("3 - Tabuada");
			System.out.println("4 - Cadastrar cursos");
			System.out.println("-------");
			System.out.println("Informe a qual opção deseja realizar: ");
			OpcaoMenu = tec.nextInt();
			switch(OpcaoMenu) {
			case 1:
				System.out.println("Informe seu nome: ");
				String nome = tec.next();
				System.out.println("Informe seu ano de nascimento");
				int ano = tec.nextInt();
				int idade = 2021 - ano;
				System.out.println("Informe seu sexo: [M/F]");
				String sexo = tec.next();
				
				if(sexo.equals("m")){
					System.out.println("Masculino");
				}else if(!sexo.equals("m")&&(!sexo.equals("f"))){
					System.out.println("Opção Invalida");
				}
				else {
					System.out.println("Feminino");
				}
				if (idade < 12) {
					System.out.println(" Criança");
				}
				if(idade > 12 && idade <= 18) {
					System.out.println("Voce é jovem");
				}
				if(idade >= 18 && idade <= 65) {
					System.out.println("Voce é adulto");
				}else {
					System.out.println("Idoso");
				}
				if(idade < 16) {
					System.out.println("Não pode votar");
				}
				if(idade >= 16 && idade <=17 && idade > 70) {
					System.out.println("Voto opcional");
				}
				if(idade >=18 && idade < 70) {
					System.out.println("Voto obrigatorio");
				}
				if(idade < 18) {
					System.out.println("Não pode tirar habilitação");
				} else {
					System.out.println("Pode tirar habilitação");	
				}
				break;
			case 2:
				System.out.println("Informe primeiro numero");
				int num1 = tec.nextInt();
				System.out.println("Informe o segundo numero");
				int num2 = tec.nextInt();
				if(num1 > num2) {
					while( num1 >= num2) {
						System.out.println(num1);
						
						num1 -= 1;
					}
				}
				else if(num1 < num2) {
					while(num1 <= num2) {
						System.out.println(num1);
						num1 +=1;
					}
				}
				else {
					System.out.println("Valor igual ao primeiro impossivel realizar");
				}
				break;
			
			case 3:
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
			
			case 4: 
				
				
				
				
			}			
		} while(opcao.equalsIgnoreCase("s"))
		}
	}
}
	
			
							
		
	
				
				
				
			
		
	
