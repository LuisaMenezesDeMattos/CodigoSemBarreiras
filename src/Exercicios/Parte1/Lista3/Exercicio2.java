package Exercicios.Parte1.Lista3;

/**
 * Parte: 1
 * Lista: 3
 * Exercício: 2
 * ENUNCIADO:
 *      "Construa um algoritmo usando uma estrutura de repetição que calcule o fatorial de um número."
 */

public class Exercicio2 extends Exercicios.Base{
    public static void main(String[] args) {
        do{
            escreverTitulo("Calculadora de fatorial");
            escreverLinha("Informe o valor a ser calculado");
            int valor = lerIntPositivo(true);
            int fatorial = 1;
            for(int i=valor; i>0; i--){
                fatorial = fatorial * i;
            }
            escreverLinha("RESULTADO: " + valor + "! = " + fatorial);
        }while(repetir());
    }
}
