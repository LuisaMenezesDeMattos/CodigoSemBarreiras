package exercicios.parte_1._02_logica_e_variaveis;

/**
 * Parte: 1
 * Lista: 02 - Lógica e variáveis
 * Exercício: 1
 * ENUNCIADO:
 *      "Escreva um algoritmo que armazene o valor 99 em uma variável Y e o valor 11 em uma variável Z.
 *      A seguir (utilizando apenas atribuições entre variáveis) troque os seus conteúdos fazendo com que o valor que está em Y passe para Z e vice-versa.
 *      Ao final, escrever os valores que ficaram armazenados nas variáveis."
 */

public class Exercicio1 extends exercicios.Base {

    public static void main(String[] args) {
        do{

            escreverTitulo("Programa que troca valores entre variáveis");
            int y = 99;
            int z = 11;
            escreverLinha("Situação inicial:");
            escreverLinha("y = " + y);
            escreverLinha("z = " + z);
            int aux = y;
            y = z;
            z = aux;
            escreverLinha("Situação pós-troca:");
            escreverLinha("y = " + y);
            escreverLinha("z = " + z);

        }while(repetir());
    }

}
