package main;

import model.*;

public class Fase3Teste {
    public static void main(String[] args) {
        AlunoAvaliacao aluno = new AlunoAvaliacao("Carlos", "2025004", "ADS");
        Avaliacao a1 = new Avaliacao("Prova 1");
        Avaliacao a2 = new Avaliacao("Prova 2");

        a1.atribuirNota(8.5);
        a2.atribuirNota(9.0);

        aluno.adicionarAvaliacao(a1);
        aluno.adicionarAvaliacao(a2);

        System.out.println("=== Fase 3 - Avaliações ===");
        System.out.println(aluno);
        System.out.printf("Média do aluno: %.2f%n", aluno.media());

        System.out.println("Tentativa de atribuir nota inválida:");
        boolean ok = a2.atribuirNota(12.0); // deve falhar e imprimir mensagem
        System.out.println("Resultado atribuição inválida: " + ok);
    }
}
