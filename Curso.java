public class Curso {
    private String nome;
    private int duracaoHoras;
    private String instrutor;

    public Curso(String nome, int duracaoHoras, String instrutor) {
        this.nome = nome;
        this.duracaoHoras = duracaoHoras;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDuracaoHoras() {
        return duracaoHoras;
    }

    public void setDuracaoHoras(int duracaoHoras) {
        this.duracaoHoras = duracaoHoras;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(String instrutor) {
        this.instrutor = instrutor;
    }
}