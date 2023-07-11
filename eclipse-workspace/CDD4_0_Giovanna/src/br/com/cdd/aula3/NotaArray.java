package br.com.cdd.aula3;
import java.util.Scanner;
public class NotaArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double media = 0;
		double[] notaAluno = new double[5];
		
		for(int i = 0; i < notaAluno.length; i++) {
			System.out.println("Digite o valor da nota : ");
			notaAluno[i] = input.nextDouble();
			media = notaAluno[i] / notaAluno.length ;
				
		}
		System.out.println(media);
	}

}
