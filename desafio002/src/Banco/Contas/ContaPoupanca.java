package Banco.Contas;

import Banco.Entidades.Cliente;
import Banco.Entidades.Conta;
import Banco.Enums.NomeAgencia;

public class ContaPoupanca extends Conta {
    private Double jurosAoMes;

    public ContaPoupanca(Cliente cliente, int numConta, double saldo, NomeAgencia agencia, double jurosAoMes) {
        super(cliente, numConta, saldo, agencia);
        this.jurosAoMes = jurosAoMes;
    }

    public Double getJurosAoMes() {
        return jurosAoMes;
    }

    public void setJurosAoMes(Double jurosAoMes) {
        this.jurosAoMes = jurosAoMes;
    }

    public Double simularInvestimento(double jurosAoMes, int periodo) {
        if (this.getSaldo() <= 0) {
            throw new IllegalArgumentException("Saldo insuficiente para simular investimento.");
        } else {
            return this.getSaldo() + (this.getSaldo() * jurosAoMes * periodo);
        }
    }
}
