package exercicio_fixacao;

public class Product {
	private String nome;
	private Double valor;
	private int qtd;
	
	public Product() {}

	public Product(String nome, Double valor, int qtd) {
		this.nome = nome;
		this.valor = valor;
		this.qtd = qtd;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	
	public double totalValor() {
		return valor * qtd;
	}

}
