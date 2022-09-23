public class TestaTributo {
    public static void main(String[] args) {
        Perfume p = new Perfume(1, "plutão", 90.00, "fraganciaTeste");
        Perfume p2 = new Perfume(2, "lolzin", 120.00, "fraganciaTeste2");
        Alimento a = new Alimento(3, "Ruffles", 8.00, 987);
        Alimento a2 = new Alimento(4, "Doritos", 10.00, 748);
        Servico s = new Servico("pedreiro", 2000.00);
        Servico s2 = new Servico("Programdor", 5000.00);

        Tributo t = new Tributo();

        System.out.println("Atualizando lista...");
        t.adicionaTributavel(p);
        t.adicionaTributavel(p2);
        t.adicionaTributavel(a);
        t.adicionaTributavel(a2);
        t.adicionaTributavel(s);
        t.adicionaTributavel(s2);

        System.out.println("Exibindo todos...");
        t.exibeTodos();

        System.out.println("=".repeat(50));

        System.out.println(
        String.format("Exibindo valor do tributo Total=%.2f",t.calculaTotalTributo()));

        System.out.printf("Total de Atributos: R$ %010.2f\n", t.calculaTotalTributo());

    }
}
