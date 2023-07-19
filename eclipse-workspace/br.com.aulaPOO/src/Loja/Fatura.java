package Loja;

public class Fatura {
	private String numero;
	private String descricao;
	private int quantidade;
	private double preco;
	
	public Fatura(String numero,String descricao, int quant, double preco) {
		this.numero = numero;
		this.descricao = descricao ;
		this.preco = preco;
		this.quantidade = quant;
	}
	
	public Fatura(String numero) {
		this.numero = numero;
	}
	
	public Fatura(String descricao, double preco) {
		
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public double getTotalFatura(double valorFatura) {
	valorFatura = this.preco * this.quantidade;
		if(valorFatura < 0 ) {
			valorFatura = 0;
		}
		if(preco < 0) {
			preco = 0.0;
		}
		return valorFatura;
	}

	@Override
	public String toString() {
		return "Fatura \n numero= " + numero + ",\n descricao= " + descricao +
				",\n quantidade= " + quantidade + ",\n preco= "
				+ preco ; 
	}
	
	
}
