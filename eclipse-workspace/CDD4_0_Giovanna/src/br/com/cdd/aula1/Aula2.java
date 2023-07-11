package br.com.cdd.aula1;
import java.util.Scanner;
public class Aula2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Informe um valor para a: ");
		int a = input.nextInt();
		System.out.println("Informe um valor para b");
		int b  = input.nextInt();
		
		boolean c = true;
		boolean d = false;
		
		System.out.println(!c);
		System.out.println(!d);
		
		System.out.println(~a);
		System.out.println(~b);
		
		/*
		if (a <= b ) {
			System.out.println("te gusto");
		}else if (b <= a) {
			System.out.println("te odeio");
		}else {
			System.out.println("morno");
		}
	
		
		for(int i = 0 ; i < a; i++) {
			System.out.println(i);
		*/
		int x = 3 ;
		int z = 4 ;
		int p = 7 ;
		
		System.out.println((x+z)/p);
		
		System.out.println(!((x > z) && (z < p)));
		
		if(x++ >= z) {
			System.out.println(--p);
		}else {
			System.out.println(p++);
		}
	}
		
}
	
	// xor é um opcao escusiva ou e verdadeiro ou e falso 


