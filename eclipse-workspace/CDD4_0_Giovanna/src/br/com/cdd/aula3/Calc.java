package br.com.cdd.aula3;
import java.util.Scanner;
public class Calc {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
	somatorioMultiplico();	
	}
	
	public static void somatorioMultiplico() {
		int somatorio3 = 0; 
		int somatorio5 = 0;
		
		for(int i = 1;i <= 20; i++) {
			if( ( i % 3 ) == 0 ){
				somatorio3 = i + somatorio3;
			}else if(( i % 5 ) == 0) {
				somatorio5 = i + somatorio5;
			}
		}
		
		System.out.println("O somatorio dos multiplicos de 3  : " + somatorio3 );
		System.out.println("O somatorio dos multiplicos de 5  : " + somatorio5);
		
	}
//array e so um tipo de dado e é um tamannho unico e imutavél ;
}
/*	int soma3 = 0; 

for(int i = 1;i < 20; i++) {
if((i%3)==0) {
	soma3 = i + soma3;
	
}
}

int soma5 = 0; 

for(int i = 1;i < 20; i++) {
if((i%5)==0) {
	soma5 = i + soma5;
	
}
}
}*/