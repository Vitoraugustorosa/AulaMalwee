package br.com.vitor;

public class LacoWhile {

	public static void main(String[] args) {
		int valor = 0;
		System.out.println("Valor" + valor);
		
		while(valor <= 25) {
			System.out.println("-> Valor:" + valor);
			valor = valor ++ 1;
			// valor += 1; < funciona tambem
			// valor ++ < soma somente 1
		}
		System.out.println("Agora valor é: " + valor);
	}

}
