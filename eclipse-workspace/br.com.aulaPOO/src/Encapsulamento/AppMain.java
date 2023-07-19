package Encapsulamento;
import java.util.Scanner;
public class AppMain {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Informe um numero : ");
		int numero = input.nextInt();
		
		Numero num = new Numero(numero);
		
		System.out.println(num.getNumber());
		
		num.setNumber(67);
		
		System.out.println(num.getNumber());
		
	}

}
