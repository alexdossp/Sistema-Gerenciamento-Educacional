package repository;

import model.AlunoAvaliacao;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AlunoRepository {
    private List<AlunoAvaliacao> dados = new ArrayList<>();

    public void salvar(AlunoAvaliacao a) { dados.add(a); }
    public Optional<AlunoAvaliacao> buscarPorMatricula(String mat) {
        return dados.stream().filter(x -> x.getMatricula().equals(mat)).findFirst();
    }
    public List<AlunoAvaliacao> listarTodos() { return new ArrayList<>(dados); }
}
