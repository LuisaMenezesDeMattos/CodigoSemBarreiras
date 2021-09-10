package exercicios.extras.banana;

import exercicios.extras.jogo_da_forca.Partida;

import java.util.Locale;
import java.util.Scanner;

/**
 * Escreva um programa em Java que permita a entrada de uma String S,
 * e então exiba na tela todas as possíveis rotações à esquerda de S.
 * Por exemplo, se o usuário digitar “Banana”, o programa deve exibir:
 * “Banana”
 * “ananaB”
 * “nanaBa”
 * “anaBan”
 * “naBana”
 * “aBanan”
 * “Banana”
 * */

public class Main {

    public static String lerString(){
        System.out.print("> ");
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
    public static String lerPalavra(){
        String leitura = lerString();
        while(leitura == null || leitura.length() < 2){
            System.out.println("* Escreva pelo menos duas letras!");
            leitura = lerString();
        }
        return leitura;
    }

    public static Boolean repetir(){
        System.out.println("\nDeseja rodar novamente?");
        System.out.println("'s' para SIM | 'n' para NÃO");
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
        System.out.println("----------------  ROTAÇÃO DE PALAVRAS  ----------------");
        System.out.println("-------------------------------------------------------");

        //Programa:
        do{
            System.out.println("\nDigite uma palavra a ser rotacionada:");
            String S = lerPalavra();
            System.out.println("\nRotações:");
            for(int i=0; i<S.length(); i++){
                System.out.println(S.substring(i) + S.substring(0, i));
            }
        }while(repetir());

        //Fim do programa:
        System.out.println("\n---------------------------------------------");
        System.out.println("-----------  PROGRAMA FINALIZADO  -----------");
        System.out.println("---------------------------------------------");

    }

}
