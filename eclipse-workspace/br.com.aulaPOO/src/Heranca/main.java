package Heranca;
import java.util.Date;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno primeiro = new Aluno("Jose Francisco", "123.456.789-00",new Date());
		System.out.println("Veja como os atrivutos foram preenchidos \n\n Nome: " + primeiro.nome);
		System.out.println("CPf : " + primeiro.cpf);
		System.out.println("Data de nascimento: "+ primeiro.data_nascimento.toString());
	
	}

}
