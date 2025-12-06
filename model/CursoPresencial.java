package model;

public class CursoPresencial extends Curso {
    private String sala;

    public CursoPresencial(String nome, String codigo, int cargaHoraria, String sala) {
        super(nome, codigo, cargaHoraria);
        if(sala == null) sala = "";
        this.sala = sala;
    }

    public String getSala() { return sala; }

    public String detalharCurso() {
        return String.format("Curso Presencial - %s | Código: %s | Carga: %d | Sala: %s",
                getNome(), getCodigo(), getCargaHoraria(), sala);
    }

    @Override
    public String toString() {
        return detalharCurso();
    }
}
