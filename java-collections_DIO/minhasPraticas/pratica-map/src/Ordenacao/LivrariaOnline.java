package Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public class LivrariaOnline {
    private Map<String, Livro> livros;

    public LivrariaOnline() {
        livros = new HashMap<>();
    }

    public void adicionarLivro(String isbn, String titulo, String autor, double preco) {
        livros.put(isbn, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo) {
        livros.values().removeIf(livro -> livro.getAutor().equalsIgnoreCase(titulo));
    }

    public List<Livro> pesquisarLivrosPorAutor(String autor) {
        List<Livro> livrosDoAutor = new ArrayList<>();
        for (Map.Entry<String, Livro> entry : livros.entrySet()) {
            if (entry.getValue().getAutor().equalsIgnoreCase(autor)) {
                Livro livroDoAutor = entry.getValue();
                livrosDoAutor.add(livroDoAutor);
            }
        }
        return livrosDoAutor;
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorPreco() {
        List<Map.Entry<String, Livro>> livrosOrdenadosPorPreco = new ArrayList<>(livros.entrySet());
        Collections.sort(livrosOrdenadosPorPreco, new ComparatorPorPreco());
        Map<String, Livro> livrosOrdenados = new LinkedHashMap<>();
        for (Map.Entry<String, Livro> entry : livrosOrdenadosPorPreco) {
            livrosOrdenados.put(entry.getKey(), entry.getValue());
        }
        return livrosOrdenados;
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorTitulo() {
        List<Map.Entry<String, Livro>> livrosOrdenadosPorTitulo = new ArrayList<>(livros.entrySet());
        Collections.sort(livrosOrdenadosPorTitulo, new ComparatorPorTitulo());
        Map<String, Livro> livrosOrdenados = new LinkedHashMap<>();
        for (Map.Entry<String, Livro> entry : livrosOrdenadosPorTitulo) {
            livrosOrdenados.put(entry.getKey(), entry.getValue());
        }
        return livrosOrdenados;
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorAutor() {
        List<Map.Entry<String, Livro>> livrosOrdenadosPorAutor = new ArrayList<>(livros.entrySet());
        Collections.sort(livrosOrdenadosPorAutor, new ComparatorPorAutor());
        Map<String, Livro> livrosOrdenados = new LinkedHashMap<>();
        for (Map.Entry<String, Livro> entry : livrosOrdenadosPorAutor) {
            livrosOrdenados.put(entry.getKey(), entry.getValue());
        }
        return livrosOrdenados;
    }

    public List<Livro> obterLivroMaisCaro() {
        List<Livro> livroMaisCaro = new ArrayList<>();
        double maiorPreco = Double.MIN_VALUE;
        if (!livros.isEmpty()) {
            for (Livro l : livros.values()) {
                if (l.getPreco() > maiorPreco) {
                    maiorPreco = l.getPreco();
                }
            }
        } else {
            throw new NoSuchElementException("A livraria está vazia!");
        }
        for (Map.Entry<String, Livro> entry : livros.entrySet()) {
            if (entry.getValue().getPreco() == maiorPreco) {
                Livro livroComMaiorPreco = livros.get(entry.getKey());
                livroMaisCaro.add(livroComMaiorPreco);
            }
        }
        return livroMaisCaro;
    }

    public List<Livro> obterLivroMaisBarato() {
        List<Livro> livrosMaisBaratos = new ArrayList<>();
        double MenorPreco = Double.MAX_VALUE;
        if (!livros.isEmpty()) {
            for (Livro l : livros.values()) {
                if (l.getPreco() < MenorPreco) {
                    MenorPreco = l.getPreco();
                }
            }
        } else {
            throw new NoSuchElementException("A livraria está vazia!");
        }
        for (Map.Entry<String, Livro> entry : livros.entrySet()) {
            if (entry.getValue().getPreco() == MenorPreco) {
                Livro livroComMenorPreco = livros.get(entry.getKey());
                livrosMaisBaratos.add(livroComMenorPreco);
            }
        }
        return livrosMaisBaratos;
    }

    public static void main(String[] args) {
        LivrariaOnline livrariaOnline = new LivrariaOnline();
        // Adiciona os livros à livraria online
        livrariaOnline.adicionarLivro("https://amzn.to/3EclT8Z", "1984", "George Orwell", 50d);
        livrariaOnline.adicionarLivro("https://amzn.to/47Umiun",
                "A Revolução dos Bichos", "George Orwell", 7.05d);
        livrariaOnline.adicionarLivro("https://amzn.to/3L1FFI6",
                "Caixa de Pássaros - Bird Box: Não Abra os Olhos", "Josh Malerman", 19.99d);
        livrariaOnline.adicionarLivro("https://amzn.to/3OYb9jk", "Malorie", "Josh Malerman", 5d);
        livrariaOnline.adicionarLivro("https://amzn.to/45HQE1L",
                "E Não Sobrou Nenhum", "Agatha Christie", 50d);
        livrariaOnline.adicionarLivro("https://amzn.to/45u86q4",
                "Assassinato no Expresso do Oriente", "Agatha Christie", 5d);

        // Exibe todos os livros ordenados por preço
        System.out.println("Livros ordenados por preço: \n" + livrariaOnline.exibirLivrosOrdenadosPorPreco());

        // Exibe todos os livros ordenados por autor
        System.out.println("Livros ordenados por autor: \n" + livrariaOnline.exibirLivrosOrdenadosPorAutor());

        // Exibe todos os livros ordenados por titulo
        System.out.println("Livros ordenados por titulo: \n" + livrariaOnline.exibirLivrosOrdenadosPorTitulo());

        // Pesquisa livros por autor
        String autorPesquisa = "Josh Malerman";
        livrariaOnline.pesquisarLivrosPorAutor(autorPesquisa);

        // Obtém e exibe o livro mais caro
        System.out.println("Livro mais caro: " + livrariaOnline.obterLivroMaisCaro());

        // Obtém e exibe o livro mais barato
        System.out.println("Livro mais barato: " + livrariaOnline.obterLivroMaisBarato());

        // Remover um livro pelo título
        livrariaOnline.removerLivro("1984");
        System.out.println(livrariaOnline.livros);

    }
}
