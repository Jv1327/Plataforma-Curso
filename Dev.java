public class Dev {
    private String nome;
    private int idade;
    private String linguagemDominante;

    public Dev(String nome, int idade, String linguagemDominante) {
        this.nome = nome;
        this.idade = idade;
        this.linguagemDominante = linguagemDominante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getLinguagemDominante() {
        return linguagemDominante;
    }

    public void setLinguagemDominante(String linguagemDominante) {
        this.linguagemDominante = linguagemDominante;
    }
}