package Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> listaAlunos;

    public GerenciadorAlunos() {
        this.listaAlunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, int matricula, double nota) {
        listaAlunos.add(new Aluno(nome, matricula, nota));
    }

    public void removerAluno(int matricula) {
        for (Aluno a : listaAlunos) {
            if (a.getMatricula() == matricula) {
                listaAlunos.remove(a);
            }
        }
    }

    // para ordenar os sets tem que ser uma instância de TreeSet.
    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunoPorNota = new TreeSet<>(listaAlunos);
        if (!listaAlunos.isEmpty()) {
            return alunoPorNota;
        } else {
            throw new RuntimeException("Lista vazia!");
        }
    }

    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunoPorNota = new TreeSet<>(new ComparatorPorNota());
        if (!listaAlunos.isEmpty()) {
            alunoPorNota.addAll(listaAlunos);
            return alunoPorNota;
        } else {
            throw new RuntimeException("Lista vazia!");
        }
    }

    public void exibeAlunos() {
        System.out.println(listaAlunos);
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciador = new GerenciadorAlunos();
        gerenciador.adicionarAluno("Lou Wise", 151, 9.5);
        gerenciador.adicionarAluno("Harriet Greene", 247, 7.6);
        gerenciador.adicionarAluno("Chase Blake", 248, 6.7);
        gerenciador.adicionarAluno("Scott Wallace", 413, 8.1);
        gerenciador.adicionarAluno("Frank Ballard", 317, 5.0);
        System.out.println("---------- Lista Alunos ---------- (Matricula)");
        System.out.println(gerenciador.listaAlunos);
        System.out.println("---------- Lista Alunos ---------- (Nota)");
        System.out.println(gerenciador.exibirAlunosPorNota());
        System.out.println("---------- Lista Alunos ---------- (Nome)");
        System.out.println(gerenciador.exibirAlunosPorNome());
        System.out.println("---------- Lista Alunos ---------- (só exibe)");
        gerenciador.exibeAlunos();
    }
}
