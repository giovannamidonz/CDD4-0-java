package Canil;
import java.util.Scanner;
public class AppAnimal {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Informe o nome do animal: ");
		String nome = input.nextLine();
		
		System.out.println("Informe o tipo do animal:  ");
		String animal = input.nextLine();
		
		System.out.println("Informe a idade do seu animal: ");
		int idade = input.nextInt();
		AninalEstimacao pet1 = new AninalEstimacao(nome,animal,idade);
		
		System.out.println(pet1.toString() );
	}

}
