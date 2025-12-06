package ui;

import repository.AlunoRepository;
import service.AlunoService;
import model.AlunoAvaliacao;

public class MainMiniCamadas {
    public static void main(String[] args) {
        AlunoRepository repo = new AlunoRepository();
        AlunoService service = new AlunoService(repo);

        AlunoAvaliacao a = new AlunoAvaliacao("Zé", "2025007", "ADS");
        service.cadastrarAluno(a);

        System.out.println("=== Fase 7 - Camadas (simples) ===");
        service.listarAlunos().forEach(al -> System.out.println(al));
    }
}
