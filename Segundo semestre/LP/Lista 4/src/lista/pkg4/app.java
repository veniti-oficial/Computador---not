package lista.pkg4;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Bolo pedido1 = new Bolo();
        Bolo pedido2 = new Bolo();
        Bolo pedido3 = new Bolo();

        
        pedido1.sabor = "chocolate";
        pedido2.sabor = "morango";
        pedido3.sabor = "abacaxi";
        
        
        
        pedido1.comprarBolo(5);
        System.out.println("=".repeat(50));
        pedido2.comprarBolo(3);
        System.out.println("=".repeat(50));
        pedido3.comprarBolo(6);
        System.out.println("=".repeat(50));
        pedido3.comprarBolo(6);
        System.out.println("=".repeat(50));
        pedido3.comprarBolo(6);        
    }
}
