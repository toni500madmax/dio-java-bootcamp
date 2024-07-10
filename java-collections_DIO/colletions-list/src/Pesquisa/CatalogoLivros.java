package Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livrosList;

    public CatalogoLivros() {
        this.livrosList = new ArrayList<>();
    }

    // A adição de um objeto, usamos o new objeto() com os parâmetros do contrutor
    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livrosList.add(new Livro(titulo, autor, anoPublicacao));
    }

    // Técnicas de pesquisa:
    // 1. sempre criar uma lista ou objeto antes da iteração, para ter onde ter o
    // que retornar da função.
    // 2. usar o comparador isEmpty() para descartar pesquisa se não houver nenhum
    // livro ainda.
    // 3. iterar com um laço for enxuto do tipo do objeto dentro do array.
    // 4. usar o método equalsIgnoreCase() para comparar valores de objetos, não
    // referências.
    // 5. Salvar o objeto dentro do array para retornar.
    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<Livro>();
        if (!livrosList.isEmpty()) {
            for (Livro l : livrosList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAno(int anoInicial, int anoFinal) {
        List<Livro> livrosPorAno = new ArrayList<>();
        if (!livrosList.isEmpty()) {
            for (Livro l : livrosList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorAno.add(l);
                }
            }
        }
        return livrosPorAno;
    }

    // neste caso terá a diferença que o livro deve ser único, portanto ao encontrar
    // pode para de buscar e retorná-lo.
    public Livro pesquisaPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livrosList.isEmpty()) {
            for (Livro l : livrosList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();
        catalogo.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogo.adicionarLivro("Livro 2", "Autor 2", 2002);
        catalogo.adicionarLivro("Livro 3", "Autor 3", 2010);
        catalogo.adicionarLivro("Livro 4", "Autor 4", 1994);
        catalogo.adicionarLivro("Livro 5", "Autor 4", 1987);

        System.out.println(catalogo.pesquisarPorAutor("Autor 4"));
        System.out.println(catalogo.pesquisarPorIntervaloAno(1995, 2005));
        System.out.println(catalogo.pesquisaPorTitulo("Livro 3"));
    }
}
