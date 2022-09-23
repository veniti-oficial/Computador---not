import java.util.Arrays;

public class ListaEstatica {

    // 01) Declarar vetor de int:
    // É inicializado no construtor
    private Integer[] vetor;


    // 02) Criar atributo nroElem:
    // Tem dupla função: representa quantos elementos foram adicionado no vetor
    // Também o índice de onde será adicionado o próximo elemento
    private Integer nroElem;


    // 03) Criar Construtor:
    // Recebe como argumento o tamanho máximo do vetor
    // Cria vetor com tamanho máximo informado
    // Inicializa nroElem

    public ListaEstatica(Integer tamanho) {
        this.vetor = new Integer[tamanho];
        this.nroElem = 0;
    }


    // 04) Método adiciona:
    // Recebe o elemento a ser adicionado na lista
    // Se a lista estiver cheia usar IllegalStateException();
    public void adiciona(Integer elemento) {
        if(nroElem > vetor.length) {
            throw  new IllegalStateException();
        }else {
            vetor[nroElem++] = elemento;
        }
    }


    // 05) Método busca:
    // Recebe o elemento a ser procurado na lista
    // Retorna o índice do elemento, se for encontrado
    // Retorna -1 se não encontrou
    public Integer busca(Integer elemento) {
        for(Integer i = 0; i < nroElem; i++) {
            if(vetor[i]== elemento) {
                return i;
            }
        }
        return -1;
    }


    // 06) Método removePeloIndice:
    // Recebe o índice do elemento a ser removido
    // Se o índice for inválido, retorna false
    // Se removeu, retorna true
    public boolean removePeloIndice(Integer indice) {
        if(indice < 0 || indice >= nroElem) {
            return false;
        }

        for(Integer i = 0; i < nroElem ; i++) {
            vetor[i] = vetor[i + 1];
        }

        nroElem--;
        return true;
    }


    // 07) Método removeElemento
    // Recebe um elemento a ser removido
    // Utiliza os métodos busca e removePeloIndice
    // Retorna false, se não encontrou o elemento
    // Retorna true, se encontrou e removeu o elemento


    // 08 Método exibe:
    // Exibe os elementos da lista


    //Métodos getVetor e getNroElem
    //São usados nos testes
    public int getNroElem() {
        return nroElem;
    }

    public int[] getVetor() {
        return vetor;
    }
}
