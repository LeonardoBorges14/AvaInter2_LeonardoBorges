package avaInter2_LeonardoBorges;

public class Produto {

	private int codigo;
	private String nome;
	private String unidade;
	private double preco;
	
	
	public Produto(int codigo, String nome, String unidade, double preco) {
		this.codigo = codigo;
		this.nome = nome;
		this.unidade = unidade;
		this.preco = preco;	
	}
	
	public Produto() {
		
	}
	
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getUnidade() {
		return unidade;
	}
	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	

}
