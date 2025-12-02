package Class;

public class Instrutor {
    private String nome;


    public Instrutor(String nome) {
        this.nome = nome;
    }


    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    @Override
    public String toString() {
        return "Instrutor: " + nome;
    }
}