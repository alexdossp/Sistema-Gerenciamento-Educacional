package main;

import model.*;
import service.RelatorioUtil;
import java.util.Arrays;

public class Fase6Teste {
    public static void main(String[] args) {
        AlunoAvaliacao a = new AlunoAvaliacao("Marina", "2025006", "ADS");
        Avaliacao aa = new Avaliacao("Prova A"); aa.atribuirNota(7.5);
        a.adicionarAvaliacao(aa);

        ProfessorUsuario p = new ProfessorUsuario("Gustavo", "gust", "321", "REG-333", "POO");
        Curso c = new Curso("ADS", "ADS101", 180);

        RelatorioUtil.gerarRelatoriosSequenciais(Arrays.asList(a, p, c));
    }
}
