package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Turma {
    private String codigo;
    private Professor professor;
    private Curso curso;
    private List<Aluno> listaAlunos;

    public Turma(String codigo, Professor professor, Curso curso) {
        if(codigo == null || codigo.isBlank()) throw new IllegalArgumentException("Código inválido");
        if(professor == null) throw new IllegalArgumentException("Professor obrigatório");
        if(curso == null) throw new IllegalArgumentException("Curso obrigatório");
        this.codigo = codigo;
        this.professor = professor;
        this.curso = curso;
        this.listaAlunos = new ArrayList<>();
    }

    public String getCodigo() { return codigo; }
    public Professor getProfessor() { return professor; }
    public Curso getCurso() { return curso; }
    public List<Aluno> getListaAlunos() { return Collections.unmodifiableList(listaAlunos); }

    public boolean adicionarAluno(Aluno a) {
        if(a == null) return false;
        if(listaAlunos.stream().anyMatch(x -> x.getMatricula().equals(a.getMatricula()))) return false;
        return listaAlunos.add(a);
    }

    public boolean removerAlunoPorMatricula(String matricula) {
        return listaAlunos.removeIf(a -> a.getMatricula().equals(matricula));
    }

    public String resumoTurma() {
        return String.format("Turma %s - Curso: %s - Professor: %s - Alunos matriculados: %d",
                codigo, curso.getNome(), professor.getNome(), listaAlunos.size());
    }
}
