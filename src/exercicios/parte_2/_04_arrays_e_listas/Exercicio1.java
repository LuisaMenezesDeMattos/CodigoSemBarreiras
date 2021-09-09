package exercicios.parte_2._04_arrays_e_listas;

import java.util.ArrayList;

/**
 * Parte: 2
 * Lista: 2
 * Exercício: 1
 * ENUNCIADO:
 *      "Escreva um algoritmo que leia números, insira em um array, e após mostre os números informados na tela."
 */

public class Exercicio1 extends BaseArrays {
    public static void main(String[] args) {
        do{

            escreverTitulo("Leitor de lista de números");
            ArrayList<Integer> lista = lerListaInteger();
            escreverLinha("Você escreveu:");
            escreverLinha(lista.toString());

        }while(repetir());
    }
}
