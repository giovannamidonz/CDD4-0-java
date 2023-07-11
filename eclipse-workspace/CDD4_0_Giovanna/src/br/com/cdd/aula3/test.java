package br.com.cdd.aula3;

public class test {

	public static void main(String[] args) {
	char[] jar = {'A','a'};
		
		
	String str = "Hello";
	
	String resultado = str.replace("l","w");
	System.out.println(resultado);
	String resultado2 = str.substring(3);
	System.out.println(resultado2);
	
	String str2 = "Hello World";
	
	int pos = str.indexOf("l");
	System.out.println(pos);
	int pos2 = str.lastIndexOf("l");
	System.out.println(pos2);
	
	
	}

}


//lastIndexOf 