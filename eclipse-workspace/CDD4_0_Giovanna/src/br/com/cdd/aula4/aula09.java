package br.com.cdd.aula4;
import java.util.Scanner;
public class aula09 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("digite um texto");
		String texto = input.nextLine();
		
		System.out.println(texto.toUpperCase());
	}

}
