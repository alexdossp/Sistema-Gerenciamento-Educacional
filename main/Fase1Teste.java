package main;

import model.Aluno;
import model.Professor;
import model.Curso;

public class Fase1Teste {
    public static void main(String[] args) {
        Aluno a = new Aluno("Pedro Silva", "2025001", "Análise e Desenvolvimento de Sistemas");
        Professor p = new Professor("Maria Souza", "Banco de Dados", "REG-12345");
        Curso c = new Curso("ADS", "ADS101", 180);

        System.out.println("=== Fase 1 - Instâncias ===");
        System.out.println(a);
        System.out.println(p);
        System.out.println(c);
    }
}
