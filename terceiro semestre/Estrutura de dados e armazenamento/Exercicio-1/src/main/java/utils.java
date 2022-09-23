import java.util.concurrent.TimeUnit;
import java.util.logging.Handler;


public class utils {
    public void atualizaLista() throws InterruptedException {
        System.out.println("Atualizando lista de alunos...");
        TimeUnit.SECONDS.sleep(4);
    }

    public void listaAtualizada() throws InterruptedException {
        System.out.println("Lista atualizada com exito!");
        TimeUnit.SECONDS.sleep(2);
    }

    public void pausa() throws InterruptedException {
        System.out.println("=".repeat(100));
        TimeUnit.SECONDS.sleep(2);
    }

    public void buscaAluno() throws InterruptedException {
        System.out.println("Buscando alunos!");
        TimeUnit.SECONDS.sleep(2);
    }

    public void buscarGraduado() throws InterruptedException {
        System.out.println("Buscando alunos graduados!");
        TimeUnit.SECONDS.sleep(2);
    }

    public void buscaAprovados() throws InterruptedException {
        System.out.println("Buscando alunos aprovados!");
        TimeUnit.SECONDS.sleep(2);
    }

    public void buscaRa() throws InterruptedException {
        System.out.println("Buscando RA informado!");
        TimeUnit.SECONDS.sleep(2);
    }
}
