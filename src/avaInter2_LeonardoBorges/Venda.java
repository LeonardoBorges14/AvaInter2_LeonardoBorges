package avaInter2_LeonardoBorges;

import java.util.ArrayList;

public class Venda {

	private int numero;
	private String data;
	private String nomeCliente;
	ArrayList<ItemVenda> itens = new ArrayList<ItemVenda>();
	
	public Venda(int numero, String data, String nomeCliente) {
		this.numero = numero;
		this.data = data;
		this.nomeCliente = nomeCliente;
	}

	public double calcularTotal() {
		double valor = 0;
		double soma = 0;
		
		for (int i = 0; i < itens.size(); i++) {
			double preco = itens.get(i).getProduto().getPreco();
			int quant = itens.get(i).getQuantidade();
			valor = preco * quant;
			soma+=valor;
		}
		
		return soma;
	}


	public static double calcularImpostos(double v) {

		if (v <= 400.0) {
			return v * 0.05;
		}
		
		else {
			return v * 0.10 + calcularImpostos(v / 2.0);
		}

	}


	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public ArrayList<ItemVenda> getItens() {
		return itens;
	}

	public void setItens(ArrayList<ItemVenda> itens) {
		this.itens = itens;
	}
	
	

}
