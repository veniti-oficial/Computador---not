import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private List<Vendavel> cart;

    public Carrinho() {
        this.cart = new ArrayList<Vendavel>();
    }

    public void adicionaVendavel(Vendavel v) {
        cart.add(v);
    }

    public Double calculaTotalVenda() {
        Double total = 0.0;
        for(Vendavel v : cart) {
            total += v.getValorVenda();
        }
        return total;
    }

    public void exibeItensCarrinho() {
        for(Vendavel v : cart) {
            System.out.println(v);
        }
    }
}
