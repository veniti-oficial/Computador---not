import java.util.ArrayList;
import java.util.List;

public class ControleBonus {
    private List<Bonificavel> bonificavel = new ArrayList<>();

    public Double controleBonus() {
        Double total = 0.0;

        for(Bonificavel b : bonificavel){
            total += b.getValorBonus();
        }

        return total;
    }

    public void exibirBonificaveis() {
       for(Bonificavel b : bonificavel) {
           System.out.println(b);
       }
    }

    public void adiconaBonificavel(Bonificavel b) {
        this.bonificavel.add(b);
    }


}
