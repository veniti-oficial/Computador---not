package school.sptech.projeto1.heranca;

import java.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

public class CarrinhoTest {

    private Carrinho carrinho;
    
    private List<Produto> produtos = List.of(
        new Produto(1, "Pão Françês 1kg", "Padaria", 5.00),
        new Produto(2, "Queijo Mussarela 1kg", "Frios", 10.90),
        new Produto(3, "Requeijão Cremoso", "Frios", 8.90),
        new Produto(4, "Caneca", "Cozinha", 35.50),
        new Produto(5, "Faca Tramontina", "Cozinha", 98.90),
        new Produto(6, "O Poder do Hábito", "Livraria", 30.00),
        new Produto(7, "Cronicas de Gelo e Fogo", "Livraria", 90.00),
        new ProdutoInternacional(8, "Cartão de Memória", "Eletronicos", 50.00, 10.00),
        new ProdutoInternacional(9, "Pendrive", "Eletronicos", 30.90, 10.00),
        new ProdutoInternacional(10, "Controle Dualshock", "Videogame", 359.00, 10.00),
        new ProdutoInternacional(11, "Playstation 5", "Videogame", 4_999.00, 10.00),
        new Produto(42, "O Guia do Mochileiro das Galáxias", "Livraria", 35.90)
    );
    
    @BeforeEach
    void iniciar() {
        this.carrinho = new Carrinho();
        for (Produto produto : produtos) {
            carrinho.adicionarProduto(produto);
        }
    }
    
    @Test
    void dadoUmValorValidoMetodoAdicionarProdutoDeveAdicionarOProdutoNoCarrinho() {
        Produto novo = new Produto(100, "Lápis", "Papelaria", 1_000.00);
        
        carrinho.adicionarProduto(novo);
        
        assertEquals(produtos.size() + 1, carrinho.getProdutos().size());
        assertTrue(carrinho.getProdutos().contains(novo));
    }
    
    @Test
    void dadoUmValorInvalidoMetodoAdicionarProdutoNaoDeveAdicionarOProdutoNoCarrinho() {
        Produto novo = null;
        
        carrinho.adicionarProduto(novo);
        
        assertEquals(produtos.size(), carrinho.getProdutos().size());
    }
    
    @Test
    void aoPassarUmValorValidoMetodoRemoverProdutoDeveRemoverOProdutoDaLista() {
        Produto produto = produtos.get(2);
        
        carrinho.removerProduto(2);
        
        assertEquals(produtos.size() - 1, carrinho.getProdutos().size());
        assertFalse(carrinho.getProdutos().contains(produto));
    }

    @Test
    void aoAdicionarProdutosMetodoCalcularTotalDeveCalcularOValorDosItensDoCarrinho() {
        Carrinho carrinhoSoma = new Carrinho();
        carrinhoSoma.adicionarProduto(new Produto(1, "Pão Françês 1kg", "Padaria", 5.00));
        carrinhoSoma.adicionarProduto(new Produto(2, "Caneca", "Cozinha", 35.50));
        carrinhoSoma.adicionarProduto(new ProdutoInternacional(3, "Playstation 2", "videogame", 1000.00, 10.00));
        carrinhoSoma.adicionarProduto(new ProdutoInternacional(4, "Cartão de Memória", "Eletronicos", 50.00, 10.00));

        assertEquals(1720.5, carrinhoSoma.calcularTotal(), 1);
    }

    @Test
    void aoAdicionarProdutosMetodoParcelarProdutoDeveCalcularOValorDosItensParceladoEmTresVezes() {
        Carrinho carrinhoSoma = new Carrinho();
        carrinhoSoma.adicionarProduto(new Produto(1, "Pão Françês 1kg", "Padaria", 5.00));
        carrinhoSoma.adicionarProduto(new Produto(2, "Caneca", "Cozinha", 35.50));
        carrinhoSoma.adicionarProduto(new ProdutoInternacional(3, "Playstation 2", "videogame", 1000.00, 10.00));
        carrinhoSoma.adicionarProduto(new ProdutoInternacional(4, "Cartão de Memória", "Eletronicos", 50.00, 10.00));

        assertEquals(573.5, carrinhoSoma.parcelarCompra(3), 1);
    }
    
