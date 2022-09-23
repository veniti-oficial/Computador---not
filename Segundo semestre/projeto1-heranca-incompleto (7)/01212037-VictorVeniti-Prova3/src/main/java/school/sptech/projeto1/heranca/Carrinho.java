package school.sptech.projeto1.heranca;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    
    List<Produto> produtos;

    public Carrinho() {
        this.produtos = new ArrayList<>();
    }
    
    /**
     * Adiciona um {@link Produto} novo no carrinho.
     * Caso o valor seja {@link null} o {@link Produto} não deve ser adicionado
     * 
     * @param produto Novo {@link Produto} a ser adicionado
     */
    public void adicionarProduto(Produto produto) {
        if (produto != null) {
            produtos.add(produto);
        }
    }

    /**
     * Remove um {@link Produto} do carrinho pelo índice.
     *
     * @param indice Índice do {@link Produto} que será removido
     */
    public void removerProduto(int indice) {
        produtos.remove(indice);
    }
    
    /**
     * Calcula o valor total de todos os itens do carrinho.
     * 
     * @return valor total do carrinho
     */
    public Double calcularTotal() {
        Double total = 0.0;
        for(Produto produto : produtos) {
            total += produto.getPreco();
        }
        
        return total;
    }
    
    /**
     * Calcula o valor das parcelas de acordo com o número de vezes que
     * o usuário deseja parcelar.
     * 
     * @param vezes Número de vezes que o usuário deseja parcelar
     * @return total do carrinho parcelado
     */
    public Double parcelarCompra(Integer vezes) {
        return calcularTotal() / vezes;
    }
    
    /**
     * Encontra um {@link Produto} com o índice desejado.
     * Caso o índice não seja encontrado retorne {@link null}
     * 
     * @param index Índice do {@link Produto}
     * @return {@link Produto} encontrado
     */
    public Produto findProdutoPeloIndice(Integer index) {
        if (index < 0 || index >= produtos.size()) {
            return null;
        }
        
        return produtos.get(index);
    }
    
    /**
     * Encontra um {@link Produto} com o nome desejado ignorando letras 
     * maiúsculas e minúsculas.
     * 
     * Caso um {@link Produto} não seja encontrado retorne {@link null}
     * 
     * @param nome Nome do {@link Produto}
     * @return {@link Produto} encontrado
     */
    public Produto findProdutoPeloNome(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return produto;
            }
        }
        return null;
    }
    
    /**
     * Encontra todos os {@link Produto} de uma determinada categoria
     * ignorando letras maiúsculas e minúsculas.
     * 
     * Caso não encontre nenhum {@link Produto} devolva uma lista vazia
     * 
     * @param categoria Categoria desejada
     * @return Produtos encontrados
     */
    public List<Produto> findProdutoPorCategoria(String categoria) {
        List<Produto> produtosCategoria = new ArrayList<>();
        for (Produto produto : produtos) {
            if (produto.getCategoria().equalsIgnoreCase(categoria)) {
                produtosCategoria.add(produto);
            }
        }
        return produtosCategoria;
    }
    
    /**
     * Encontra todos os {@link ProdutoInternacional} presentes no {@link Carrinho}.
     * Caso não encontre nenhum {@link ProdutoInternacional} devolva uma lista vazia
     * 
     * @return Produtos internacionais encontrados
     */
    public Integer countProdutosInternacionais() {
        Integer contador = 0;
        for (Produto produto : produtos) {
            if (produto instanceof ProdutoInternacional) {
                contador++;
            }
        }
        return contador;
    }
    
    /**
     * Encontra e retorna um {@link Produto} com o id especificado
     * 
     * @param id Id do produto desejado
     * @return {@link Produto} encontrato
     */
    public Produto findProdutoPorId(Integer id) {
        for(Integer i = 0; i < produtos.size(); i++){
            if(produtos.get(i).getId().equals(id)){
                return produtos.get(i);
            }
        }
        return null;
    }
    
    /**
     * Atualiza o nome do {@link Produto} com o id especificado
     * Caso o produto não for encontrado não faça nada
     * 
     * @param id Id do {@link Produto} desejado
     * @param nome Novo nome do {@link Produto}
     */
    public void updateNomeProdutoPeloId(Integer id, String nome) {
        if(findProdutoPorId(id) != null){
            findProdutoPorId(id).setNome(nome);
        }
    }
    
    /**
     * Remove da lista todos os {@link Produto} de uma determinada categoria
     * ignorando letras maiúsculas e minúsculas.
     * 
     * Caso não encontre nenhum {@link Produto} não faça nada.
     * 
     * @param categoria Nome da categoria desejada
     */
    public void deleteTodosProdutosPorCategoria(String categoria) {
        for(Integer i = 0; i < produtos.size(); i++){
            if(produtos.get(i).getCategoria().equalsIgnoreCase(categoria)){
                //produtos.get(i).;
            }
        }
    }
    
    /**
     * Devolve uma lista com os nomes de todos os produtos com nomes repetidos
     * no carrinho.
     * 
     * Caso não encontre nenhum {@link Produto} duplicado retorne uma lista
     * vazia.
     * 
     * @return Lista de nomes repetidos na lista de produtos
     */
    public List<String> findNomesRepetidos() {
        return null;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
}