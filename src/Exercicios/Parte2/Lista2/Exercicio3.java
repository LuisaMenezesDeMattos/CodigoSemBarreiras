package Exercicios.Parte2.Lista2;

import java.util.ArrayList;

/**
 * Parte: 2
 * Lista: 2
 * Exercício: 3
 * ENUNCIADO:
 *      "Escreva um algoritmo que leia números, insira em um array e após mostre a quantidade de números pares."
 */

public class Exercicio3 extends BaseArrays{
    public static void main(String[] args) {
        do{

            escreverTitulo("Filtro de números pares");
            ArrayList<Integer> lista = lerListaInteger();
            ArrayList<Integer> listaPares = new ArrayList<>();
            for(int valor : lista){
                if((valor % 2) == 0)
                    listaPares.add(valor);
            }
            escreverLinha("Os números pares são:");
            escreverLinha(listaPares.toString());
            escreverLinha("Com uma quantidade total de " + listaPares.size());

        }while(repetir());
    }
}
