package aula.pkg6;

public class App {
    public static void main(String[] args) {
    aluno a1 = new aluno("#123", "Manoel", "ADS");
//    
//    a1.ra = "#123";
//    a1.nome = "Manoel";
//    a1.curso = "Análise e desenvolvimento de sistemas";
//    a1.nota1 = 10.0;
//    a1.nota2 = 8.0;


//    a1.setRa("#01212037");
//    a1.setNome("Victor Veniti");
//    a1.setCurso("#ADS");
//    a1.setNota1(10.0);
//    a1.setNota2(7.0);
//    
        System.out.println(String.format("RA: %s", a1.getRa()));
        System.out.println(String.format("Nome: %s", a1.getNome()));
        System.out.println(String.format("Curso: %s", a1.getCurso()));
        System.out.println(String.format("Nota 1: %.1f", a1.getNota1()));
        System.out.println(String.format("Nota 2: %.1f", a1.getNota2()));
        System.out.println(String.format("Média: %.1f", 
                            a1.getMedia()));
        
        System.out.println(a1);

    
    
    }
    
}
