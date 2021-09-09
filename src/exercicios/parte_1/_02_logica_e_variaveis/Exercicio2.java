package exercicios.parte_1._02_logica_e_variaveis;

/**
 * Parte: 1
 * Lista: 1
 * Exercício: 02 - Lógica e variáveis
 * ENUNCIADO:
 *      "Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor."
 */


public class Exercicio2 extends exercicios.Base {

    public static void main(String[] args) {
        do{

            escreverTitulo("Programa que calcula o antecessor de um número");
            escreverLinha("Informe o número inteiro desejado:");
            int numero = lerInt();
            escreverLinha("O antecessor de " + numero + " é " + (numero-1));

        }while(repetir());
    }

}
