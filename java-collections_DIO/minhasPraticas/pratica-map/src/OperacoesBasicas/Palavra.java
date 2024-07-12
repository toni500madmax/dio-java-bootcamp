package OperacoesBasicas;

public class Palavra {
    private String palavra;
    private String descricao;

    public Palavra(String palavra, String descricao) {
        this.palavra = palavra;
        this.descricao = descricao;
    }

    public String getPalavra() {
        return palavra;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "nome: " + palavra + ", descricao: " + descricao;
    }
}
