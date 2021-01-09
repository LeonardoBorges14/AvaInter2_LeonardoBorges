package avaInter2_LeonardoBorges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.function.Consumer;


public class AppAvaInter2 {
	
	static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {

		HashMap<String, String> dicionario = new HashMap<String, String>();

		dicionario.put("pc", "Peças");
		dicionario.put("kg", "Kilos");
		dicionario.put("gr", "Gramas");
		dicionario.put("mt", "Metros");
		dicionario.put("cm", "Centimetros");
		dicionario.put("un", "Unidades");
		dicionario.put("ml", "Mililitros");
		dicionario.put("lt", "Litros");

		System.out.print("Digite a quantidade de produtos a serem cadastrados: ");
		int quant = sc.nextInt();
		
		ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
		double preco = 0.0;
		Produto produto = new Produto();
		String unidade;
		
		for (int j = 0; j < quant; j++) {
			
			System.out.println("");
			System.out.print("--CADASTRO DE PRODUTOS--");
			System.out.println("");
			
			System.out.print("Digite o código do produto: ");
			int codigo = sc.nextInt();
			
			System.out.print("Digite o nome do produto: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("Digite a unidade do produto: ");
			unidade = sc.next();
			
			System.out.print("Digite o valor do produto: ");
			preco = sc.nextDouble();

			produto = new Produto(codigo, nome, unidade, preco);

			listaProdutos.add(produto);
		}
		
			
			System.out.println("");
			System.out.print("--CADASTRO DA VENDA--");
			System.out.println("");
			
			System.out.print("Digite o numero da venda: ");
			int numero = sc.nextInt();
			
			System.out.print("Digite a data da venda: ");
			String data = sc.next();
			
			System.out.print("Digite o nome do cliente: ");
			sc.nextLine();
			String nomeCliente = sc.nextLine();

			Venda venda = new Venda(numero, data, nomeCliente);
			Produto prod;
			int cont = 0;
			int opcao = 1;
			do {
				System.out.println("");
				System.out.println("(0) : SAIR");
			for (int i = 0; i < listaProdutos.size(); i++) {
				prod = listaProdutos.get(i);
				System.out.println("("+(i + 1)+")" + " : " + prod.getCodigo() + " - " + prod.getNome());
			}
		
			System.out.println("");
			System.out.print("Escolha um produto: ");
			int produtoEscolhido = sc.nextInt();
			ItemVenda item = new ItemVenda();
			
			if (produtoEscolhido == 0) {
				opcao = 0;
			}
			else {
				listaProdutos.indexOf(produtoEscolhido - 1);
				System.out.print("Informe a quantidade vendida desse produto: ");
				int quantidadeVendida = sc.nextInt();			
				
				item = new ItemVenda(quantidadeVendida, listaProdutos.get(produtoEscolhido - 1).getPreco(), listaProdutos.get(produtoEscolhido - 1));
				venda.itens.add(cont, item);
				cont++;
			}
			
			
			}while (opcao != 0);
			
			for (int x = 0; x < venda.itens.size(); x++) {
				String nomeProd = venda.itens.get(x).getProduto().getNome();
				int quantidadeProd = venda.itens.get(x).getQuantidade();
				String unidadeProd = "";
				for (String a : dicionario.keySet()) {
					if (a.contains(venda.itens.get(x).getProduto().getUnidade()))
					unidadeProd = dicionario.get(a);
				}
				double precoUnidadeProd = venda.itens.get(x).getPreco();
				double precoTotalProd = quantidadeProd * precoUnidadeProd;
				System.out.println("");
				System.out.printf("%s - " , nomeProd);
				System.out.printf("%d " , quantidadeProd);
				System.out.printf("%s - " ,  unidadeProd);
				System.out.printf("R$ %.2f" , precoUnidadeProd);
				System.out.printf(" - R$ %.2f" ,  precoTotalProd);
			}
			
			double total = venda.calcularTotal();
			double impostos = venda.calcularImpostos(total);
			double totalVenda = total + impostos;
			System.out.println("");
			System.out.println("");
			System.out.printf("Total Produtos: R$ %.2f %n" , total);				
			System.out.printf("Total Impostos: R$ %.2f %n" , impostos);
			System.out.printf("Total Venda: R$ %.2f" , totalVenda);


			
	}

}
