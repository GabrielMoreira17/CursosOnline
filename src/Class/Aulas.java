package Class;

public class Aulas {
    private String titulo;


    public Aulas(String titulo) {
        this.titulo = titulo;
    }


    public String getTitulo() {
        return titulo;

}

    @Override
    public String toString() {
        return "Aula: " + titulo;
    }
}