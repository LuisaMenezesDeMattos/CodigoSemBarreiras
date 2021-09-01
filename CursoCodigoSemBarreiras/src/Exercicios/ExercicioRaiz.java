package Exercicios;
import java.util.Scanner;

/**
 * Parte X
 * Lista X
 * Exercício X
 * ---
 * ENUNCIADO: ""
 * */

public class ExercicioRaiz {

    public static String lerString(){
        try{
            System.out.print("> ");
            return new Scanner(System.in).nextLine();
        }catch(Exception e){
            escreverMsgErro(e.getMessage());
            return null;
        }
    }
    public static char lerChar(){
        try{
            System.out.print("> ");
            return new Scanner(System.in).nextLine().charAt(0);
        }catch(Exception e){
            escreverMsgErro(e.getMessage());
            return ' ';
        }
    }
    public static Integer lerInteger(){
        try{
            System.out.print("> ");
            return new Scanner(System.in).nextInt();
        }catch(Exception e){
            escreverMsgErro(e.getMessage());
            return null;
        }
    }
    public static Double lerDouble(){
        try{
            System.out.print("> ");
            return new Scanner(System.in).nextDouble();
        }catch(Exception e){
            escreverMsgErro(e.getMessage());
            return null;
        }
    }

    public static void escreverTitulo(String texto){
        System.out.println("--- " + texto.toUpperCase() + " ---");
    }
    public static void escreverMsgErro(String texto){
        System.out.println("* " + texto + "!");
    }
    public static void escreverLinha(String texto){
        System.out.println(texto);
    }

    public static Boolean repetir(){
        escreverLinha("\nDeseja rodar o programa novamente? [s] ou [n]");
        char opcao = lerChar();
        return true;
    }


}
