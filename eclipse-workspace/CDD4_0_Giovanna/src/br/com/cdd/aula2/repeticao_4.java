package br.com.cdd.aula2;
import java.util.Scanner;
public class repeticao_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double soma = 0;

		System.out.println("Informe quando alunos tem na turma ");
		int alunos = input.nextInt();
		int count = alunos;
		while(count > 0) {
			System.out.println("Informe a nota do aluno");
			double nota = input.nextDouble();

			
			soma = nota + soma ;
			count--;	
		}
		
		System.out.println("a quantidade de alunos é :" + alunos);
		System.out.println("A soma das notas do aluno é : "+ soma);
		double mediaAritmetica = soma / alunos;
		System.out.println("Media da turma é : " + mediaAritmetica );
		
		

	}

}
