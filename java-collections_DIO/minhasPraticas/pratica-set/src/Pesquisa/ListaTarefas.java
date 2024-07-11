package Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> listaTarefas;

    public ListaTarefas() {
        this.listaTarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        listaTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        for (Tarefa t : listaTarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                listaTarefas.remove(t);
                break;
            }
        }
    }

    public void exibirTarefas() {
        System.out.println(listaTarefas);
    }

    public int contarTarefas() {
        return listaTarefas.size();
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa t : listaTarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setStatus(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        for (Tarefa t : listaTarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setStatus(false);
            }
        }
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> concluidas = new HashSet<>();
        for (Tarefa t : listaTarefas) {
            if (t.isStatus() == true) {
                concluidas.add(t);
            }
        }
        return concluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> pendentes = new HashSet<>();
        for (Tarefa t : listaTarefas) {
            if (t.isStatus() == false) {
                pendentes.add(t);
            }
        }
        return pendentes;
    }

    public void limparListaTarefas() {
        listaTarefas.clear();
    }

    public static void main(String[] args) {

        ListaTarefas minhaListaTarefas = new ListaTarefas();
        minhaListaTarefas.adicionarTarefa("Lavar louça");
        minhaListaTarefas.adicionarTarefa("Lavar roupa");
        minhaListaTarefas.adicionarTarefa("Lavar banheiro");
        minhaListaTarefas.adicionarTarefa("Organizar livros");
        minhaListaTarefas.adicionarTarefa("Passar pano");
        System.out.println("__________ Lista de tarefas __________");
        System.out.println(minhaListaTarefas.listaTarefas);

        System.out.println("_________ Removendo tarefa __________");
        minhaListaTarefas.removerTarefa("Lavar roupa");
        minhaListaTarefas.exibirTarefas();

        System.out.println("__________ Contagem de tarefas __________");
        System.out.println(minhaListaTarefas.contarTarefas());
        System.out.println("__________ Concluir tarefas __________");
        minhaListaTarefas.marcarTarefaConcluida("Lavar banheiro");
        minhaListaTarefas.marcarTarefaConcluida("Organizar livros");
        System.out.println(minhaListaTarefas.obterTarefasConcluidas());
        System.out.println(minhaListaTarefas.obterTarefasPendentes());
        System.out.println("__________ marcar tarefas pendentes __________");
        minhaListaTarefas.marcarTarefaPendente("Organizar livros");
        System.out.println(minhaListaTarefas.obterTarefasConcluidas());
        System.out.println(minhaListaTarefas.obterTarefasPendentes());
    }
}
