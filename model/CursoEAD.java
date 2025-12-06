package model;

public class CursoEAD extends Curso {
    private String plataforma;

    public CursoEAD(String nome, String codigo, int cargaHoraria, String plataforma) {
        super(nome, codigo, cargaHoraria);
        if(plataforma == null) plataforma = "";
        this.plataforma = plataforma;
    }

    public String getPlataforma() { return plataforma; }

    public String detalharCurso() {
        return String.format("Curso EAD - %s | Código: %s | Carga: %d | Plataforma: %s",
                getNome(), getCodigo(), getCargaHoraria(), plataforma);
    }

    @Override
    public String toString() {
        return detalharCurso();
    }
}
