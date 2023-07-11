package br.com.cdd.aula4;

public class aula10 {

	public static void main(String[] args) {
		String[] texto = {"a","vida","é","bela"};
		
		//for(int i = 0; i < texto.length ; i++ ) {
			//System.out.print(texto[i].toUpperCase() + " ");
		//}
		
		for(int i = texto.length -1; i >= 0 ; i--) {
			System.out.print(texto[i].toUpperCase() + " ");
			
		}
		//String resultado = new String (texto);
	}

}
