package lista.pkg4;

public class Termometro {
    double temperaturaAtual = 37.00;
    double temperaturaMinima;
    double temperaturaMaxima;
    
    void aumentaTemperatura(double aumentar){
        if(aumentar > temperaturaAtual){
            temperaturaAtual = aumentar;
        }
        
        System.out.println(String.format("temperatura maxima é = %.2f", temperaturaAtual));
    }
    
    void diminuiTemperatura(double diminuir){
        if(diminuir < temperaturaAtual){
            temperaturaAtual = diminuir;
        }
    }
    
    void exibirFahreinheit(double temp){
        double fahreinheit = (temp * 9/5) + 32;
        
        System.out.println(String.format("Temperatura em fahreinheit é = %.2f", fahreinheit));
        
    }
}
