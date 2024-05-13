package exercise5;
//
public class Produto {
	
	private String nome;
	private int codigo;
	private static int proximoCodigo = 1;
	private int qtdEstoque;
	private double precoUnidade;
	
	public Produto(String nome, int qtdEstoque, double precoUnidade){
		this.codigo = proximoCodigo++;
		this.nome = nome;
		this.qtdEstoque = qtdEstoque;
		this.precoUnidade = precoUnidade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public int getQtdEstoque() {
		return qtdEstoque;
	}
	
	public double getPrecoUnidade() {
		return precoUnidade;
	}
	
	
 
}