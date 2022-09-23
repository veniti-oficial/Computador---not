import java.util.List;
import java.util.Scanner;

public class TesteCarrinho {
    public static void main(String[] args) {
        Integer opcao = null;
        Double valor = null;


        String nomeDVD = null;
        String gravadora = null;

        String nomeLivro = null;
        String autor = null;
        String isbn = null;

        String descricao = null;
        Integer codigo = null;
        Integer quantHoras = null;
        Double valorHora = null;

        Scanner leitor = new Scanner(System.in);
        Scanner leitorNL = new Scanner(System.in);

        Boolean fim = false;

        Carrinho c =new Carrinho();

        while(!fim) {
            System.out.println("Selecione uma das opções:\n" +
                    "1. Adicionar Livro,\n" +
                    "2. Adicionar DVD,\n" +
                    "3. Adicionar Serviço,\n" +
                    "4. Exibir itens do carrinho,\n" +
                    "5. Exibir total de venda,\n" +
                    "6. Fim");

            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("digite o código do Livro");
                    codigo = leitor.nextInt();
                    System.out.println("Digite o valor do livro");
                    valor = leitor.nextDouble();
                    System.out.println("Digite o nome do livro");
                    nomeLivro = leitorNL.nextLine();
                    System.out.println("Digite o nome do autor");
                    autor = leitorNL.nextLine();
                    System.out.println("Digite o codigo ISBN");
                    isbn = leitor.next();

                    Livro l = new Livro(codigo, valor, nomeLivro, autor, isbn);
                    c.adicionaVendavel(l);
                    break;

                case 2:
                    System.out.println("digite o código do DVD");
                    codigo = leitor.nextInt();
                    System.out.println("Digite o valor do DVD");
                    valor = leitor.nextDouble();
                    System.out.println("Digite o nome do DVD");
                    nomeDVD = leitorNL.nextLine();
                    System.out.println("Digite a gravadora do DVD");
                    gravadora = leitorNL.nextLine();

                    DVD d = new DVD(codigo, valor, nomeDVD, gravadora);
                    c.adicionaVendavel(d);
                    break;

                case 3:
                    System.out.println("Digite a descriço do serviço");
                    descricao = leitorNL.nextLine();
                    System.out.println("Digite o codigo do serviço");
                    codigo = leitorNL.nextInt();
                    System.out.println("Digite a quantidade de horas");
                    quantHoras = leitor.nextInt();
                    System.out.println("Digite o valor por hora");
                    valorHora = leitor.nextDouble();

                    Servico s = new Servico(descricao, codigo, quantHoras, valorHora);
                    c.adicionaVendavel(s);
                    break;

                case 4:
                    c.exibeItensCarrinho();

                case 5:
                    c.calculaTotalVenda();

                case 6:
                    fim = true;
                    break;

                default:
                    System.out.println("Opção invalida");
                    break;
            }
        }


    }
}
