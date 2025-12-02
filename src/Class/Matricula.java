package Class;

public class Matricula {
    private int numMatricula;
    private Alunos aluno;
    private Cursos curso;


    public Matricula(int numMatricula, Alunos aluno, Cursos curso) {
        this.numMatricula = numMatricula;
        this.aluno = aluno;
        this.curso = curso;
    }

    public Alunos getAluno() {
        return aluno;
    }

    public void setAluno(Alunos aluno) {
        this.aluno = aluno;
    }

    public Cursos getCurso() {
        return curso;
    }

    public void setCurso(Cursos curso) {
        this.curso = curso;
    }

    public int getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
    }

    @Override
    public String toString() {
        return aluno.getNome() + " matriculado em " + curso.getNome() +
        " Número da Matrícula: " + numMatricula;
    }
}