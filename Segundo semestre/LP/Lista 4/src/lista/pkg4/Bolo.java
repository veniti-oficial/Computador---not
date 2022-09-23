package lista.pkg4;

public class Bolo {

    String sabor;
    double valor;
    Integer quantidadeVendida = 0;

    void comprarBolo(Integer qtdBolo) {
        if (quantidadeVendida > 100) {
            System.out.println("Seu pedido ultrapassou nosso limite diário para esse bolo.");
        } else {
            while (quantidadeVendida < qtdBolo) {
                quantidadeVendida++;
                if (sabor.equals("chocolate")) {
                    valor += 35.00;
                    System.out.println(String.format("O bolo sabor %s, foi comprado %d "
                            + "vezes hoje, totalizando R$ %.2f", sabor, quantidadeVendida, valor));
                } else if (sabor.equals("morango")) {
                    valor += 40.00;
                    System.out.println(String.format("O bolo sabor %s, foi comprado %d "
                            + "vezes hoje, totalizando R$ %.2f", sabor, quantidadeVendida, valor));
                } else if (sabor.equals("abacaxi")) {
                    valor += 50.00;
                    System.out.println(String.format("O bolo sabor %s, foi comprado %d "
                            + "vezes hoje, totalizando R$ %.2f", sabor, quantidadeVendida, valor));
                }

            }
        }
    }
}
