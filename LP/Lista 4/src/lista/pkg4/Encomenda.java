package lista.pkg4;

public class Encomenda {
    String tamanho;
    String enderecoRemetente;
    String enderecoDestinatario;
    Double distancia;
    Double valorEncomendado;
    
    Double calcularFrete(Double distancia, String tamanho){
        Double valor = 0.00;
        
        if(distancia <= 50.00){
            valor += 3.00;
        }else if( distancia > 50.00 && distancia <= 200.00){
            valor += 5.00;
        }else if(distancia > 200.00){
            valor += 7.00;
        }
        
        if(tamanho.equals("P")){
            valor += valor * 0.01;
        }else if(tamanho.equals("M")){
            valor += valor * 0.03;
        }else if(tamanho.equals("G")){
            valor += valor * 0.05;
        }
        
        return valor;
    }
}
