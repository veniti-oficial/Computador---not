package lista.pkg4;

public class Bolo {
    String sabor;
    double valor;
    Integer quantidadeVendida;
    
    
    void comprarBolo(Integer qtdBolo){
        if(qtdBolo > 100){
            System.out.println("Seu pedido ultrapassou nosso limite diário para "
                    + "esse bolo.");
        }else{
            System.out.println(String.format("O bolo sabor %s, foi comprado %d vezes hoje, "
                    + "totalizando R$ %.2f", sabor, quantidadeVendida, valor));
        }
    }
    
    
}
