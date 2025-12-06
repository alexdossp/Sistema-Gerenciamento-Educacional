package main;

import model.*;

public class Fase2Teste {
    public static void main(String[] args) {
        Curso curso = new Curso("ADS", "ADS101", 180);
        Professor prof = new Professor("João Pereira", "Programação", "REG-987");
        Turma t = new Turma("TURMA-A", prof, curso);

        Aluno a1 = new Aluno("Ana", "2025002", "ADS");
        Aluno a2 = new Aluno("Bruno", "2025003", "ADS");

        t.adicionarAluno(a1);
        t.adicionarAluno(a2);

        System.out.println("=== Fase 2 - Resumo Turma ===");
        System.out.println(t.resumoTurma());

        t.removerAlunoPorMatricula("2025003");
        System.out.println("Após remoção:");
        System.out.println(t.resumoTurma());
    }
}
