package exercicios.parte_2._04_arrays_e_listas;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Parte: 2
 * Lista: 2
 * Exercício: 4
 * ENUNCIADO:
 *      "Escreva um algoritmo que leia números, insira em um array e após mostre o maior valor."
 */

public class Exercicio4 extends BaseArrays{
    public static void main(String[] args) {
        do {

            escreverTitulo("Algoritmo que encontra o maior valor de uma lista");
            ArrayList<Integer> lista = lerListaInteger();
            lista.sort(Collections.reverseOrder());
            escreverLinha(lista.toString());
            escreverLinha("O maior número da lista é: " + lista.get(0));

        }while(repetir());

    }
}
