package Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<Integer, String> contagemPalavras;

    public ContagemPalavras() {
        this.contagemPalavras = new HashMap<>();
    }

    public void adicionarTexto(int id, String texto) {
        contagemPalavras.put(id, texto);
    }

    public Integer obterContagemDePalavras(String palavra) {
        int contagem = 0;
        for (String palavraContada : contagemPalavras.values()) {
            if (palavraContada.contains(palavra)) {
                contagem++;
            }
        }
        return contagem;
    }

    public String encontraPalavraMaisFrequente() {
        Map<String, Integer> frequenciaPalavras = new HashMap<>();
        String palavraMaisFrequente = "";
        int contagemMaisFrequente = 0;
        for (String texto : contagemPalavras.values()) {
            String[] palavrasList = texto.split(" ");
            for (String palavra : palavrasList) {
                palavra = palavra.toLowerCase();
                frequenciaPalavras.put(palavra, frequenciaPalavras.getOrDefault(palavra, 0) + 1);
            }
        }
        for (Map.Entry<String, Integer> entry : frequenciaPalavras.entrySet()) {
            if (entry.getValue() > contagemMaisFrequente) {
                contagemMaisFrequente = entry.getValue();
                palavraMaisFrequente = entry.getKey();
            }
        }
        return "A palavra mais frequente é: #" + palavraMaisFrequente + " e se repetiu " + contagemMaisFrequente
                + " vezes.";
    }

    public static void main(String[] args) {

        ContagemPalavras contaPalavras = new ContagemPalavras();
        contaPalavras.adicionarTexto(1, "Java é uma linguagem de programação");
        contaPalavras.adicionarTexto(2, "JavaScript é uma linguagem de programação");
        contaPalavras.adicionarTexto(3,
                "Crie uma classe chamada \"AgendaEventos\" que utilize um `Map` para armazenar as datas e seus respectivos Eventos. Cada evento é representado por um objeto da classe \"Evento\", que possui atributos como nome do evento e o nome da atração. Implemente os seguintes métodos.");
        System.out.println(contaPalavras.obterContagemDePalavras("Java"));
        System.out.println(contaPalavras.obterContagemDePalavras("de"));

        System.out.println(contaPalavras.encontraPalavraMaisFrequente());
    }
}
