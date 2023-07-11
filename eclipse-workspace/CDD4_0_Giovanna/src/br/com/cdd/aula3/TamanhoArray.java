package br.com.cdd.aula3;
import java.util.Scanner;
public class TamanhoArray {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("informe o tamanho da primeiro array");
		int[] primeiroArray = new int[input.nextInt()];

		System.out.println("informe o tamanho da segunda array");
		int[] segundoArray = new int[input.nextInt()];
		
		for(int j = 0; j < primeiroArray.length; j++) {
			System.out.println("Informe o valor que você deseja adicionar na primeira array");
			primeiroArray[0] = input.nextInt();		
		}
		
		
		for(int i = 0; i < segundoArray.length; i++) {

			System.out.println("informe o valor que você deseja adicionar na segunda array");	
			segundoArray[0]= input.nextInt();
				
		}		
		
		
		if(segundoArray.length >= primeiroArray.length) {
			System.out.println("O Segundo array é maior ");
		}else {
			System.out.println("O Primeiro array é menor");
		}
		
	}

}
