package Retangulo;

public class Retangulo {
	private double base;
	private double altura;
	
	public Retangulo(double base, double altura) {
		this.altura = altura;
		this.base = base;
	}
	public Retangulo() {
		
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double calcularArea() {
		double area = this.base * this.altura;
		return area;
	}
	
	public double perimetro() {
		double perimetro = Math.sqrt(base + altura);
		return perimetro;
	}

	@Override
	public String toString() {
		return "o valor da base= " + base + 
				", o valor da altura= " + altura ;
	}
	
	
}
