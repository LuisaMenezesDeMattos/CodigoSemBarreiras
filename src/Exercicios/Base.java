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
        try{
            return new Scanner(System.in).nextLine();
        }catch(Exception e){
            escreverMsgErro(e.getMessage());
            return null;
        }
    }
    public static Integer lerInteger(){
        try{
            return new Scanner(System.in).nextInt();
        }catch(Exception e){
            escreverMsgErro(e.getMessage());
            return null;
        }
    }
    public static Double lerDouble(){
        try{
            return new Scanner(System.in).nextDouble();
        }catch(Exception e){
            escreverMsgErro(e.getMessage());
            return null;
        }
    }

    public static void escreverMsgAtencao(String texto){
        System.out.println("* " + texto + "!");
    }
    public static void escreverMsgErro(String texto){
        System.out.println("ERRO: " + texto);
    }
    public static void escreverTitulo(String texto){
        System.out.println("--- " + texto.toUpperCase() + " ---");
    }
    public static void escreverLinha(String texto){
        System.out.println(texto);
    }

    public static Boolean repetir(){
        escreverLinha("\nDeseja repetir o código? Enter para sim, 0 para não");
        String opcao = lerString();
        if(opcao.equals("")){
            return true;
        }
       return false;
    }

}
