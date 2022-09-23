package lista.pkg4;

public class emitirEtiqueta {
    public static void main(String[] args) {
        Encomenda pedido1 = new Encomenda();
        
        pedido1.enderecoRemetente = "Shopping Aricandiva, 5555";
        pedido1.enderecoDestinatario = "avenida arraias do araguaia, 16";
   
        
        
        pedido1.calcularFrete(52.00, "Pequeno", 30.00);
    }
}
