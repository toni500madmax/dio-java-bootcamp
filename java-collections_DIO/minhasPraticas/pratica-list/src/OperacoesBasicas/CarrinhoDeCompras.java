package OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        Item itemNome = null;
        for (Item i : itens) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                itemNome = i;
                itens.remove(itemNome);
            }
        }
    }

    public Double calcularValorTotal() {
        Double total = 0.0;
        for (Item i : itens) {
            total += i.getPreco() * i.getQuantidade();
        }
        return total;
    }

    public void exibirItens() {
        System.out.println(itens);
    }

    public static void main(String[] args) {

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Notebook", 2000.0, 2);
        carrinho.adicionarItem("Mouse", 50.0, 10);
        carrinho.adicionarItem("Teclado", 100.0, 5);

        System.out.println(carrinho.itens);

        carrinho.removerItem("Mouse");
        System.out.println(carrinho.itens);

        System.out.println("Valor total: " + carrinho.calcularValorTotal());
        carrinho.exibirItens();
    }
}
