package br.com.sptech.projeto.encapsulamento1;

public class Aluno {

    private String ra;
    private String nome;
    private String curso;
    private Double nota1;
    private Double nota2;

    public Aluno(String ra, String nome, String curso) {
        this.ra = ra;
        this.nome = nome;
        this.curso = curso;
        this.nota1 = 0.0;
        this.nota2 = 0.0;
    }
    
    @Override
    public String toString() {
        return String.format("RA: %s "
                + "\n Nome: %s"
                + "\n Curso: %s "
                + "\n Nota1: %.1f "
                + "\n Nota 2: %.1f"
                + "\n Média: %.1f"
                , ra, nome, curso, nota1, nota2,getMedia());
    }
    
    public Double getMedia(){
        return (this.nota1 + this.nota2) / 2;
    }
    
    // Métodos seguem o padrão camelCase
    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        if (nota1 > 0 && nota1 <= 10) {
            this.nota1 = nota1;
        }
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        if (nota2 > 0 && nota2 <= 10) {
            this.nota2 = nota2;
        }
    }
    
    public Boolean isAprovado(){
        //return getMedia() > 6; //maneira mais curta
        
        Double media = getMedia();
        
        if(media > 6){
            return true;
        }else{
            return false;
        }
        
    }
}
