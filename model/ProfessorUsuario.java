package model;

public class ProfessorUsuario extends Usuario {
    private String registro;
    private String especialidade;

    public ProfessorUsuario(String nome, String login, String senha, String registro, String especialidade) {
        super(nome, login, senha);
        this.registro = registro;
        this.especialidade = especialidade;
    }

    public String getRegistro() { return registro; }
    public String getEspecialidade() { return especialidade; }

    @Override
    public String gerarRelatorio() {
        return "Relatório Professor: " + nome + " | Registro: " + registro + " | Especialidade: " + especialidade;
    }

    @Override
    public String toString() {
        return "ProfessorUsuario[nome=" + nome + ", registro=" + registro + "]";
    }
}
