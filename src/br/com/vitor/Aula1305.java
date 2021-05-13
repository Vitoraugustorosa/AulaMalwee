package br.com.vitor;

public class Aula1305 {

	public static void main(String[] args) {
		
		int valor = 0;
		
		System.out.println("Valor incial:  +" + valor);
		
		do {
			System.out.println("->" + valor);
			valor++;
		} while(valor <= 10);
		System.out.println("Valor final: " + valor);
		
	}
}