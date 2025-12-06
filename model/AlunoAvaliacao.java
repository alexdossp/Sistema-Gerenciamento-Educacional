package model;

import java.util.ArrayList;
import java.util.List;

public class AlunoAvaliacao extends Aluno {
    private List<Avaliacao> avaliacoes;

    public AlunoAvaliacao(String nome, String matricula, String curso) {
        super(nome, matricula, curso);
        this.avaliacoes = new ArrayList<>();
    }

    public void adicionarAvaliacao(Avaliacao a) {
        if(a != null) avaliacoes.add(a);
    }

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public double media() {
        if(avaliacoes.isEmpty()) return 0.0;
        return avaliacoes.stream().mapToDouble(Avaliacao::getNota).average().orElse(0.0);
    }

    @Override
    public String toString() {
        return super.toString() + " Avaliacoes=" + avaliacoes;
    }
}
