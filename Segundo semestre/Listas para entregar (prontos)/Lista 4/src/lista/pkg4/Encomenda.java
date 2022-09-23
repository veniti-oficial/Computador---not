package lista.pkg4;

public class Encomenda {
    String tamanho;
    String enderecoRemetente;
    String enderecoDestinatario;
    Double distancia;
    Double valorEncomenda;
    
    void calcularFrete(Double distancia, String tamanho, Double valorEncomenda){
        Double valor = valorEncomenda;
        Double valorFrete = 0.00;
        
        if(distancia <= 50.00){
            valor += 3.00;
            valorFrete = 3.00;
        }else if( distancia > 50.00 && distancia <= 200.00){
            valor += 5.00;
            valorFrete = 5.00;
        }else if(distancia > 200.00){
            valor += 7.00;
            valorFrete += 7.00;
        }
        
        if(tamanho.equals("Pequeno")){
            valor += valor * 0.01;
        }else if(tamanho.equals("Médio")){
            valor += valor * 0.03;
        }else if(tamanho.equals("Grande")){
            valor += valor * 0.05;
        }
        
        System.out.println(String.format("**** ETIQUETA PARA ENVIO****\n\n"
                + "endereço do remetente = %s\n"
                + "endereço do destinário = %s\n"
                + "Tamanho = %s\n"
                + "-".repeat(30)
                + "\nValor encomenda = %.2f\n"
                + "Valor frete = %.2f\n"
                + "-".repeat(30)
                + "\nValor total = %.2f\n", enderecoRemetente, enderecoDestinatario, tamanho, valorEncomenda, valorFrete, valor));
    }
}
