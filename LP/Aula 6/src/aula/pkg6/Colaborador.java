package aula.pkg6;
//Encapsulamento e onde eu coloco as regras do meu sistema e 
public class Colaborador {
    
    //declarando atributos como privados, soente esta clsse acessa diretamente
    private String  nome;
    private String cargo;
    private Double salario;
    
    //Contrutor diz com quais valores os atributos nascem!

    //Aqui o salario começa zerado
    public Colaborador(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = 0.0;
    }
    
    //Aqui sobrecarga do construtor
    //Aqui o salario começa com o que foi informado no momento do new
        public Colaborador(String nome, String cargo, Double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
    
    
    
    
    
    
    
    
    //get e set È o que vai prmitir acessar os atributos, já que agora eles - 
    //são prvados

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        if(salario > 0){
            this.salario = salario;
        }
        
    }

    @Override
    public String toString() {
        return "Colaborador{" + "nome=" + nome + ", cargo=" + cargo + ", salario=" + salario + '}';
    }
    
    
    
    
}
