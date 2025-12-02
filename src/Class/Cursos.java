package Class;
import java.util.ArrayList;

public class Cursos {
    private String nome;
    private Instrutor instrutor;
    private String categoria;
    private ArrayList<Aulas> aulas = new ArrayList<>();


    public Cursos(String nome, Instrutor instrutor, String categoria) {
        this.nome = nome;
        this.instrutor = instrutor;
        this.categoria = categoria;
    }


    public String getNome() { return nome; }
    public Instrutor getInstrutor() { return instrutor; }
    public String getCategoria() { return categoria; }
    public ArrayList<Aulas> getAulas() { return aulas; }

    public void setNome(String nome) { this.nome = nome; }
    public void setCategoria(String categoria) { this.categoria = categoria; }


    public void adicionarAula(Aulas aula) {
        aulas.add(aula);
    }


    @Override
    public String toString() {
        return "Curso: " + nome + " | Instrutor: " + instrutor.getNome();
    }
}