package br.com.cdd.aula1;
import java.util.Scanner;
public class Aula4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String number = input.nextInt() % 2 == 0 ? "par" : "impar";
		System.out.println(number);
		
	}

}
