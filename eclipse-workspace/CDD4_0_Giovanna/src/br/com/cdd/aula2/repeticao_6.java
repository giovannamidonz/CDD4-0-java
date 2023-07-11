package br.com.cdd.aula2;
import java.util.Scanner;
public class repeticao_6 {

	public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	 
	 System.out.println("informe um valor inteiro");
	 int inteiro = input.nextInt();
	 int i= 1;
	 
	 while(i <= inteiro){
		inteiro--;
		 if((inteiro % 2 )==0){
			 System.out.println(inteiro + " pares");
		 }
			 
			 
			 
			 
		 	
	 	}
	}
}

