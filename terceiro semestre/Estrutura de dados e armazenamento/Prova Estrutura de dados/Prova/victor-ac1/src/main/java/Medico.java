public abstract class Medico implements Bonificavel{
    private String crm;
    private String nome;

    public Medico(String crm, String nome) {
        this.crm = crm;
        this.nome = nome;
    }

    public String getCrm() {
        return crm;
    }


    public String getNome() {
        return nome;
    }

    public abstract Double getGanho();

    @Override
    public String toString() {
        return "Medico{" +
                "crm='" + crm + '\'' +
                ", nome='" + nome + '\'' +
                ", ganho='" +getGanho() +
                '}';
    }
}
