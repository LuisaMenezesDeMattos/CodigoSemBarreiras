package Exercicios.Parte1.Lista2;

/**
 * Parte: 1
 * Lista: 2
 * Exercício: 6
 * ENUNCIADO:
 *      "Faça a implementação do Jogo Pedra, Papel e Tesoura (Jokempô).
 *      O algoritmo deverá perguntar qual é a escolha do jogador 1 (Pedra [pe], Papel [pa], Tesoura [t]),
 *      e deverá fazer o mesmo para o jogador 2.
 *      No final da execução o algoritmo deverá dizer qual é o jogador vencedor ou se houve empate."
 */

public class Exercicio6 extends Exercicios.Base {

    private enum Opcao{Pedra, Papel, Tesoura}

    private static Opcao traduzOpcao(String codigo){
        switch(codigo){
            case "pe":
                return Opcao.Pedra;
            case "pa":
                return Opcao.Papel;
            case "ts":
                return Opcao.Tesoura;
        }
        return null;
    }

    private static Opcao lerOpcao(String nomeJogador){
        escreverLinha("\n" + nomeJogador + ", digite uma das opções:");
        escreverLinha("'pe' = pedra | 'pa' = papel | 'ts' = tesoura");
        String opcao = lerString().toLowerCase();
        Opcao retorno = traduzOpcao(opcao);
        while(retorno == null){
            escreverMsgAtencao("Digite uma das opções dadas");
            opcao = lerString().toLowerCase();
            retorno = traduzOpcao(opcao);
        }
        return retorno;
    }

    public static void main(String[] args) {
        do{

            escreverTitulo("JOKEMPÔ");
            Opcao a = lerOpcao("Jogador A");
            Opcao b = lerOpcao("Jogador B");
            escreverLinha("\nRESULTADO:");
            if(a == b)
                escreverLinha("Empate!");
            else if(a == Opcao.Pedra){
                if(b == Opcao.Tesoura)
                    escreverLinha("Pedra > Tesoura, Jogador A ganhou!");
                else
                    escreverLinha("Pedra < Papel, Jogador B ganhou!");
            }
            else if(a == Opcao.Papel){
                if(b == Opcao.Pedra)
                    escreverLinha("Papel > Pedra, Jogador A ganhou!");
                else
                    escreverLinha("Papel < Tesoura, Jogador B ganhou!");
            }
            else{
                if(b == Opcao.Papel)
                    escreverLinha("Tesoura > Papel, Jogador A ganhou!");
                else
                    escreverLinha("Tesoura < Pedra, Jogador B ganhou!");
            }

        }while(repetir());
    }
}
