public class App {
    public static void main(String[] args) {
        //criação dos objetos das classes herdeiras do Funcionario
        Engenheiro e = new Engenheiro("54321", "nome teste", 15000.0);
        Vendedor v= new Vendedor("12345","nome teste dois", 30000.0, 0.10);
        Historia h = new Historia("098765", "nome teste tres", 40, 47.0);

        //Criação do objeto Empresa
        Empresa sptech = new Empresa();

        sptech.adicionaFuncionario(e);
        sptech.adicionaFuncionario(v);
        sptech.adicionaFuncionario(h);

        //sptech.exibeTodos();
        //sptech.exibeHorista();
        //sptech.exibeTotalSalario();
        sptech.buscaFuncionario("54321");

    }
}
