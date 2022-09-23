public class App {
    public static void main(String[] args) {
        System.out.println("É nois no intellij");

        Heroi h1 = new Heroi();
        System.out.println("idade: "+h1.idade);

        HeroiTiposPrimitivos h2 = new HeroiTiposPrimitivos();
        System.out.println("Idade: "+h2.idade);
        System.out.println("Peso: "+h2.peso);
        System.out.println("vivo: "+h2.vivo);

        Integer inteiro1 = null;
        System.out.println(inteiro1);

        //quando são variaveis locais as variaveis primitivas precisam ser inicializadas antes de serem usadas
        //int inteiro2; //isso é uma variavel local
        //System.out.println(inteiro2); //não compila

    }
}
