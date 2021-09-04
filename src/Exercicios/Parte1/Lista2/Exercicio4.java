package Exercicios.Parte1.Lista2;

/**
 * Parte: 1
 * Lista: 2
 * Exercício: 4
 * ENUNCIADO:
 *      "Construa um algoritmo que leia 10 valores inteiros e positivos e:
 *          - Encontre o maior valor
 *          - Encontre o menor valor
 *          - Calcule a média dos números lidos"
 */

public class Exercicio4 extends Exercicios.Base {
    public static void main(String[] args) {
        do{

            escreverTitulo("Programa que lê 10 valores e diz o maior, o menor, e a média entre eles");
            escreverLinha("Informe o valor #1");
            int valor = lerIntPositivo(false);
            int maior = valor;
            int menor = valor;
            double media = valor;
            int cont = 2;
            do{
                escreverLinha("Informe o valor #" + cont);
                valor = lerIntPositivo(false);
                if(valor > maior)
                    maior = valor;
                else if(valor < menor)
                    menor = valor;
                media += valor;
                cont++;
            }while(cont <= 10);
            media = media / 10;
            escreverLinha("RESULTADO:");
            escreverLinha("Maior: " + maior);
            escreverLinha("Menor: " + menor);
            escreverLinha("Média: " + media);

        }while(repetir());
    }
}
