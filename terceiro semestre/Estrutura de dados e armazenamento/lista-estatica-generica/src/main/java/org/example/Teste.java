package org.example;

public class Teste {
    public static void main(String[] args) {
        ListaObj<String> lista = new ListaObj<>(5);
        ListaObj<Integer> listaInteiros = new ListaObj<>(5);

        lista.adiciona("a");
        lista.adiciona("b");
        lista.adiciona("c");
        lista.adiciona("d");
        lista.adiciona("e");

        listaInteiros.adiciona(1);
        listaInteiros.adiciona(2);
        listaInteiros.adiciona(3);
        listaInteiros.adiciona(4);
        listaInteiros.adiciona(5);



        System.out.println(lista.busca("a"));
        System.out.println(listaInteiros.busca(3));
//        System.out.println(lista.busca(10));

        System.out.println(lista.removePeloIndice(1));
        System.out.println(listaInteiros.removeElemento(4));
        lista.exibe();
        listaInteiros.exibe();


    }
}
