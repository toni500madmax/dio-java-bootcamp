package Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public Long calcularSoma() {
        Long soma = 0L;
        for (int i = 0; i < numeros.size(); i++) {
            soma += numeros.get(i);
        }
        return soma;
    }

    public int encontraMaiorNumero() {
        int maiorNumero = 0;
        for (Integer i : numeros) {
            if (i > maiorNumero) {
                maiorNumero = i;
            }
        }
        return maiorNumero;
    }

    public int encontraMenorNumero() {
        int menorNumero = numeros.get(0);
        for (Integer i : numeros) {
            if (i < menorNumero) {
                menorNumero = i;
            }
        }
        return menorNumero;
    }

    public void exibirNumeros() {
        System.out.println(numeros);
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(100);
        somaNumeros.adicionarNumero(19);
        somaNumeros.adicionarNumero(18);
        somaNumeros.adicionarNumero(4);
        somaNumeros.adicionarNumero(8);
        somaNumeros.adicionarNumero(80);
        somaNumeros.adicionarNumero(50);
        System.out.println(somaNumeros.calcularSoma());
        System.out.println(somaNumeros.encontraMaiorNumero());
        System.out.println(somaNumeros.encontraMenorNumero());
        somaNumeros.exibirNumeros();
    }
}
