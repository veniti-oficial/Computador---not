package com.mycompany.nivelamento;

import java.util.Scanner;

public class NIvelamento {
    public static void main(String[] args) {
    Scanner leitorN = new Scanner(System.in);
    Integer Qfilhos = 0;
    Double total= 0.00;
    
    System.out.println("Digite quantos filhos entre 0-3 anos");
    Integer filhos03 = leitorN.nextInt();
    total += filhos03 * 25.12;
    Qfilhos += filhos03;
    
 
    System.out.println("Digite quantos filhos tem entre 4-16 anos");
    Integer filhos46 = leitorN.nextInt();
    total += filhos46 * 15.88;
    Qfilhos += filhos46;
    
        System.out.println("Digite quantos filhos tem entre 17-18 anos");
    Integer filhos78 = leitorN.nextInt();
    total += filhos78 * 12.44;
    Qfilhos += filhos78;
    
    String frase = String.format ("Você tem um total de %d filhos e vai receber "
            + "R$%.2f de bolsa", Qfilhos, total);
    
        System.out.println(frase);
        

    //if(filhos03 > 0){
    //    System.out.println("Você tem filhos");
    //}else{System.out.println("Você não tem filhos");}
    
    }
    
}
