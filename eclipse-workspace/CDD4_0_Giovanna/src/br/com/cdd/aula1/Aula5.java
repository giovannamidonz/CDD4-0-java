package br.com.cdd.aula1;
import java.util.Scanner;
public class Aula5 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("informme o primeiro valor ");
	int a = input.nextInt();
	
	System.out.println("informme o segundo valor ");
	int b = input.nextInt();
	
	System.out.println("informme o terceiro valor ");
	int c = input.nextInt();
	
		/*if (a > b || a > c) {
			System.out.println("valor a");
		}else if (b > a || b > c) {
			System.out.println("valor b ");
		}else {
			System.out.println("valor c ");
		}*/
		
		int number = a > b ? (c > a ? a : c) : (b > c ? b : c);
		System.out.println(number);
	}

}
