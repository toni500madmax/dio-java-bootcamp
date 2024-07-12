package OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    // map <tipo key, tipo valor>
    private Map<String, Integer> agendaMap;

    public AgendaContatos() {
        this.agendaMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        // o método put serve também para atualizar um valor.
        agendaMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaMap.isEmpty()) {
            agendaMap.remove(nome);
        }
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroEncontrado = null;
        if (!agendaMap.isEmpty()) {
            numeroEncontrado = agendaMap.get(nome);
        }
        return numeroEncontrado;
    }

    public void exibirContatos() {
        System.out.println(agendaMap);
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();
        agenda.adicionarContato("Maria", 123456789);
        agenda.adicionarContato("João", 987654321);
        agenda.adicionarContato("Pedro", 456789123);
        agenda.adicionarContato("Rosalie Wilkins", 63836810);
        agenda.adicionarContato("Oscar Richards", 25548355);
        agenda.adicionarContato("Eugenia Briggs", 96533065);
        agenda.adicionarContato("Austin Rodriguez", 45889827);

        agenda.exibirContatos();

        agenda.removerContato("Oscar Richards");
        agenda.exibirContatos();

        System.out.println(agenda.pesquisarPorNome("Maria"));
    }
}
