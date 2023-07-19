package Retangulo;

public class AppRetangulo {

	public static void main(String[] args) {
		Retangulo casa = new Retangulo(9,11);
		System.out.println(casa.toString() + "\n area total = " + casa.calcularArea()+ "\n perimetro = " + casa.perimetro());
	}

}
