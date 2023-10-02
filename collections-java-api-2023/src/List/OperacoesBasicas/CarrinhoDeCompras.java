package List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;


public class CarrinhoDeCompras{

    private List<Item> listaItem;

    public CarrinhoDeCompras() {
        this.listaItem = new ArrayList();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        listaItem.add(new Item(nome, preco, quantidade));
    }
    
    public void removerItem(String nome){
        List<Item> itemRemover = new ArrayList<>();
        for (Item t : listaItem) {
            if (t.getNome().equalsIgnoreCase(nome)) {
                itemRemover.add(t);
            }
        }
        listaItem.removeAll(itemRemover);
    }

    public double calcularValorTotal(){
        double valorTotal = 0.0;
        for (int i = 0; i < listaItem.size(); i++) {
            valorTotal += listaItem.get(i).getPreco() * listaItem.get(i).getQuantidade();
        }

        return valorTotal;
    }

    public void exibirItens(){
        System.out.println(listaItem);
    }

    public static void main(String[] args) {

        CarrinhoDeCompras listaCarrinho = new CarrinhoDeCompras();

        listaCarrinho.adicionarItem("Iphone", 1500.50, 3);
        listaCarrinho.adicionarItem("Carregador", 100, 2);
        listaCarrinho.exibirItens();

        System.out.println("Valor total itens carrinho: " + listaCarrinho.calcularValorTotal());
       
        listaCarrinho.removerItem("Carregador");
        System.out.println("Depois de remover o item");
        listaCarrinho.exibirItens();
    }
}