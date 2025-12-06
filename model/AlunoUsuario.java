package model;

public class AlunoUsuario extends Usuario {
    private String matricula;
    private String curso;

    public AlunoUsuario(String nome, String login, String senha, String matricula, String curso) {
        super(nome, login, senha);
        this.matricula = matricula;
        this.curso = curso;
    }

    @Override
    public String gerarRelatorio() {
        return "Relatório Aluno: " + nome + " | Matrícula: " + matricula + " | Curso: " + curso;
    }

    @Override
    public String toString() {
        return "AlunoUsuario[nome=" + nome + ", matricula=" + matricula + "]";
    }
}
