package br.com.vitor;

public class EstruturaCondicional {

	public static void main(String[] args) {
		int idade = 25;
				if(idade < 12) {
					System.out.println("Criança");
				} else if(idade <= 18) {
					System.out.println("jovem");
				} else if(idade <= 18) {
					System.out.println("Adulto");
				} else {
					System.out.println("Idoso");
				}

	}

}
