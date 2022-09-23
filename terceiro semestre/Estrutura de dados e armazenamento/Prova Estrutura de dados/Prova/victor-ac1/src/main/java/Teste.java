public class Teste {
    public static void main(String[] args) {
        MedicoCirurgao cirurgao1 = new MedicoCirurgao("010101", "lucas alves", 10, 2500.00, 300.0);
        MedicoCirurgao cirurgao2 = new MedicoCirurgao("0127329", "Josias ", 15, 2700.00, 400.0);
        MedicoClinico clinico1 = new MedicoClinico("124381", "Carlos Felix", 45, 800.00);
        MedicoClinico clinico2 = new MedicoClinico("27637152", "Paulo Gabriel", 35, 300.00);
        Acionista acionista1 = new Acionista("Danilo", 28, 1400.00);
        Acionista acionista2 = new Acionista("Victor Veniti", 78, 2000.00);
        ControleBonus bonus = new ControleBonus();

        bonus.adiconaBonificavel(cirurgao1);
        bonus.adiconaBonificavel(cirurgao2);
        bonus.adiconaBonificavel(clinico1);
        bonus.adiconaBonificavel(clinico2);
        bonus.adiconaBonificavel(acionista1);
        bonus.adiconaBonificavel(acionista2);

        System.out.println("Lista de todos colabores que recebem Bônus:");
        bonus.exibirBonificaveis();

        System.out.println(String.format(
                "valor total de bonus dos colaboradores = %.2f", bonus.controleBonus()
        ));
    }
}
