import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        CRUDAluno crud = new CRUDAluno();

        Scanner scanner = new Scanner(System.in);

        // Adicionar um novo aluno à estrutura;
        Aluno aluno1 = new Aluno("Ian", "Ciencia de dados", "202202102873");
        Aluno aluno2 = new Aluno("Felipe", "Direito", "202302102873");
        crud.adicionarAluno(aluno1);
        crud.adicionarAluno(aluno2);

        // Listando todos os alunos;
        System.out.println("Alunos disponíveis: ");
        crud.listarTodosAlunos();

        // Atualizar o curso de um aluno, a partir da matrícula;
        System.out.println("\nInsira a matrícula do aluno para atualizar o curso: ");
        String matriculaAtualizar = scanner.nextLine();
        System.out.println("Insira o novo curso: ");
        String novoCurso = scanner.nextLine();
        crud.atualizarCursoAluno(matriculaAtualizar, novoCurso);
        Aluno alunoAtualizado = crud.buscarAlunoPorMatricula(matriculaAtualizar);
        if (alunoAtualizado != null) {
            System.out.println("\nCurso atualizado do " + alunoAtualizado.getNome());
        }
        crud.listarTodosAlunos();

        // Remover um aluno da estrutura, a partir da matrícula;
        System.out.println("\nInsira a matrícula do aluno para remover: ");
        String matriculaRemover = scanner.nextLine();
        Aluno alunoRemovido = crud.removerAluno(matriculaRemover);
        if (alunoRemovido != null) {
            System.out.println("\n" + alunoRemovido.getNome() + " removido");
        }
        crud.listarTodosAlunos();
    }

    static class Aluno {
        private String nome;
        private String curso;
        private String matricula;

        public Aluno(String nome, String curso, String matricula) {
            this.nome = nome;
            this.curso = curso;
            this.matricula = matricula;
        }

        public String getNome() {
            return nome;
        }

        public String getCurso() {
            return curso;
        }

        public void setCurso(String curso) {
            this.curso = curso;
        }

        public String getMatricula() {
            return matricula;
        }
    }

    static class CRUDAluno {
        private ArrayList<Aluno> alunos;

        public CRUDAluno() {
            this.alunos = new ArrayList<>();
        }

        public void adicionarAluno(Aluno aluno) {
            alunos.add(aluno);
        }

        public Aluno removerAluno(String matricula) {
            for (Aluno aluno : alunos) {
                if (aluno.getMatricula().equals(matricula)) {
                    alunos.remove(aluno);
                    return aluno;
                }
            }
            return null;
        }

        public void atualizarCursoAluno(String matricula, String novoCurso) {
            for (Aluno aluno : alunos) {
                if (aluno.getMatricula().equals(matricula)) {
                    aluno.setCurso(novoCurso);
                }
            }
        }

        public Aluno buscarAlunoPorMatricula(String matricula) {
            for (Aluno aluno : alunos) {
                if (aluno.getMatricula().equals(matricula)) {
                    return aluno;
                }
            }
            return null;
        }

        public void listarTodosAlunos() {
            for (Aluno aluno : alunos) {
                System.out.println("Nome: " + aluno.getNome() + ", Curso: " + aluno.getCurso() + ", Matrícula: " + aluno.getMatricula());
            }
        }
    }
}   