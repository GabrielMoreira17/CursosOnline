package Class;

public class Alunos {
    private String nome;
    private String email;


    public Alunos(String nome, String email) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String email) {
        this.nome = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Aluno: " + nome +
                ", email: " + email;
    }
}