    @Test
    void quandoIndiceValidoMetodoFindProdutoPeloIndiceDeveRetornarOProdutoEncontrado() {
        Produto procurado = produtos.get(1);
        Produto encontrado = carrinho.findProdutoPeloIndice(1);
        
        assertEquals(procurado, encontrado);
    }
    
    @Test
    void quandoIndiceInvalidoMetodoFindProdutoPeloIndiceDeveRetornarNull() {
        Produto encontrado = carrinho.findProdutoPeloIndice(90);
        
        assertNull(encontrado);
    }
    
    @Test
    void quandoNomeValidoMetodoFindProdutoPeloNomeDeveRetornarOProdutoEncontrado() {
        Produto procurado = produtos.get(3);
        Produto encontrado = carrinho.findProdutoPeloNome("Caneca");
        
        assertEquals(procurado, encontrado);
    }
    
    @Test
    void quandoNomeValidoCaixaBaixaMetodoFindProdutoPeloNomeDeveRetornarOProdutoEncontrado() {
        Produto procurado = produtos.get(3);
        Produto encontrado = carrinho.findProdutoPeloNome("caneca");
        
        assertEquals(procurado, encontrado);
    }
    
    @Test
    void quandoNomeInvalidoMetodoFindProdutoPeloNomeDeveRetornarNull() {
        Produto encontrado = carrinho.findProdutoPeloNome("Computador");
        
        assertNull(encontrado);
    }
    
    @Test
    void quandoCategoriaValidaMetodoFindProdutoPorCategoriaDeveRetornarOsProdutosEncontrados() {
        List<Produto> procurados = List.of(produtos.get(9), produtos.get(10));
        List<Produto> encontrados = carrinho.findProdutoPorCategoria("Videogame");
        
        assertEquals(procurados, encontrados);
    }
    
    @Test
    void quandoCategoriaValidaECaixaAltaMetodoFindProdutoPorCategoriaDeveRetornarOsProdutosEncontrados() {
        List<Produto> procurados = List.of(produtos.get(9), produtos.get(10));
        List<Produto> encontrados = carrinho.findProdutoPorCategoria("VIDEOGAME");
        
        assertEquals(procurados, encontrados);
    }
    
    @Test
    void quandoCategoriaInvalidaMetodoFindProdutoPorCategoriaDeveRetornarUmaListaVazia() {
        List<Produto> encontrados = carrinho.findProdutoPorCategoria("Limpeza");
        
        assertTrue(encontrados.isEmpty());
    }
    
    @Test
    void quando4ProdutosInternacionaisAdicionadosMetodoCountProdutosInternacionaisDeveRetornar4() {
        Integer quantidade = carrinho.countProdutosInternacionais();
        
        assertEquals(4, quantidade);
    }
    
    @Test
    void quandoProdutosInternacionaisNaoAdicionadosMetodoCountProdutosInternacionaisDeveRetornar0() {
        Carrinho carrinhoSemInternacional = new Carrinho();
        carrinhoSemInternacional.adicionarProduto(new Produto(1, "Pão Françês 1kg", "Padaria", 5.00));
        carrinhoSemInternacional.adicionarProduto(new Produto(2, "Caneca", "Cozinha", 35.50));
        carrinhoSemInternacional.adicionarProduto(new Produto(3, "Playstation 2", "videogame", 1000.00));
        carrinhoSemInternacional.adicionarProduto(new Produto(4, "Cartão de Memória", "Eletronicos", 50.00));
        
        Integer quantidade = carrinhoSemInternacional.countProdutosInternacionais();
        
        assertEquals(0, quantidade);
    }

