import java.util.ArrayList;
import java.util.List;

public class Tributo {
private List<Tributavel> listaTrib;

    public Tributo() {
        this.listaTrib = new ArrayList<Tributavel>();
    }
    //era pra por tributavel eu tinha colocado Produto



    public void adicionaTributavel(Tributavel t) {
        listaTrib.add(t);
    }



    public void exibeTodos() {
        for(Tributavel t : listaTrib) {
            System.out.println(t);
        }
    }



    public Double calculaTotalTributo() {
        Double total = 0.00;
        for(Tributavel t : listaTrib) {
            total += t.getValorTributo();
        }
        return total;
    }


}
