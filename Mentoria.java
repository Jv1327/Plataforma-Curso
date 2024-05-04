public class Mentoria {
    private String tema;
    private String mentor;

    public Mentoria(String tema, String mentor) {
        this.tema = tema;
        this.mentor = mentor;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getMentor() {
        return mentor;
    }

    public void setMentor(String mentor) {
        this.mentor = mentor;
    }
}