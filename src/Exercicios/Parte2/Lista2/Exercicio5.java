package Exercicios.Parte2.Lista2;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;

/**
 * Parte: 2
 * Lista: 2
 * Exercício: 5
 * ENUNCIADO:
 *      "Escreva um algoritmo que simula um jogo da forca simples.
 *      O usuário precisará adivinhar uma palavra chutando cada letra em no máximo 10 chutes;
 *      caso ele acerte a letra o jogo dirá que ele acertou,
 *      e caso erre, o número de tentativas vai diminuindo.
 *      Caso o número de tentativas chegue a 0, o usuário perde."
 */

public class Exercicio5 extends BaseArrays {

    private static String geraPalavra(){
        String[] listaPalavras = {
                "Amarelo", "Amiga", "Amor", "Ave", "Avião", "Avó", "Balão", "Bebê", "Bolo", "Branco", "Cama", "Caneca",
                "Celular", "Clube", "Copo", "Doce", "Elefante", "Escola", "Estojo", "Faca", "Foto", "Garfo", "Geleia",
                "Girafa", "Janela", "Limonada", "Mãe", "Meia", "Noite", "Óculos", "ônibus", "Ovo", "Pai", "Pão", "Parque",
                "Passarinho", "Peixe", "Pijama", "Rato", "Umbigo"
        };
        Random random = new Random();
        return listaPalavras[random.nextInt(listaPalavras.length)].toLowerCase();
    }

    private static String formatarPalavra(char[] palavra, ArrayList<Integer> posicoesAchadas){
        String retorno = "";
        for(int i=0; i<palavra.length; i++){
            boolean achouPosicao = false;
            for(int posicao : posicoesAchadas){
                if(posicao == i) {
                    retorno += palavra[i];
                    achouPosicao = true;
                    break;
                }
            }
            if(!achouPosicao){
                retorno += "_";
            }
        }
        return retorno;
    }

    private static char[] palavraSemAcentos(char[] palavra){
        char[] retorno = new char[palavra.length];
        for(int i=0; i<retorno.length; i++){
            char l = palavra[i];
            if(l == 'á' || l == 'à' || l == 'ã' || l == 'â'){
                retorno[i] = 'a';
            }
            else if(l == 'é' || l == 'ê'){
                retorno[i] = 'e';
            }
            else if(l == 'í'){
                retorno[i] = 'i';
            }
            else if(l == 'ó' || l == 'ô' || l == 'õ'){
                retorno[i] = 'o';
            }
            else if(l == 'ú'){
                retorno[i] = 'u';
            }
            else if(l == 'ç'){
                retorno[i] = 'c';
            }
            else{
                retorno[i] = palavra[i];
            }
        }
        return retorno;
    }

    private static boolean letraJaUsada(char letra, ArrayList<Character> letrasUsadas){
        for(char letraAchada: letrasUsadas){
            if(letraAchada == letra)
                return true;
        }
        return false;
    }

    private static Character lerCharUnico(ArrayList<Character> letrasUsadas){
        boolean charUnico = false;
        Character letra = lerChar();
        while(letraJaUsada(letra, letrasUsadas)){
            escreverMsgAtencao("Escreva uma letra nova");
            letra = lerChar();
        }
        return letra;
    }

    public static void main(String[] args) {

        do{

            escreverTitulo("Jogo da Forca");

            String palavraString = geraPalavra();
            char[] palavra = palavraString.toCharArray();
            char[] palavraSemAcentos = palavraSemAcentos(palavra);
            ArrayList<Integer> posicoesAchadas = new ArrayList<>();
            ArrayList<Character> letrasUsadas = new ArrayList<>();

            int qtdErros = 0;
            boolean ganhou = false;

            while(qtdErros < 10 && !ganhou){

                //Ler a tentativa:
                escreverLinha("\nPALAVRA: " + formatarPalavra(palavra, posicoesAchadas));
                escreverLinha("ERROS: " + qtdErros + "/10");
                escreverLinha("Faça seu chute:");
                Character letra = lerCharUnico(letrasUsadas);
                letra = Character.toLowerCase(letra);
                letrasUsadas.add(letra);

                //Verificar se há (e se sim, quais) posições da palavra com essa letra:
                boolean achouLetra = false;
                for(int i=0; i<palavra.length; i++){
                    if(palavraSemAcentos[i] == letra) {
                        posicoesAchadas.add(i);
                        achouLetra = true;
                    }
                }

                //Incrementar o número de erros caso necessário:
                if(!achouLetra){
                    qtdErros++;
                }

                //Mostrar se ganhou
                if(posicoesAchadas.size() == palavra.length){
                    escreverLinha("\nVOCÊ GANHOU!!!");
                    escreverLinha("Palavra: " + palavraString);
                    escreverLinha("Número de chutes errados: " + qtdErros);
                    ganhou = true;
                }
            }

            if(!ganhou){
                escreverLinha("\nVocê morreu... :(");
                escreverLinha("A palavra era: " + palavraString);
            }

        }while(repetir());

    }
}
