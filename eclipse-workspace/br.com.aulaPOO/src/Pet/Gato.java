package Pet;

public class Gato extends Animal {
	public Gato(String nome, double peso, String cor, String pelo) {
		super(nome,peso,cor,pelo);
	}
	public String som() {
		return "Está miando";
	}
}
	
