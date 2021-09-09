package exercicios.parte_1._03_estruturas_de_controle;

/**
 * Parte: 1
 * Lista: 03 - Estruturas de Controle
 * Exercício: 5
 * ENUNCIADO:
 *      "Escreva um algoritmo em Java que seja capaz de fazer as seguintes operações matemáticas
 *       - Adição
 *       - Subtração
 *       - Multiplicação
 *       - Divisão
 *      Todas as operações serão entre dois valores.
 *      No começo do algoritmo pergunte ao usuário qual operação ele deseja fazer e quais são os valores."
 */

public class Exercicio5 extends exercicios.Base {

    private static Double calculadora(double a, double b, char operacao){
        switch (operacao){
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
        }
        return null;
    }

    public static void main(String[] args) {
        do{

            escreverTitulo("Calculadora");
            escreverLinha("Escolha uma operação para fazer:");
            escreverLinha(" + para adição (a + b)");
            escreverLinha(" - para subtração (a - b)");
            escreverLinha(" * para multiplicação (a * b)");
            escreverLinha(" / para divisão (a / b)");
            char operacao = lerChar();
            while(operacao != '+' && operacao != '-' && operacao != '*' && operacao != '/'){
                escreverMsgAtencao("Escolha uma das opções dadas");
                operacao = lerChar();
            }
            escreverLinha("Para calcular a " + operacao + " b, informe:");
            escreverLinha("O valor de a:");
            double a = lerDouble();
            escreverLinha("O valor de b:");
            double b = lerDouble();
            escreverLinha("\nRESULTADO:");
            escreverLinha("a " + operacao + " b = " + a + " " + operacao + " " + b + " = " + calculadora(a, b, operacao));

        }while(repetir());
    }
}
