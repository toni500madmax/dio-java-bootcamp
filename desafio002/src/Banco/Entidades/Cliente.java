package Banco.Entidades;

public class Cliente {
    private String nome;
    private String rg;
    private String cpf;
    private String cep;

    public Cliente(String nome, String rg, String cpf, String cep) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.cep = cep;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
