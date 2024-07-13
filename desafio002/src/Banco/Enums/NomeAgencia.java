package Banco.Enums;

public enum NomeAgencia {
    SAO_PAULO("SP", "São Paulo", 904618031L),
    RIO_DE_JANEIRO("RJ", "Rio de Janeiro", 1116953910L),
    BELO_HORIZONTE("BH", "Belo Horizonte", 1303792291L),
    RECIFE("PE", "Recife", 4203630048L),
    CAMPINAS("SP", "Campinas", 2617296823L),
    FLORIANOPOLIS("SP", "Florianópolis", 1271675972L),
    CURITIBA("PR", "Curitiba", 1890933263L),
    PORTO_ALEGRE("RS", "Porto Alegre", 2345595965L),
    FORTALEZA("CE", "Fortaleza", 2092381148L),
    ARACAJU("SE", "Aracaju", 3105297243L);

    private String nome;
    private String sigla;
    private Long numeroAgencia;

    NomeAgencia(String sigla, String nome, Long numeroAgencia) {
        this.nome = nome;
        this.sigla = sigla;
        this.numeroAgencia = numeroAgencia;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    public Long getNumeroAgencia() {
        return numeroAgencia;
    }
}
