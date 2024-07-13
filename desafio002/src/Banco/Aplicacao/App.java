package Banco.Aplicacao;

import Banco.Banco;
import Banco.Contas.ContaCorrente;
import Banco.Contas.ContaPoupanca;
import Banco.Entidades.Cliente;
import Banco.Enums.NomeAgencia;

public class App {
    public static void main(String[] args) {

        // Criando Banco
        Banco bancoJava = new Banco();
        // Cria um novo cliente
        Cliente cliente1 = new Cliente("Todd Fields", "12345678901", "123.456.789-00", "12345-678");
        Cliente cliente2 = new Cliente("Keith Cruz", "12345678901", "123.456.789-00", "12885-151");
        // Cria uma nova conta corrente
        ContaCorrente contaCorrenteCliente1 = new ContaCorrente(cliente1, 20909, 1000.0, NomeAgencia.CURITIBA);
        bancoJava.adicionarConta(contaCorrenteCliente1);
        // Cria uma nova conta poupança
        ContaPoupanca contaPoupancaCliente2 = new ContaPoupanca(cliente2, 38303, 1000.0, NomeAgencia.FLORIANOPOLIS,
                0.015);
        bancoJava.adicionarConta(contaPoupancaCliente2);

        // Apresentação dos clientes:
        System.out
                .println("Nome do cliente 1 com conta Corrente: " + contaCorrenteCliente1.getCliente().getNome() + ".");
        System.out
                .println("Nome do cliente 2 com conta Poupança: " + contaPoupancaCliente2.getCliente().getNome() + ".");
        System.out.println("Numero da conta Cliente 1: " + contaCorrenteCliente1.getNumConta() + ".");
        System.out.println("Numero da conta Cliente 2: " + contaPoupancaCliente2.getNumConta() + ".");
        System.out.println("Agencia da conta do Cliente 1: " + contaCorrenteCliente1.getAgencia().getNome() + " - "
                + contaCorrenteCliente1.getAgencia().getSigla() + ".");
        System.out.println("Agencia da conta do Cliente 2: " + contaPoupancaCliente2.getAgencia().getNome() + " - "
                + contaPoupancaCliente2.getAgencia().getSigla() + ".");
        System.out.println("Saldo do Cliente 1: " + contaCorrenteCliente1.getSaldo() + ".");
        System.out.println("Saldo do Cliente 2: " + contaPoupancaCliente2.getSaldo() + ".");
        System.out.println("\nOperações na conta do Cliente 1: ");
        // Depósito em conta corrente
        contaCorrenteCliente1.depositar(500.0);
        // Saque em conta corrente
        contaCorrenteCliente1.sacar(200.0);
        // Depósito em conta poupança
        contaCorrenteCliente1.depositar(500.0);
        // Saque em conta poupança
        contaCorrenteCliente1.transferir(180.0);
        // Saldo da conta corrente
        System.out.println("Saldo da conta corrente: " + contaCorrenteCliente1.getSaldo());

        System.out.println("\nOperações na conta do Cliente 2: ");
        // Depósito em conta corrente
        contaPoupancaCliente2.depositar(500.0);
        // Saque em conta corrente
        contaPoupancaCliente2.sacar(200.0);
        // Depósito em conta poupança
        contaPoupancaCliente2.depositar(500.0);
        // Saque em conta poupança
        contaPoupancaCliente2.transferir(180.0);
        // Saldo da conta poupança
        System.out.println("Saldo da conta poupança: " + contaPoupancaCliente2.getSaldo() + "\n");
        // Taxa de juros da conta poupança
        System.out.println("Taxa de juros da conta poupança: " + contaPoupancaCliente2.getJurosAoMes());
        // Fazer simulação
        System.out.println("Simulação de investimento de R$ 1000.00 em 6 meses na Conta Poupança: ");
        System.out.println(contaPoupancaCliente2.simularInvestimento(contaPoupancaCliente2.getJurosAoMes(), 6));
    }
}
