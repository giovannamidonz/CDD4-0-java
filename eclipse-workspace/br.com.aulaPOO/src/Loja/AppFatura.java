package Loja;
import java.util.Scanner;
public class AppFatura {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("informe o numero ");
		String numero = input.nextLine();
		
		System.out.println("informe a descricao ");
		String desc = input.nextLine();
		
		System.out.println("informe a quantidade  ");
		int quant = input.nextInt();
		
		System.out.println("informe o preco ");
		double preco = input.nextDouble();
		
		Fatura compra1 = new Fatura(numero,desc,quant,preco);
		
		System.out.println(compra1.toString() + "\n valor da sua fatura = R$" + compra1.getTotalFatura(preco));
		
		Fatura compra2 = new Fatura(numero);

	}

}
