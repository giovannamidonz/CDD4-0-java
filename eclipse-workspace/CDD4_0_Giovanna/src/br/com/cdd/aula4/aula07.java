package br.com.cdd.aula4;
import java.util.Scanner;
import java.util.StringTokenizer;
public class aula07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um texto");
		String texto = input.nextLine();
		
		StringTokenizer texto1 = new StringTokenizer("tua mae");
		
		System.out.println(texto1.countTokens());
		
		StringTokenizer texto2 = new StringTokenizer(texto);
		System.out.println(texto2.countTokens());

	}

}

//conta quantas palavras tem no texto ;
