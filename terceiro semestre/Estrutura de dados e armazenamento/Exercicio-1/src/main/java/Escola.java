import java.util.ArrayList;
import java.util.List;

public class Escola {

    private String escola;
    private List<Aluno> listaAluno;

    public Escola(String escola) {
        this.escola = escola;
        this.listaAluno = new ArrayList<Aluno>();
    }

    public void adicionaAluno(Aluno a) {
         listaAluno.add(a);
        //System.out.println("Aluno adicionado com exito!");
    }

    public void exibeTodos() {
        for(Aluno a : listaAluno) {
            System.out.println(a);
        }
    }

    public void exibeAlunoGraduacao() {
        for(Aluno a : listaAluno) {
            if(a instanceof AlunoGraduacao) {
                System.out.println(a);
            }
        }
    }

    public void exibeAprovado() {
        for(Aluno a : listaAluno) {
            if(a.calcularMedia() > 6) {
                System.out.println(a);
            }
        }
    }

    public void buscalAluno (String ra) {
        boolean achou = false;

        for(Aluno a : listaAluno) {
            if(a.getRa().equals(ra)) {
                System.out.println(a);
                achou = true;
            }

            if(!achou) {
                System.out.println("Aluno não encontrado");
            }
        }
    }




}
