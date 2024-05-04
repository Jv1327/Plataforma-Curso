public class Main {
    public static void main(String[] args) {
        Bootcamp bootcamp = new Bootcamp("Java Bootcamp");

        Curso curso1 = new Curso("Java Basics", 40, "João");
        Curso curso2 = new Curso("Java Avançado", 60, "Maria");
        Mentoria mentoria1 = new Mentoria("Carreira em Java", "José");
        Dev dev1 = new Dev("Carlos", 25, "Java");
        Dev dev2 = new Dev("Ana", 30, "Python");

        bootcamp.adicionarCurso(curso1);
        bootcamp.adicionarCurso(curso2);
        bootcamp.adicionarMentoria(mentoria1);
        bootcamp.adicionarDev(dev1);
        bootcamp.adicionarDev(dev2);

        bootcamp.listarParticipantes();
    }
}
