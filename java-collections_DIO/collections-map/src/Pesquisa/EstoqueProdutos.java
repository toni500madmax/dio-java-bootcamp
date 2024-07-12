package Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutos;

    public EstoqueProdutos() {
        this.estoqueProdutos = new HashMap<>();
    }

    public void adicionarProduto(long codigo, String nome, int quantidade, double preco) {
        estoqueProdutos.put(codigo, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutos);
    }

    public Double calcularEstoqueTotal() {
        double total = 0d;
        if (!estoqueProdutos.isEmpty()) {
            for (Produto p : estoqueProdutos.values()) {
                total += p.getPreco() * p.getQuantidade();
            }
        }
        return total;
    }

    public Produto obterProdutoMaisCaro() {
        Produto prodCaro = null;
        double valor = Double.MIN_VALUE;
        if (!estoqueProdutos.isEmpty()) {
            for (Produto p : estoqueProdutos.values()) {
                if (p.getPreco() > valor) {
                    prodCaro = p;
                    valor = p.getPreco();
                }
            }
        }
        return prodCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.adicionarProduto(123456789, "Caneta", 10, 1.99);
        estoque.adicionarProduto(987654321, "Borracha", 5, 0.99);
        estoque.adicionarProduto(456789123, "Caderno", 20, 2.99);
        estoque.adicionarProduto(123456789, "Lapis", 15, 0.99);
        estoque.exibirProdutos();
        System.out.println(String.format("US$ %.2f.", estoque.calcularEstoqueTotal()));
        System.out.println(estoque.obterProdutoMaisCaro());
    }
}
