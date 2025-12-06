package model;

public class Administrador extends Usuario {
    private String nivel;

    public Administrador(String nome, String login, String senha, String nivel) {
        super(nome, login, senha);
        this.nivel = nivel == null ? "" : nivel;
    }

    @Override
    public String gerarRelatorio() {
        return "Relatório Administrador: " + nome + " (nível " + nivel + ")";
    }

    @Override
    public String toString() {
        return "Administrador[nome=" + nome + ", login=" + login + ", nivel=" + nivel + "]";
    }
}
