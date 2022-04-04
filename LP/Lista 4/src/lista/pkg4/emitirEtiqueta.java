package lista.pkg4;

public class emitirEtiqueta {
    public static void main(String[] args) {
        Encomenda pedido1 = new Encomenda();
        
        pedido1.enderecoRemetente = "Shopping Aricandiva, 5555";
        pedido1.enderecoDestinatario = "avenida arraias do araguaia, 16";
        
        
        System.out.println(String.format("**** ETIQUETA PARA ENVIO****\n\n"
                + "endereõ do remetente = %s\n"
                + "endereço do destinário = %s\n"
                + ""));
    }
}
