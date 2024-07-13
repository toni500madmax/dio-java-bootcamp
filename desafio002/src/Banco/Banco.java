package Banco;

import java.util.ArrayList;
import java.util.List;

import Banco.Entidades.Conta;

public class Banco {
    private List<Conta> contas = new ArrayList<>();

    public Banco() {
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public void removerConta() {

    }

    public List<Conta> getContas() {
        return contas;
    }

    public Conta buscarContaPorNum(Integer numConta) {
        for (Conta conta : contas) {
            if (conta.getNumConta().equals(numConta)) {
                return conta;
            }
        }
        return null;
    }
}
