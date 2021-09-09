* Parte: 2
* Lista: 05 - Encapsulamento
* Exercício: único
* ENUNCIADO:
     * Escreva uma classe que represente um país. Um país é representado através dos atributos: 
       * código ISO (ex.: 3166-1 [BRA]), 
       * nome (ex.: Brasil), 
       * população (ex.: 193.946.886) 
       * e a sua dimensão em Km2 (ex.: 8.515.767,049). 
     * Além disso, cada país mantém uma lista de outros países com os quais ele faz fronteira.
     * A classe deve ter:
       * Construtor que inicialize o código ISO, o nome e a dimensão do país; 
       * Um método que permita verificar se dois objetos representam o mesmo país (igualdade semântica). Dois países são iguais se tiverem o mesmo código ISO; 
       * Um método que retorne a densidade populacional do país; 
       * Um método que receba um outro país como parâmetro e retorne a lista de vizinhos comuns aos dois países. Considere que um país tem no máximo 40 outros países com os quais ele faz fronteira.
