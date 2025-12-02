package Class;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Cursos> cursos = new ArrayList<>();
        ArrayList<Alunos> alunos = new ArrayList<>();
        ArrayList<Instrutor> instrutores = new ArrayList<>();
        ArrayList<Matricula> matriculas = new ArrayList<>();

        int opcao = 0;

        do {
            System.out.println("\n=== SISTEMA DE CURSOS ONLINE ===");
            System.out.println("1 - Cadastrar curso");
            System.out.println("2 - Listar cursos");
            System.out.println("3 - Cadastrar aluno");
            System.out.println("4 - Listar alunos");
            System.out.println("5 - Matricular aluno em curso");
            System.out.println("6 - Listar matrículas");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = sc.nextInt();
                sc.nextLine(); // limpar buffer
            } catch (InputMismatchException e) {
                System.out.println("Erro: Digite um número válido.");
                sc.nextLine();
                continue;
            }

            switch (opcao) {

                case 1: // CADASTRAR CURSO
                    System.out.print("Nome do curso: ");
                    String nomeCurso = sc.nextLine();

                    System.out.println("Nome do instrutor: ");
                    String nomeInstrutor = sc.nextLine();

                    System.out.print("Categoria: ");
                    String categoria = sc.nextLine();

                    Instrutor instrutor = new Instrutor(nomeInstrutor);

                    Cursos curso = new Cursos(nomeCurso, instrutor, categoria);
                    cursos.add(curso);
                    System.out.println("Curso cadastrado com sucesso!");
                    break;

                case 2: // LISTAR CURSOS
                    System.out.println("\n--- CURSOS CADASTRADOS ---");
                    if (cursos.isEmpty()) {
                        System.out.println("Nenhum curso cadastrado.");
                    } else {
                        for (Cursos c : cursos) {
                            System.out.println(c);
                        }
                    }
                    break;

                case 3: // CADASTRAR ALUNO
                    System.out.print("Nome do aluno: ");
                    String nomeAluno = sc.nextLine();

                    System.out.print("Email: ");
                    String email = sc.nextLine();

                    Alunos aluno = new Alunos(nomeAluno, email);
                    alunos.add(aluno);
                    System.out.println("Aluno cadastrado!");
                    break;

                case 4: // LISTAR ALUNOS
                    System.out.println("\n--- ALUNOS CADASTRADOS ---");
                    if (alunos.isEmpty()) {
                        System.out.println("Nenhum aluno cadastrado.");
                    } else {
                        for (Alunos a : alunos) {
                            System.out.println(a);
                        }
                    }
                    break;

                case 5: // MATRICULAR
                    try {
                        System.out.print("Nome do aluno para matrícula: ");
                        String alunoNome = sc.nextLine();

                        System.out.print("Curso desejado: ");
                        String cursoNome = sc.nextLine();

                        Alunos alunoMat = null;
                        int numeroMatricula = 0;
                        Cursos cursoMat = null;

                        for (Alunos a : alunos) {
                            if (a.getNome().equalsIgnoreCase(alunoNome)) {
                                alunoMat = a;
                                break;
                            }
                        }

                        for (Cursos c : cursos) {
                            if (c.getNome().equalsIgnoreCase(cursoNome)) {
                                cursoMat = c;
                                break;
                            }
                        }
                        if (alunoMat == null) {
                            System.out.println("Aluno não encontrado!");
                            break;
                        }

                        matriculas.add(new Matricula(numeroMatricula, alunoMat, cursoMat));
                        System.out.println("Matrícula realizada com sucesso!");

                    } catch (Exception e) {
                        System.out.println("Erro: " + e.getMessage());
                    }

                    break;

                case 6: // LISTAR MATRÍCULAS
                    System.out.println("\n--- MATRÍCULAS ---");
                    if (matriculas.isEmpty()) {
                        System.out.println("Nenhuma matrícula registrada.");
                    } else {
                        for (Matricula m : matriculas) {
                            System.out.println(m);
                        }
                    }
                    break;

                case 0:
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}
