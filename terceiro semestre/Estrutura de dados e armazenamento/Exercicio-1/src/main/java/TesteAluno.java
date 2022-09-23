public class TesteAluno {
    public static void main(String[] args) throws InterruptedException {
        AlunoFundamental af = new AlunoFundamental("01212037", "victor veniti", 10.0, 10.0, 10.0, 10.0);
        AlunoFundamental af2 = new AlunoFundamental("01212040", "teste1", 5.0, 5.2, 2.0, 10.0);
        AlunoGraduacao ag = new AlunoGraduacao("01212038", "Allan turing", 9.8, 9.9);
        AlunoGraduacao ag2 = new AlunoGraduacao("0121241", "test2", 5.0, 3.0);
        AlunoPos ap = new AlunoPos("01212039", "mellisa baschgran", 7.6, 7.4, 6.0);
        AlunoPos ap2 = new AlunoPos("01212042", "teste3", 1.0, 1.2, 0.3);

        Escola e = new Escola("sptech");
        utils u = new utils();

        System.out.println("<".repeat(50) + "São Paulo Tech School" + ">".repeat(50));


        u.atualizaLista();

        e.adicionaAluno(af);
        e.adicionaAluno(af2);
        e.adicionaAluno(ag);
        e.adicionaAluno(ag2);
        e.adicionaAluno(ap);
        e.adicionaAluno(ap2);

        u.listaAtualizada();


        u.buscaAluno();
        e.exibeTodos();
        u.pausa();

        u.buscarGraduado();
        e.exibeAlunoGraduacao();
        u.pausa();

        u.buscaAprovados();
        e.exibeAprovado();
        u.pausa();

        u.buscaRa();
        e.buscalAluno("01212037");
        u.pausa();
    }
}
