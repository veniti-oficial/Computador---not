public class app {
    public static void main(String[] args) {
        ListaEstatica lista = new ListaEstatica(5);
        lista.adiciona(10);
        lista.adiciona(20);
        lista.adiciona(30);

//       lista.exibe();
//        System.out.println(lista.busca(20));
//        System.out.println(lista.busca(10));

        //System.out.println(lista.removePeloIndice(1));
        System.out.println(lista.removeElemento(20));
        lista.exibe();
    }
}
