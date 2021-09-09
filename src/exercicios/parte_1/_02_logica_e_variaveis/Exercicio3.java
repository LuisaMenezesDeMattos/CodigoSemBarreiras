package exercicios.parte_1._02_logica_e_variaveis;

/**
 * Parte: 1
 * Lista: 02 - Lógica e variáveis
 * Exercício: 3
 * ENUNCIADO:
 *      "Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a área do retângulo."
 */


public class Exercicio3 extends exercicios.Base  {

    public static void main(String[] args) {
        do{

            escreverTitulo("Calculadora da área do retângulo");
            escreverLinha("Informa a base do retângulo:");
            double base = lerDouble();
            escreverLinha("Informe a altura do retângulo:");
            double altura = lerDouble();
            escreverLinha("Área = " + (base * altura));

        }while(repetir());
    }

}
