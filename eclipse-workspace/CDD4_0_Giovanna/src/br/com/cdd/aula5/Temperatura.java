package br.com.cdd.aula5;
import java.util.Scanner;
public class Temperatura {
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
	System.out.println("Qual temperatura você deseja \n [C] - celsius \n [F} - farheinheit");
	char temp = input.next().charAt(0);
	
	calcTemperatura(temp);

	}
	

	public static double calcTemperatura(char temp ) {
		if( temp == 'C' || temp == 'c') {
			System.out.println("informe o valor da temperatura em Celsius ");
			double c = input.nextDouble();
			double f = (c * 9 / 5 ) + 32;
			System.out.println("o valor do Celsius para farheinheit é : " + f);
			
		}else if( temp == 'F' || temp == 'f') {
			System.out.println("informe o valor da temperatura em Fahrenheit ");
			double f = input.nextDouble();
			double c =  (f - 32) * 5/9;
			System.out.println("o valor do Fahreinheit para Celsius é : " + c);
		}
		return temp;
	}
}


