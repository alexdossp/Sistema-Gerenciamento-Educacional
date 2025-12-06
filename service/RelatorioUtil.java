package service;

import model.AlunoAvaliacao;
import model.ProfessorUsuario;
import model.Curso;
import model.Avaliacao;

import java.util.List;

public class RelatorioUtil {
    public static void gerarRelatorioAluno(AlunoAvaliacao aluno) {
        System.out.println("Relatório Aluno (detalhado): " + aluno.getNome());
        System.out.println("Matrícula: " + aluno.getMatricula());
        System.out.println("Curso: " + aluno.getCurso());
        System.out.println("Avaliações:");
        for(Avaliacao a : aluno.getAvaliacoes()) {
            System.out.println("  - " + a);
        }
        System.out.printf("Média: %.2f%n", aluno.media());
    }

    public static void gerarRelatorioProfessor(ProfessorUsuario p) {
        System.out.println(p.gerarRelatorio());
    }

    public static void gerarRelatorioCurso(Curso c) {
        System.out.println("Relatório Curso: " + c.getNome() + " | Código: " + c.getCodigo() + " | CH: " + c.getCargaHoraria());
    }

    public static void gerarRelatoriosSequenciais(List<Object> entidades) {
        System.out.println("=== Gerando relatórios sequenciais ===");
        for(Object e : entidades) {
            if(e instanceof AlunoAvaliacao) gerarRelatorioAluno((AlunoAvaliacao)e);
            else if(e instanceof ProfessorUsuario) gerarRelatorioProfessor((ProfessorUsuario)e);
            else if(e instanceof Curso) gerarRelatorioCurso((Curso)e);
            else System.out.println("Entidade não tratada: " + e);
            System.out.println("----------------------------");
        }
    }
}
