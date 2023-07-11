package br.com.cdd.aula4;

public class aula2 {

	public static void main(String[] args) {
		
		String valor = "CDD4.0 - Java";
		
		System.out.println(valor.compareTo("CDD4.0 - Java") == 0 ? true : false);
		System.out.println(valor.compareTo("CDD4.0 - JAVA") == 0 ? true : false);
		System.out.println(valor.compareToIgnoreCase("CDD.4.0 - JAVA") == 0 ? true : false);
		
	}

}
