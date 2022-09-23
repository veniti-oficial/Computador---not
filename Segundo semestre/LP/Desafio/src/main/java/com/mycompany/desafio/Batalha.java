package com.mycompany.desafio;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Batalha {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitor2 = new Scanner(System.in);
        Integer opcaoEscolhida = 0;
        Integer pontoBatalha = 0;

        System.out.println("Bem vindo a batalha de protagonistas,\nveja o perfil"
                + " dos protagonistas e escolha seu favorio para a batalha");

        System.out.println("digite o personagem para informações de poder\n\n"
                + "1 - Tanjito\n2 - Goku\n3 - Naruto\n4 - Saitama\n0 - Escolher"
                + " personagem");

        Integer personagem = leitor.nextInt();

        while (personagem != 0) {

            switch (personagem) {
                case 1:
                    System.out.println("Tanjiro Kamdo:\n"
                            + "Usa uma katana e controle de respiração como sua"
                            + " principal arma onde consegue fazer cortes fortes e "
                            + "precisos\nPode de combate = 150\n");
                    break;
                case 2:
                    System.out.println("Son Goku:\n"
                            + "O mais poderoso Sayajim da terra conta com o KI como"
                            + " sua fonte de poder onde pode soltar poderes como "
                            + "kamehameha e conta \ncom um poder de combate avassalador"
                            + "\nPoder de combate = 250\n");
                    break;
                case 3:
                    System.out.println("Naruto Uzumaki:\n"
                            + "O 7° Hokage da aldeia da folha, um dos mais poderosos"
                            + " ninjas que já existiu conta com o chakra onde com ele"
                            + " pode usar Jutsus\n de poderes imensos e conta com a "
                            + "ajuda de Kumara para aumentar ainda mais seu poder"
                            + "\nPoder de combate = 350\n");
                    break;
                case 4:
                    System.out.println("Saitama:\n"
                            + "O heroi por diversão saitama conta com uma força de "
                            + "combate inigualavel onde nem mesmo ele sabe de onde "
                            + "vem a "
                            + "origem desse poder"
                            + "\nPoder de combate = 1000000000000000000000\n");
                    break;
                default:
                    break;
            }
            System.out.println("Digite outro personagem ou 0 para escolher");
            personagem = leitor.nextInt();

        }
        System.out.println("Agora escolha seu personagem");
        Integer personagemEscolhido = leitor.nextInt();

        switch (personagemEscolhido) {
            case 1:
                System.out.println("O personagem escolhido foi Tanjiro");
                pontoBatalha = 150;
                break;

            case 2:
                System.out.println("O personagem escolhido foi Goku");
                pontoBatalha = 250;
                break;

            case 3:
                System.out.println("O personagem escolhido foi Naruto");
                pontoBatalha = 350;
                break;

            case 4:
                System.out.println("O personagem escolhido foi Saitama");
                pontoBatalha = 1000000000;
                break;
        }

        while (opcaoEscolhida != 4) {
        System.out.println("Agora que escolheu seu personagem vamos as suas\n"
                + "opções\n1 - Batalha\n2 - aumentar poder \n3 - roleta russa"
                + "\n4 - Sair do jogo");
                opcaoEscolhida = leitor.nextInt();
            switch (opcaoEscolhida) {
                case 1:
                    System.out.println("Então vamos a batalha se defiante será:");
                    Integer desafiante = ThreadLocalRandom.current().nextInt(0, 5);
                    switch (desafiante) {
                        case 1:
                            pontoBatalha -= 200;
                            System.out.println("\n Rui\n poder de comabte: 200");
                            if (pontoBatalha <= 0) {
                                System.out.println(String.format("Você perdeu essa batalha"
                                        + "sua pontuação é de %d", pontoBatalha));
                            } else {
                                System.out.println(String.format("Você venceu essa batalha sua pontuação"
                                        + "é de %d", pontoBatalha));
                            }
                            break;
                        case 2:
                            pontoBatalha -= 300;
                            System.out.println("\n Broly\n poder de combate: 300");
                            if (pontoBatalha <= 0) {
                                System.out.println(String.format("Você perdeu essa batalha sua pontuação"
                                        + "é de %d", pontoBatalha));
                            } else {
                                System.out.println(String.format("Você venceu a "
                                        + "batalha sua pontuação é de %d", pontoBatalha));
                            }
                            break;
                        case 3:
                            pontoBatalha -= 400;
                            System.out.println("\nPain\nPoder de combate:400");
                            if (pontoBatalha <= 0) {
                                System.out.println(String.format("Você perdeu essa"
                                        + " batalha sua pontuação é de %d", pontoBatalha));
                            } else {
                                System.out.println(String.format("Você venceu essa"
                                        + " batalha sua pontuação e de %d", pontoBatalha));
                            }
                            break;
                        case 4:
                            pontoBatalha -= 500;
                            System.out.println("\ndá no pé jacare\npoder de combate:399");
                            if (pontoBatalha <= 0) {
                                System.out.println(String.format("Você perdeu essa"
                                        + " batalha sua pontuação é de %d", pontoBatalha));
                            } else {
                                System.out.println(String.format("Você venceu essa"
                                        + " batalha sua pontuação e de %d", pontoBatalha));
                            }
                            break;
                        case 5:
                            pontoBatalha -= 1000;
                            System.out.println("\nMadara\npoder de combate = 1000");
                            if (pontoBatalha <= 0) {
                                System.out.println(String.format("Você perdeu essa"
                                        + " batalha sua pontuação é de %d", pontoBatalha));
                            } else {
                                System.out.println(String.format("Você venceu essa"
                                        + " batalha sua pontuação e de %d", pontoBatalha));
                            }
                            break;
                    }
                    break;
                case 2:
                    Integer acertos = 0;
                    System.out.println("Aqui você tem um jogo de perguntas e respostas"
                            + " sobre os protagonistas onde cada acerto aumenta seu poder\n"
                            + "vamos começar");

                    System.out.println("Qual o nome dos brincos de Tanjiro Kamado");
                    String pergunta1 = leitor2.next();

                    if (pergunta1.equals("Hanafuda")) {
                        pontoBatalha += ThreadLocalRandom.current().nextInt(0, 20);
                        System.out.println(String.format("Você acertou sua pontuação"
                                + " agora é de %d", pontoBatalha));
                        acertos++;
                    } else {
                        System.out.println("Resposta errada");
                    }

                    System.out.println("Qual o nome do rival de goku?");
                    String pergunta2 = leitor2.next();

                    if (pergunta2.equals("Vegeta")) {
                        pontoBatalha += ThreadLocalRandom.current().nextInt(0, 20);
                        System.out.println(String.format("Você acertou sua pontuação"
                                + " agora é de %d", pontoBatalha));
                        acertos++;
                    } else {
                        System.out.println("Resposta errada");
                    }
                    System.out.println("Quem é tobi?");
                    String pergunta3 = leitor2.next();

                    if (pergunta3.equals("Obito")) {
                        pontoBatalha += ThreadLocalRandom.current().nextInt(0, 20);
                        System.out.println(String.format("Você acertou sua pontuação"
                                + " agora é de %d", pontoBatalha));
                        acertos++;
                    } else {
                        System.out.println("Resposta errada");
                    }

                    System.out.println(String.format("Jogo encerrado sua pontuação "
                            + "é de %d com %d acertos", pontoBatalha, acertos));
                    break;
                case 3:
                    System.out.println("Aqui na roleta russa você escolhe um numero de \n"
                            + "1-10 se você acertar você soma mais 200 ponto de batalha\n"
                            + "mas caso errar será descontado 20 pontos \n\n vamos começar\n"
                            + "digite um numero de 1 a 10");
                    Integer numeroEscolhido = leitor.nextInt();
                    Integer numeroRoleta = ThreadLocalRandom.current().nextInt(0, 10);

                    if (numeroEscolhido == numeroRoleta) {
                        pontoBatalha += 200;
                        System.out.println(String.format("Acertoouuuu!!!\nsua pontuação "
                                + "agora é de %d", pontoBatalha));
                    } else {
                        pontoBatalha -= 20;
                        System.out.println(String.format("Infelizmente você errou o "
                                + "numero certo era %d\n sua pontuação agora é de"
                                + "%d", numeroRoleta, numeroEscolhido));
                    }
            }

        }
        
        System.out.println("Obrigado por jogar até a proxima!");
    }
}
