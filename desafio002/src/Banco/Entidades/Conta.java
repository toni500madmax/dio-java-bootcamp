package Banco.Entidades;

import Banco.Banco;
import Banco.Enums.NomeAgencia;

public abstract class Conta extends Banco {
    private Cliente cliente;
    private Integer numConta;
    private Double saldo;
    private NomeAgencia agencia;

    public Conta(Cliente cliente, int numConta, double saldo, NomeAgencia agencia) {
        this.cliente = cliente;
        this.numConta = numConta;
        this.saldo = saldo;
        this.agencia = agencia;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Integer getNumConta() {
        return numConta;
    }

    public void setNumConta(Integer numConta) {
        this.numConta = numConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public NomeAgencia getAgencia() {
        return agencia;
    }

    public void setAgencia(NomeAgencia agencia) {
        this.agencia = agencia;
    }

    public void sacar(double valor) {
        if (valor > this.getSaldo()) {
            throw new IllegalArgumentException("Saldo insuficiente.");
        } else {
            this.setSaldo(this.getSaldo() - valor);
        }
    }

    public void depositar(double valor) {
        this.setSaldo(this.getSaldo() + valor);
    }

    public void transferir(double valor) {
        if (valor > this.getSaldo()) {
            throw new IllegalArgumentException("Saldo insuficiente.");
        } else {
            this.setSaldo(this.getSaldo() - valor);
        }
    }

}
