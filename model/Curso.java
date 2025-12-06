package model;

public class Curso {
    private String nome;
    private String codigo;
    private int cargaHoraria;

    public Curso(String nome, String codigo, int cargaHoraria) {
        if(nome == null || nome.isBlank()) throw new IllegalArgumentException("Nome inválido");
        if(codigo == null || codigo.isBlank()) throw new IllegalArgumentException("Código inválido");
        if(cargaHoraria <= 0) throw new IllegalArgumentException("Carga horária deve ser positiva");
        this.nome = nome;
        this.codigo = codigo;
        this.cargaHoraria = cargaHoraria;
    }

    public String getNome() { return nome; }
    public String getCodigo() { return codigo; }
    public int getCargaHoraria() { return cargaHoraria; }

    @Override
    public String toString() {
        return String.format("Curso[nome=%s, codigo=%s, cargaHoraria=%d]", nome, codigo, cargaHoraria);
    }
}
