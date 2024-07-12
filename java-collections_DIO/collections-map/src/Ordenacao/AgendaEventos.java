package Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        Evento novoEvento = new Evento(nome, atracao);
        eventosMap.put(data, novoEvento);
    }

    public void exibirAgenda() {
        // pelo fato de ter um LocalDate sendo implementado no Map, ele entenderá a
        // ordem cronológica e fará a ordenação.
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        // estrutura do for:
        // Tipo (Map.Entry<LocalDate, Evento>),
        // variavel entry;
        // Objeto (eventosTreeMap.entrySet()) retorna um Set em que cada valor é um
        // conjunto
        // de key Data e value Evento.
        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                System.out.println("O próximo evento é: " + entry.getValue()
                        + " acontecerá na data: " + entry.getKey());
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agenda = new AgendaEventos();
        agenda.adicionarEvento(LocalDate.of(2022, Month.JULY, 10), "Cinema", "Filme 1");
        agenda.adicionarEvento(LocalDate.of(2021, Month.MARCH, 15), "Show", "Show 1");
        agenda.adicionarEvento(LocalDate.of(2020, Month.DECEMBER, 25), "Show", "Show 2");
        agenda.adicionarEvento(LocalDate.of(2024, Month.JANUARY, 11), "Cinema", "Filme 2");
        agenda.adicionarEvento(LocalDate.of(2025, Month.JANUARY, 11), "Cinema", "Filme 3");
        agenda.adicionarEvento(LocalDate.of(2025, Month.JANUARY, 14), "Cinema", "Filme 4");

        agenda.exibirAgenda();
        agenda.obterProximoEvento();
    }
}
