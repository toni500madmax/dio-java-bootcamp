package OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<Integer, Palavra> dicionario;

    public Dicionario() {
        this.dicionario = new HashMap<>();
    }

    public void adicionarPalavra(int id, String palavra, String descricao) {
        dicionario.put(id, new Palavra(palavra, descricao));
    }

    public void removerPalavra(String palavra) {
        if (!dicionario.isEmpty()) {
            for (Map.Entry<Integer, Palavra> entry : dicionario.entrySet()) {
                if (entry.getValue().getPalavra().equals(palavra)) {
                    dicionario.remove(entry.getKey());
                    break;
                }
            }
        }
    }

    public Palavra pesquisarPalavra(String palavra) {
        Palavra palavraEncontrada = null;
        for (Map.Entry<Integer, Palavra> entry : dicionario.entrySet()) {
            if (entry.getValue().getPalavra().equals(palavra)) {
                palavraEncontrada = entry.getValue();
                break;
            }
        }
        return palavraEncontrada;
    }

    public void exibirPalavras() {
        System.out.println(dicionario);
    }

    @Override
    public String toString() {
        return "Palavra: " + dicionario;
    }

    public static void main(String[] args) {

        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra(01, "java", "linguagem de programação");
        dicionario.adicionarPalavra(02, "javascript", "linguagem de programação");
        System.out.println(dicionario);
        dicionario.removerPalavra("java");
        dicionario.adicionarPalavra(01, "java", "linguagem de programação");
        dicionario.adicionarPalavra(01, "html", "linguagem de marcação de texto");
        dicionario.adicionarPalavra(01, "css", "linguagem de estilização");
        dicionario.exibirPalavras();
        System.out.println(dicionario.pesquisarPalavra("javascript"));
    }
}
