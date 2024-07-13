package Banco.Entidades;

import Banco.Enums.NomeAgencia;

public class Agencia {
    private NomeAgencia nomeAgencia;

    public Agencia(NomeAgencia nomeAgencia) {
        this.nomeAgencia = nomeAgencia;
    }

    public NomeAgencia getNomeAgencia() {
        return nomeAgencia;
    }
}
