package ui;

import model.*;
import repository.AlunoRepository;
import service.AlunoService;
import service.RelatorioUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainFinal {
    private static List<AlunoAvaliacao> alunos = new ArrayList<>();
    private static List<ProfessorUsuario> professores = new ArrayList<>();
    private static List<Curso> cursos = new ArrayList<>();
    private static List<Turma> turmas = new ArrayList<>();

    public static void main(String[] args) {
        // Pré-carga para testes rápidos
        cursos.add(new CursoEAD("Marketing Digital", "MD100", 120, "Moodle"));
        professores.add(new ProfessorUsuario("Prof A", "profa","pw","REG-1","Matemática"));

        Scanner sc = new Scanner(System.in);
        boolean sair = false;
        while(!sair) {
            System.out.println("\n=== MENU SIMPLES SGE ===");
            System.out.println("1) Cadastrar Aluno");
            System.out.println("2) Cadastrar Curso");
            System.out.println("3) Criar Turma");
            System.out.println("4) Matricular Aluno em Turma");
            System.out.println("5) Registrar Avaliação");
            System.out.println("6) Gerar Relatórios (sequenciais)");
            System.out.println("0) Sair");
            System.out.print("Escolha: ");
            String op = sc.nextLine();
            switch(op) {
                case "1":
                    System.out.print("Nome: "); String nome = sc.nextLine();
                    System.out.print("Matrícula: "); String mat = sc.nextLine();
                    System.out.print("Curso: "); String cur = sc.nextLine();
                    AlunoAvaliacao a = new AlunoAvaliacao(nome, mat, cur);
                    alunos.add(a);
                    System.out.println("Aluno cadastrado: " + a);
                    break;
                case "2":
                    System.out.print("Nome do curso: "); String cn = sc.nextLine();
                    System.out.print("Código: "); String cc = sc.nextLine();
                    System.out.print("Carga horária: "); int ch = Integer.parseInt(sc.nextLine());
                    Curso novo = new Curso(cn, cc, ch);
                    cursos.add(novo);
                    System.out.println("Curso cadastrado: " + novo);
                    break;
                case "3":
                    System.out.print("Código da turma: "); String tcode = sc.nextLine();
                    if(professores.isEmpty()) {
                        System.out.println("Não há professores cadastrados (pré-cadastre um em código).");
                        break;
                    }
                    ProfessorUsuario prof = professores.get(0); // simplificação
                    if(cursos.isEmpty()) {
                        System.out.println("Não há cursos cadastrados.");
                        break;
                    }
                    Curso curObj = cursos.get(0);
                    Turma t = new Turma(tcode, new Professor(prof.getNome(), prof.getEspecialidade(), prof.getRegistro()), curObj);
                    turmas.add(t);
                    System.out.println("Turma criada: " + t.resumoTurma());
                    break;
                case "4":
                    if(turmas.isEmpty()) { System.out.println("Não há turmas."); break; }
                    if(alunos.isEmpty()) { System.out.println("Não há alunos."); break; }
                    Turma turma = turmas.get(0);
                    AlunoAvaliacao alu = alunos.get(0);
                    turma.adicionarAluno(alu);
                    System.out.println("Aluno matriculado: " + alu.getNome() + " na turma " + turma.getCodigo());
                    break;
                case "5":
                    if(alunos.isEmpty()) { System.out.println("Não há alunos."); break; }
                    System.out.print("Descrição da avaliação: "); String desc = sc.nextLine();
                    System.out.print("Nota (0-10): "); double nota = Double.parseDouble(sc.nextLine());
                    Avaliacao av = new Avaliacao(desc);
                    boolean ok = av.atribuirNota(nota);
                    if(ok) {
                        alunos.get(0).adicionarAvaliacao(av);
                        System.out.println("Avaliação registrada para " + alunos.get(0).getNome());
                    }
                    break;
                case "6":
                    List<Object> lista = new ArrayList<>();
                    lista.addAll(alunos);
                    lista.addAll(professores);
                    lista.addAll(cursos);
                    RelatorioUtil.gerarRelatoriosSequenciais(lista);
                    break;
                case "0":
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
        sc.close();
        System.out.println("Encerrado.");
    }
}
