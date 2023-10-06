package Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

import Set.Ordenacao.CadastroProdutos;

public class EstoqueProdutos {
    
    private Map<Long, Produto> listaProdutos;

    public EstoqueProdutos() {
        this.listaProdutos = new HashMap<>();
      }
    
      public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        listaProdutos.put(cod, new Produto(nome, preco, quantidade));
      }

      public void exibirProdutos() {
        System.out.println(listaProdutos);
      }

      public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0d;
        for (Produto p : listaProdutos.values()) {
            valorTotalEstoque += p.getQuantidade() * p.getPreco();
        }
        return valorTotalEstoque;
      }

      public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        for (Produto p : listaProdutos.values()) {
          if (p.getPreco() > maiorPreco) {
            produtoMaisCaro = p;
            maiorPreco = p.getPreco();
          }
        }
        return produtoMaisCaro;
      }
    
      public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        for (Produto p : listaProdutos.values()) {
          if (p.getPreco() < menorPreco) {
            produtoMaisBarato = p;
            menorPreco = p.getPreco();
          }
        }
        return produtoMaisBarato;
      }
      //Retorna o produto que está em maior quantidade no estoque, 
      //considerando o valor total de cada produto (quantidade * preço).
      public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produto produtoMaiorQuantidadeValorNoEstoque = null;
        double maiorValorTotalProdutoEstoque = 0d;
          for (Map.Entry<Long, Produto> entry : listaProdutos.entrySet()) {
              double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
            if (valorProdutoEmEstoque > maiorValorTotalProdutoEstoque) {
              maiorValorTotalProdutoEstoque = valorProdutoEmEstoque;
              produtoMaiorQuantidadeValorNoEstoque = entry.getValue();
            }
        }
          return produtoMaiorQuantidadeValorNoEstoque;
      }

      public static void main(String[] args) {
        // Criando uma instância do CadastroProdutos
        EstoqueProdutos cadastroProdutos = new EstoqueProdutos();

        // Adicionando produtos ao cadastro
        cadastroProdutos.adicionarProduto(1, "Smartphone", 1000, 10);
        cadastroProdutos.adicionarProduto(2, "Notebook", 1500, 5);
        cadastroProdutos.adicionarProduto(1, "Mouse", 30, 20);
        cadastroProdutos.adicionarProduto(4, "Teclado", 50, 15);

        // Exibindo todos os produtos no cadastro
        cadastroProdutos.exibirProdutos();

        // Exibindo produtos mais caro 
        System.out.println("Mais Caro: " + cadastroProdutos.obterProdutoMaisCaro());

        // Exibindo produtos mais barato
        System.out.println("Mais Barato: " + cadastroProdutos.obterProdutoMaisBarato());

        System.out.println(cadastroProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
    }
}
