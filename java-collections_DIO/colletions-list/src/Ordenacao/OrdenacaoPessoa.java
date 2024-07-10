package Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    // Na classe Pessoa foi implementada a partir da interface de Comparable do tipo
    // genérico Pessoa.
    // o método Collections.sort() irá automaticamente executar o método da classe
    // Pessoa compareTo(), que especifica a comparação.
    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public List<Pessoa> ordenarPorNome() {
        List<Pessoa> pessoasPorNome = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorNome, new ComparatorPorNome());
        return pessoasPorNome;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacao = new OrdenacaoPessoa();
        ordenacao.adicionarPessoa("Martha Spencer", 25, 1.75);
        ordenacao.adicionarPessoa("Floyd Houston", 35, 1.56);
        ordenacao.adicionarPessoa("Ryan Frank", 45, 1.80);
        ordenacao.adicionarPessoa("Nathaniel Jefferson", 22, 1.90);

        System.out.println(
                "Ordenação por altura:\n" + ordenacao.ordenarPorAltura() +
                        "\n_____________________________________");
        System.out.println("Ordenação por idade:\n" + ordenacao.ordenarPorIdade()
                + "\n_____________________________________");
        System.out.println("Ordenação por nome:\n" + ordenacao.ordenarPorNome()
                + "\n_____________________________________");
    }
}
