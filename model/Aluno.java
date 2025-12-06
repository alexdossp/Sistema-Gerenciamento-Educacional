package model;

public class Aluno {
    private String nome;
    private String matricula;
    private String curso;

    public Aluno(String nome, String matricula, String curso) {
        if(nome == null || nome.isBlank()) throw new IllegalArgumentException("Nome inválido");
        if(matricula == null || matricula.isBlank()) throw new IllegalArgumentException("Matrícula inválida");
        if(curso == null || curso.isBlank()) throw new IllegalArgumentException("Curso inválido");
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getNome() { return nome; }
    public String getMatricula() { return matricula; }
    public String getCurso() { return curso; }

    @Override
    public String toString() {
        return String.format("Aluno[nome=%s, matricula=%s, curso=%s]", nome, matricula, curso);
    }
}
