package exercicios.parte_2._04_arrays_e_listas;

import java.util.ArrayList;

/**
 * Parte: 2
 * Lista: 2
 * Exercício: 2
 * ENUNCIADO:
 *      "Escreva um algoritmo que leia números, insira em um array e após mostre a quantidade de números negativos."
 */

public class Exercicio2 extends BaseArrays{
    public static void main(String[] args) {
        do {

            escreverTitulo("Filtro de números negativos");
            ArrayList<Integer> lista = lerListaInteger();
            ArrayList<Integer> listaNegativos = new ArrayList<>();
            for(int valor : lista){
                if(valor < 0)
                    listaNegativos.add(valor);
            }
            escreverLinha("Os números negativos são:");
            escreverLinha(listaNegativos.toString());
            escreverLinha("Com uma quantidade total de " + listaNegativos.size());

        }while(repetir());
    }
}
