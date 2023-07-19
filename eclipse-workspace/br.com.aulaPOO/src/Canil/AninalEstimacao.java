package Canil;

public class AninalEstimacao {

	private String nome;
	private String animal;
	private int idade;
	
	public AninalEstimacao(String nome, String animal, int idade) {
		this.nome = nome;
		this.animal = animal;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getAnimal() {
		return animal;
	}
	public void setAnimal(String animal) {
		this.animal = animal;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Aninal de Estimacao \n nome do animal = " + nome +  
				",\n tipo do animal = " + animal +
				",\n idade do animal =  " + idade + " anos" ;
	}
	

}
