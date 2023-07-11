package br.com.cdd.aula3;

public class forEarch {

	public static void main(String[] args) {
		int[] arrayNum = {10,204,495,132,21,43,67,9,45,23};
		
		int total = 0 ; 
		
		for(int i: arrayNum)
			total += i;
		
		System.out.printf("Total de elementos arrayNUm: %d\n",total);
		
		
	}

}
