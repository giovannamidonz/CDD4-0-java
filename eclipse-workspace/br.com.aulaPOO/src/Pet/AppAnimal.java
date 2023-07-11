package Pet;
import java.util.Scanner;
public class AppAnimal {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		Gato cat = new Gato("mia",3,"preto e branco","peludo");
		Cachorro dog = new Cachorro("Anny",9, "preto", "raso");
		
		System.out.println("o nome do seu Gato : " + cat.nome);
		System.out.println("o peso do seu Gato : " + cat.peso);
		System.out.println("o tipo de cor do seu Gato : " + cat.pelo);
		System.out.println("a cor do seu Gato : " + cat.cor);
		System.out.println(cat.comer());
		System.out.println(cat.som());
		System.out.println("-------------------------------------------");
		System.out.println("o nome do seu Cachorro : " + dog.nome);
		System.out.println("o peso do seu Cachorro : " + dog.peso);
		System.out.println("o tipo de pelo do seu Cachorro : " + dog.pelo);
		System.out.println("o tipo de cor do seu Cachorro : " + dog.cor);
		System.out.println(dog.comer());
		System.out.println(dog.som());
	}
	

}
