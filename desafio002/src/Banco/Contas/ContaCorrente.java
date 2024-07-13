package Banco.Contas;

import Banco.Entidades.Cliente;
import Banco.Entidades.Conta;
import Banco.Enums.NomeAgencia;

public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente cliente, int numConta, double saldo, NomeAgencia agencia) {
        super(cliente, numConta, saldo, agencia);
    }
}
