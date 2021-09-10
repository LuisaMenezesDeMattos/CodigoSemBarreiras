package exercicios.extras.jogo_da_forca;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static String lerString(){
        return new Scanner(System.in).nextLine();
    }
    public static Character lerLetraMinuscula(){
        String leitura = lerString();
        while(leitura == null || leitura.isEmpty() || leitura.isBlank()){
            leitura = lerString();
            System.out.println("* Digite uma letra!");
        }
        leitura = leitura.toLowerCase(Locale.ROOT);
        return leitura.charAt(0);
    }

    public static Boolean jogar(){
        System.out.println("\nDeseja iniciar uma nova partida?");
        System.out.println("'s' para SIM | 'n' para NÃO");
        System.out.print("> ");
        Character leitura = lerLetraMinuscula();
        while(leitura != 's' && leitura != 'n'){
            System.out.println("* Insira uma das opções dadas!");
            leitura = lerLetraMinuscula();
        }
        if(leitura == 's'){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        //Título do programa:
        System.out.println("\n-------------------------------------------------------");
        System.out.println("-------------------  JOGO DA FORCA  -------------------");
        System.out.println("-------------------------------------------------------");

        //Jogo:
        while(jogar()){

            //Gerar nova partida:
            Partida partida = new Partida();

            //Título da partida:
            System.out.println("\n-------------------------------------------------------");
            System.out.println("--  Vitórias: " + Partida.partidasGanhas);
            System.out.println("--  Fracassos: " + Partida.partidasPerdidas);
            System.out.println("-------------------------------------------------------\n");
            System.out.println("PARTIDA #" + Partida.qtdPartidas + ":");
            System.out.println("-------------------------------------------------------");

            //Rodadas:
            while(!partida.isFinalizada()){
                System.out.println("\n--  Vidas: " + partida.mostraVidas());
                System.out.println("--  Letras usadas: " + partida.letrasUsadas());
                System.out.println("--  PALAVRA: " + partida.palavraRevelada());
                System.out.print("--  Digite uma letra> ");
                Character letra = lerLetraMinuscula();
                while(partida.seLetraJaUsada(letra)){
                    System.out.println("--  * Letra já usada!");
                    System.out.print("--  Digite uma letra> ");
                    letra = lerLetraMinuscula();
                }
                Boolean acertou = partida.tentarLetra(letra);
                if(acertou) {
                    System.out.println("ACERTOU!");
                    if (partida.seGanhou()) {
                        System.out.println("\n-------------------------------------------------------");
                        System.out.println("---------------------  VITÓRIA!! ----------------------");
                        System.out.println("-------------------------------------------------------");
                        System.out.println("--  Palavra: " + partida.palavraCorreta());
                        System.out.println("--  Erros: " + partida.getTentativasErradas());
                    }
                }else {
                    System.out.println("ERROU");
                    if (partida.sePerdeu()) {
                        System.out.println("\n-------------------------------------------------------");
                        System.out.println("--------------------  FRACASSO... ---------------------");
                        System.out.println("-------------------------------------------------------");
                        System.out.println("--  Palavra: " + partida.palavraCorreta());
                        System.out.println("--  Erros: " + partida.getTentativasErradas());
                    }
                }
            }

        }

        //Fim do programa:
        System.out.println("\n---------------------------------------------");
        System.out.println("--------------  JOGO FECHADO  ---------------");
        System.out.println("---------------------------------------------");
        System.out.println("--  Total de partidas: " + Partida.qtdPartidas);
        System.out.println("--  Vitórias: " + Partida.partidasGanhas);
        System.out.println("--  Fracassos: " + Partida.partidasPerdidas);

    }
}
