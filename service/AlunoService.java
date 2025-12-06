package service;

import repository.AlunoRepository;
import model.AlunoAvaliacao;
import java.util.List;

public class AlunoService {
    private AlunoRepository repo;

    public AlunoService(AlunoRepository repo) { this.repo = repo; }

    public void cadastrarAluno(AlunoAvaliacao a) {
        if(repo.buscarPorMatricula(a.getMatricula()).isPresent()) {
            throw new IllegalArgumentException("Matrícula já cadastrada");
        }
        repo.salvar(a);
    }

    public List<AlunoAvaliacao> listarAlunos() {
        return repo.listarTodos();
    }
}
