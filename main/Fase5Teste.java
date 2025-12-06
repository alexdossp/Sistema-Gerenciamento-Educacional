package main;

import model.*;

public class Fase5Teste {
    public static void main(String[] args) {
        AlunoUsuario au = new AlunoUsuario("Larissa", "larissa", "123", "2025005", "ADS");
        ProfessorUsuario pu = new ProfessorUsuario("Rafael", "rafa", "abc", "REG-222", "Redes");
        Administrador adm = new Administrador("Admin", "root", "toor", "SUPER");

        System.out.println("=== Fase 5 - Autenticação e Perfis ===");
        System.out.println("Autenticar Larissa (correto): " + au.autenticar("larissa","123"));
        System.out.println("Autenticar Rafael (incorreto): " + pu.autenticar("rafa","wrong"));
        System.out.println(adm.gerarRelatorio());
        System.out.println(au.gerarRelatorio());
        System.out.println(pu.gerarRelatorio());
    }
}
