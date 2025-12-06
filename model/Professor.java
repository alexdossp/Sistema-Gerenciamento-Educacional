package model;

public class Professor {
    private String nome;
    private String especialidade;
    private String registro;

    public Professor(String nome, String especialidade, String registro) {
        if(nome == null || nome.isBlank()) throw new IllegalArgumentException("Nome inválido");
        if(especialidade == null) especialidade = "";
        if(registro == null || registro.isBlank()) throw new IllegalArgumentException("Registro inválido");
        this.nome = nome;
        this.especialidade = especialidade;
        this.registro = registro;
    }

    public String getNome() { return nome; }
    public String getEspecialidade() { return especialidade; }
    public String getRegistro() { return registro; }

    @Override
    public String toString() {
        return String.format("Professor[nome=%s, especialidade=%s, registro=%s]", nome, especialidade, registro);
    }
}
