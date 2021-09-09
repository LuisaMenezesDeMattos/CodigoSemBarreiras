package exercicios.parte_1._03_estruturas_de_controle;

/**
 * Parte: 1
 * Lista: 03 - Estruturas de Controle
 * Exercício: 2
 * ENUNCIADO:
 *      "Elabore um algoritmo que dada a idade de um nadador classifique-o em uma das seguintes categorias:
 *          Infantil A = 5 a 7 anos
 *          Infantil B = 8 a 11 anos
 *          Juvenil A = 12 a 13 anos
 *          Juvenil B = 14 a 17 anos
 *          Adultos = Maiores de 18 anos"
 */

public class Exercicio2 extends exercicios.Base {
    public static void main(String[] args) {
        do{
            escreverTitulo("Calculadora de categorias de nadador");
            escreverLinha("Qual a idade do nadador?");
            int idade = lerIntPositivo(true);
            if(idade <= 4){
                escreverLinha("Jovem demais para ser nadador");
            }else if(idade <= 7){
                escreverLinha("Categoria Infantil A");
            }else if(idade <= 11){
                escreverLinha("Categoria Infantil B");
            }else if(idade <= 13){
                escreverLinha("Categoria Juvenil A");
            }else if(idade <= 17){
                escreverLinha("Categoria Juvenil B");
            }else{
                escreverLinha("Categoria Adulto");
            }
        }while(repetir());
    }
}
