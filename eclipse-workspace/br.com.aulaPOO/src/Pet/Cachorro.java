package Pet;

public class Cachorro extends Animal{
	public Cachorro(String nome, double peso, String cor, String pelo) {
		super(nome,peso,cor,pelo);
	}
	
	public String som() {
		return "Está latindo";
	}
}
