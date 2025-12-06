package model;

public class Avaliacao {
    private double nota;
    private String descricao;

    public Avaliacao(String descricao) {
        if(descricao == null) descricao = "";
        this.descricao = descricao;
        this.nota = 0.0;
    }

    public double getNota() { return nota; }
    public String getDescricao() { return descricao; }

    public boolean atribuirNota(double valor) {
        if(valor < 0.0 || valor > 10.0) {
            System.out.println("Valor de nota inválido: " + valor);
            return false;
        }
        this.nota = valor;
        return true;
    }

    @Override
    public String toString() {
        return String.format("Avaliacao[descricao=%s, nota=%.2f]", descricao, nota);
    }
}
