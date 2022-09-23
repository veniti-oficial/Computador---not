package lista.pkg4;

public class Termometro {
    double temperaturaAtual;
    double temperaturaMinima;
    double temperaturaMaxima;
    
    void aumentaTemperatura(double aumentar){
        if(aumentar > temperaturaMaxima){
            temperaturaAtual = aumentar;
        }
    }
    
    void diminuiTemperatura(double diminuir){
        if(diminuir < temperaturaMinima){
            temperaturaAtual = diminuir;
        }
    }
    
    double exibirFahreinheit(){
        double fahreinheit = (temperaturaAtual * 9/5) + 32;
        
        return fahreinheit;
    }
}