    @Test
    void quandoIdTresMetodoFindProdutoPorIdDeveRetornarOProdutoCorrespondente() {
        Produto produtoAchado = carrinho.findProdutoPorId(3);
        
        assertEquals(produtos.get(2), produtoAchado);
    }
    
    @Test
    void quandoIdQuarentaEDoisMetodoFindProdutoPorIdDeveRetornarOProdutoCorrespondente() {
        Produto produtoAchado = carrinho.findProdutoPorId(42);
        
        assertEquals(produtos.get(11), produtoAchado);
    }
    
    @Test
    void quandoIdQuatroENomeGarfoMetodoUpdateNomeProdutoPeloIdDeveMudarONomeDoProdutoCorrepondente() {
        carrinho.updateNomeProdutoPeloId(4, "Garfo");
        
        assertEquals("Garfo", carrinho.findProdutoPorId(4).getNome());
    }
    
    @Test
    void quandoVideogameRemoverTodosOsProdutosDaCategoriaDeveRemoverOsProdutosCorrespondentes() {
        carrinho.deleteTodosProdutosPorCategoria("Videogame");
        
        assertFalse(carrinho.getProdutos().contains(produtos.get(9)));
        assertFalse(carrinho.getProdutos().contains(produtos.get(10)));
    }
    
    @Test
    void quandoLivrariECaixaAltaRemoverTodosOsProdutosDaCategoriaDeveRemoverOsProdutosCorrespondentes() {
        carrinho.deleteTodosProdutosPorCategoria("LIVRARIA");
        
        assertFalse(carrinho.getProdutos().contains(produtos.get(5)));
        assertFalse(carrinho.getProdutos().contains(produtos.get(6)));
        assertFalse(carrinho.getProdutos().contains(produtos.get(11)));
    }
    
    @Test
    void quandoItensDuplicadosFindNomeRepetidosDeveRetornarAListaDeNomesDuplicados() {
        Carrinho carrinhoRepetido = new Carrinho();
        carrinhoRepetido.adicionarProduto(new ProdutoInternacional(1, "Playstation 2", "videogame", 1000.00, 10.00));
        carrinhoRepetido.adicionarProduto(new Produto(2, "Pão Françês 1kg", "Padaria", 5.00));
        carrinhoRepetido.adicionarProduto(new Produto(3, "Caneca", "Cozinha", 35.50));
        carrinhoRepetido.adicionarProduto(new ProdutoInternacional(4, "Playstation 2", "videogame", 1000.00, 10.00));
        carrinhoRepetido.adicionarProduto(new ProdutoInternacional(5, "Cartão de Memória", "Eletronicos", 50.00, 10.00));
        carrinhoRepetido.adicionarProduto(new ProdutoInternacional(6, "Cartão de Memória", "Eletronicos", 50.00, 10.00));
        
        List<String> repetidos = carrinhoRepetido.findNomesRepetidos();
        
        assertEquals(List.of("Playstation 2", "Cartão de Memória"), repetidos);
    }
    
    @Test
    void quandoItensNaoDuplicadosFindNomeRepetidosDeveRetornarUmaListaVazia() {
        Carrinho carrinhoRepetido = new Carrinho();
        carrinhoRepetido.adicionarProduto(new ProdutoInternacional(1, "Playstation 2", "videogame", 1000.00, 10.00));
        carrinhoRepetido.adicionarProduto(new Produto(2, "Pão Françês 1kg", "Padaria", 5.00));
        carrinhoRepetido.adicionarProduto(new Produto(3, "Caneca", "Cozinha", 35.50));
        carrinhoRepetido.adicionarProduto(new ProdutoInternacional(5, "Cartão de Memória", "Eletronicos", 50.00, 10.00));
        
        List<String> repetidos = carrinhoRepetido.findNomesRepetidos();
        
        assertEquals(List.of(), repetidos);
    }
}
