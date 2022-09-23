import java.util.ArrayList;
import java.util.List;

public class Empresa {
    //atributo
    private List<Funcionario> lista;

    //construtor
    public Empresa(){
        lista = new ArrayList<Funcionario>();
    }

    //Método que adiciona funcionario
    public void adicionaFuncionario(Funcionario f) {
        lista.add(f);
    }

    //Método exibe todos
    public void exibeTodos() {
        System.out.println("\nLista de funcionario");
        for(Funcionario f : lista) {
            System.out.println(f);
        }
    }

    //Método exibe total do salario
    public void exibeTotalSalario() {
        Double total = 0.0;
        for(Funcionario f : lista) {
            total += f.calcularSalario();
        }
        System.out.println("\n total dos salarios:" + String.format("R$ %.2f", total));
    }

    //Método exibe horistas
    public void exibeHorista() {
        for(Funcionario f : lista) {
            if(f instanceof Historia) {
                System.out.println(f);
            }
        }
    }

    //Método busca um funcionrio pelo cpf e verifica se existe
    public void buscaFuncionario(String cpf) {
        Boolean achou = false;
        for(Funcionario f : lista) {
            if(f.getCpf().equals(cpf)) {
                System.out.println(f);
                achou = true;
            }

        }
        if(!achou) {
            System.out.println("Não achou");
        }
    }
}

