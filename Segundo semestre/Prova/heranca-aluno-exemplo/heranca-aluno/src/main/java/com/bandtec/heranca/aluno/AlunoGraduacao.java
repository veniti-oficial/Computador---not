package com.bandtec.heranca.aluno;

//A classe AlunoGraduacao herda o que existe
//na classe Aluno
//
//Ao invocar contrutor a primeira classe deve conter a pai "SUPER";
//
//sobre-escrita e sobre-carga a diferença "escreve = altero o comportamento, 
//eu recebo o metodo e altero o comportamento ajustrando para mim, porem e o 
//mesmo inuito mostra uma informação, passos diferente" "Carga = oferecer meios 
//diferentes para realizar o comportamento, tenho alterações na assinatura, 
//parametros diferentes, ele vai resolver uma soma com 2 eu posso resolver com 3 numeros" 
//
//

public class AlunoGraduacao extends Aluno{
    private Double notaContinuada;
    private Double notaIntegrada;

    //construtor
    public AlunoGraduacao(Double notaContinuada, 
                            Double notaIntegrada, 
                            Integer ra, 
                            String nome) {
        super(ra, nome);
        this.notaContinuada = notaContinuada;
        this.notaIntegrada = notaIntegrada;
    }

    public Double getNotaContinuada() {
        return notaContinuada;
    }

    public void setNotaContinuada(Double notaContinuada) {
        this.notaContinuada = notaContinuada;
    }

    public Double getNotaIntegrada() {
        return notaIntegrada;
    }

    public void setNotaIntegrada(Double notaIntegrada) {
        this.notaIntegrada = notaIntegrada;
    }

    @Override
    public Double calcularMedia() {
           return super.calcularMedia() + notaContinuada; 
    }
    
    

    @Override
    public String toString() {
        return String.format("Aluno Graduação: "
                + "\n%s"
                + "\nNota Continuada: %.2f"
                + "\nNota Integrada: %.2f", 
                super.toString(),
                this.notaContinuada,
                this.notaIntegrada);
 
    }
    
    
    
}
