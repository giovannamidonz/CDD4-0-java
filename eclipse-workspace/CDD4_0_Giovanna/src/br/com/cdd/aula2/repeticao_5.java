package br.com.cdd.aula2;

public class repeticao_5 {

	public static void main(String[] args) {
		int i=1 ;
		int cont = 0;
		
		while(i >= 100) {
			cont = i + cont;
			if((i % 2) != 0) {
				System.out.println(i);
			}
		}

	}

}
