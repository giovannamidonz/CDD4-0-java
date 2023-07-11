package Pet;

public class Animal {
	String nome;
	double peso;
	String pelo;
	String cor;


	public Animal(String nome, double peso, String pelo, String cor) {
		this.nome = nome;
		this.peso = peso;
		this.pelo = pelo;
		this.cor  = cor; 
	}
	
	public String comer(){
		return "o animal comeu ";
	}
	public String som() {
		return " o animal fez som";
	}
}