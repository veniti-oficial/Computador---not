public abstract class Aluno {
    private String ra;
    private String nome;

    public Aluno(String ra, String nome) {
        this.ra = ra;
        this.nome = nome;
    }

    public abstract Double calcularMedia();

    @Override
    public String toString() {
        return "Aluno{" +
                "ra=" + ra +
                ", nome='" + nome +
                "Média= " + calcularMedia() +'\'' +
                '}';
    }

    public String getRa() {
        return ra;
    }
}
