package Exercicios;

import java.util.Scanner;

/**
 * Parte: X
 * Lista: X
 * Exercício: X
 * ENUNCIADO:
 *      ""
 */

public class Base {

    public static String lerString(){
        System.out.print("> ");
        return new Scanner(System.in).nextLine();
    }
    public static int lerInt(){
        Integer leitura = null;
        while(leitura == null){
            try{
                leitura = Integer.parseInt(lerString());
            }catch(NumberFormatException e){
                escreverMsgAtencao("Digite um número inteiro");
            }
        }
        return leitura;
    }
    public static int lerIntPositivo(boolean seZeroIncluso){
        int leitura = lerInt();
        if(seZeroIncluso){
            while(leitura < 0){
                escreverMsgAtencao("Digite um número positivo ou zero");
                leitura = lerInt();
            }
        }
        else{
            while(leitura <= 0){
                escreverMsgAtencao("Digite um número positivo");
                leitura = lerInt();
            }
        }
        return leitura;
    }
    public static double lerDouble(){
        Double leitura = null;
        while(leitura == null){
            try{
                leitura = Double.parseDouble(lerString());
            }catch(NumberFormatException e){
                escreverMsgAtencao("Digite um número inteiro");
            }
        }
        return leitura;
    }

    public static void escreverMsgAtencao(String texto){
        System.out.println("* " + texto + "!");
    }
    public static void escreverMsgErro(String texto){
        System.out.println("ERRO: " + texto);
    }
    public static void escreverTitulo(String texto){
        System.out.println("\n--- " + texto.toUpperCase() + " ---");
    }
    public static void escreverLinha(String texto){
        System.out.println(texto);
    }

    public static boolean repetir(){
        escreverLinha("\nDeseja repetir o código? Enter para sim, 0 para não");
        String opcao = lerString();
        if(opcao.isBlank() || opcao.isEmpty()){
            return true;
        }
        escreverTitulo("Programa finalizado");
       return false;
    }

}
