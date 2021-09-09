package exercicios.parte_1._02_logica_e_variaveis;

import java.text.DecimalFormat;

/**
 * Parte: 1
 * Lista: 02 - Lógica e variáveis
 * Exercício: 4
 * ENUNCIADO:
 *      "Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos brancos, nulos e válidos.
 *      Calcular e escrever o percentual que cada um representa em relação ao total de eleitores."
 */


public class Exercicio4 extends exercicios.Base  {

    private static String calculaPorcentagem(int total, int votos){
        double porcentagem = votos * 100.0 / total;
        return new DecimalFormat("00.00'%'").format(porcentagem);
    }

    public static void main(String[] args) {
        do{

            escreverTitulo("Calculadora de votos de um município");
            escreverLinha("Informe o número de eleitores deste município:");
            int eleitores = lerIntPositivo(false);
            int aux = eleitores;
            escreverLinha("Dos " + aux + " possíveis, quantos votos foram brancos?");
            int votosBrancos = lerIntPositivo(true);
            aux -= votosBrancos;
            escreverLinha("Dos " + aux + " restantes, quantos votos foram nulos?");
            int votosNulos = lerIntPositivo(true);
            aux -= votosNulos;
            escreverLinha("Dos " + aux + " restantes, quantos votos foram válidos?");
            int votosValidos = lerIntPositivo(true);
            aux -= votosValidos;
            escreverTitulo("Resultado : " + eleitores + " eleitores");
            escreverLinha("|  Votos Brancos | " + calculaPorcentagem(eleitores, votosBrancos) + " |");
            escreverLinha("|    Votos Nulos | " + calculaPorcentagem(eleitores, votosNulos)  + " |");
            escreverLinha("|  Votos válidos | " + calculaPorcentagem(eleitores, votosValidos)  + " |");
            escreverLinha("| Votos faltando | " + calculaPorcentagem(eleitores, aux)  + " |");

        }while(repetir());
    }

}
