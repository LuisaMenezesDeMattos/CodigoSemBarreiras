package exercicios.parte_1._03_estruturas_de_controle;

/**
 * Parte: 1
 * Lista: 03 - Estruturas de Controle
 * Exercício: 3
 * ENUNCIADO:
 *      "Escreva um algoritmo em Java que leia dois números inteiros e determine qual é o menor.
 *      Escreva um algoritmo que determina o maior também."
 */

public class Exercicio3 extends exercicios.Base {
    public static void main(String[] args) {
        do{
            escreverTitulo("Programa que recebe dois números e diz qual é maior e menor");
            escreverLinha("Informe o primeiro número");
            int a = lerInt();
            escreverLinha("Informe o segundo número");
            int b = lerInt();
            if(a < b){
                escreverLinha(a + " < " + b);
            }else{
                escreverLinha(b + " < " + a);
            }
        }while(repetir());
    }
}
