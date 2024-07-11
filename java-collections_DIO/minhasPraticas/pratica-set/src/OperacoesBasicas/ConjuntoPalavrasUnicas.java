package OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> conjuntoPalavras;

    public ConjuntoPalavrasUnicas() {
        this.conjuntoPalavras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        conjuntoPalavras.add(palavra);
    }

    public void removerPalavra(String palavraRemove) {
        conjuntoPalavras.remove(palavraRemove);
    }

    public String verificarPalavra(String palavraVerifica) {
        String palavraEncontrada = null;
        for (String s : conjuntoPalavras) {
            if (s.equalsIgnoreCase(palavraVerifica)) {
                palavraEncontrada = s;
                break;
            } else {
                return "Não encontrou palavra";
            }
        }
        return palavraEncontrada;
    }

    @Override
    public String toString() {
        return "Palavra: " + conjuntoPalavras;
    }

    public void exibirPalavrasUnicas() {
        System.out.println(conjuntoPalavras);
    }

    public static void main(String[] args) {

        ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas();

        conjunto.adicionarPalavra("Java");
        conjunto.adicionarPalavra("Python");
        conjunto.adicionarPalavra("JavaScript");
        conjunto.adicionarPalavra("Kotlin");
        conjunto.adicionarPalavra("Java");

        System.out.println(conjunto.conjuntoPalavras);
        System.out.println("Palavra 'Java' encontrada: " + conjunto.verificarPalavra("Java"));
        System.out.println("Palavra 'Ruby' encontrada: " + conjunto.verificarPalavra("Ruby"));
        conjunto.removerPalavra("Python");
        conjunto.exibirPalavrasUnicas();
    }
}
