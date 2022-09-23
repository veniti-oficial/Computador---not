public class HeroiTiposPrimitivos {
    String nome;
    String cpf;
    //usam tipos primitivos, não são classes ou seja não tem atributos nem métodos.
    //eles só guardam o valor me si (numero, boolean etc...)
    //ees tem sempre valor padrão quando são atributos de instância
    int idade; //padrão vai ser 0
    double peso; //padrão vai ser 0.0
    boolean vivo; // padrão vai ser false

    public boolean isVivo() {
        return vivo;
    }
}
