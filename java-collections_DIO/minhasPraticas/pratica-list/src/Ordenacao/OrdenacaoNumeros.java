package Ordenacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class OrdenacaoNumeros {
    private List<Integer> numeros;

    public OrdenacaoNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public List<Integer> ordenaNumerosAscendente() {
        List<Integer> ordenaAscendente = new ArrayList<>(this.numeros);
        if (!numeros.isEmpty()) {
            Collections.sort(ordenaAscendente);
            return ordenaAscendente;
        } else {
            throw new RuntimeException("Lista vazia");
        }
    }

    public List<Integer> ordenaNumerosDescendente() {
        List<Integer> ordenaDescendente = new ArrayList<>(this.numeros);
        if (!numeros.isEmpty()) {
            ordenaDescendente.sort(Collections.reverseOrder());
            return ordenaDescendente;
        } else {
            throw new RuntimeException("Lista vazia");
        }
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();
        ordenacaoNumeros.adicionarNumero(10);
        ordenacaoNumeros.adicionarNumero(19);
        ordenacaoNumeros.adicionarNumero(18);
        ordenacaoNumeros.adicionarNumero(4);
        ordenacaoNumeros.adicionarNumero(8);
        ordenacaoNumeros.adicionarNumero(80);
        ordenacaoNumeros.adicionarNumero(5);

        System.out.println(ordenacaoNumeros.ordenaNumerosAscendente());
        System.out.println(ordenacaoNumeros.ordenaNumerosDescendente());
        System.out.println(ordenacaoNumeros.numeros);
    }
}
