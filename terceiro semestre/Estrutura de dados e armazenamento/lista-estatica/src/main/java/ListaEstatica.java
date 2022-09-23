public class ListaEstatica {
    Integer[] vetor;
    Integer nroelem;

    public ListaEstatica(Integer tam) {
        this.vetor = new Integer[tam];
        this.nroelem = 0;
    }

    public void adiciona(Integer elemento) {
        if (nroelem == vetor.length) {
            System.out.println("Lista cheia");
        } else {
            for(Integer i = 0; i < vetor.length; i++)
            vetor[nroelem] = elemento;
            nroelem++;
        }

    }

    public void exibe() {
        for(Integer i = 0; i < nroelem; i++) {
            System.out.println(vetor[i]);
        }
    }

    public Integer busca(Integer elemento) {
        for(Integer i = 0; i < vetor.length; i++){
            if(vetor[i] == elemento) {
                return i;
            }
        }
        return -1;
    }

    //
    public boolean removePeloIndice(Integer indice) {
        for(Integer i = 0; i < vetor.length; i++) {
            if(indice <= vetor.length) {
                vetor[i] = null;
                return true;
            }
        }
        return false;
    }

    public boolean removeElemento(Integer elemento) {
        for(Integer i = 0; i < vetor.length; i++) {
            if(vetor[i] == elemento) {
                vetor[i] = null;
                return true;
            }
        }
        return false;
    }
}
