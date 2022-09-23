package school.sptech.projeto1.heranca;

public class ProdutoInternacional extends Produto{

    public ProdutoInternacional(Integer id, String nome, String categoria, Double preco) {
        super(id, nome, categoria, preco);
    }
 
    
    
    
    /* 
        Essa classe deve ser herdeira de produto;
        O método "getPreco" (getter padrão) deverá ser sobreescrito e possuir um acréscimo de 
        60%;
    */   

    @Override
    public Double getPreco() {
        return super.getPreco() + (super.getPreco()* 0.6); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody

    }
        
    
}
