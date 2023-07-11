package br.com.cdd.aula3;
import java.util.Scanner;
public class QuatroArray {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
	int[] arrayUm = new int[2];
	
	int[] arrayDois = new int[3];
	
	int[] arrayTres = new int[3];
	
	int[] arrayQuatro = new int[4];
	
		for(int i = 0 ; i < arrayUm.length; i++) {
			System.out.println("---------------Digite para Primeira Array---------------");
			arrayUm[i] = input.nextInt();
		}
	
		for(int j = 0 ; j < arrayDois.length; j++) {
			System.out.println("---------------Digite para Segunda Array---------------");
			arrayDois[j] = input.nextInt();
		}
	
		for(int i = 0 ; i < arrayTres.length; i++) {
			System.out.println("---------------Digite para Terceira Array---------------");
			arrayTres[i] = input.nextInt();
		}
		for(int i = 0 ; i < arrayUm.length; i++) {
			System.out.println("---------------Digite para Quarta Array---------------");
			arrayQuatro[i] = input.nextInt();
		}
		
		for(int n : arrayUm) {
			System.out.print(n + " ,");
		}
		for(int m: arrayDois) {
			System.out.print(m + " ,");
		}
		for(int j: arrayTres) {
			System.out.print(j + " ,");
		}
		for(int k : arrayQuatro) {
			System.out.print(k + " ,");
		}

	}
}
