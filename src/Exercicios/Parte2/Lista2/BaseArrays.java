package Exercicios.Parte2.Lista2;

import java.util.ArrayList;

public class BaseArrays extends Exercicios.Base{

    public static ArrayList<Integer> lerListaInteger(){

        //Explicação:
        escreverLinha("\nLEITURA DE LISTA DE VALORES INTEIROS:");
        escreverLinha("* Digite um valor de cada vez");
        escreverLinha("* Digite 'p' para parar de ler a lista\n");

        //Declaração de variáveis:
        ArrayList<Integer> lista = new ArrayList<>();
        int cont = 1;
        boolean parar = false;
        String leitura;

        //Leitura:
        while(!parar){
            escreverLinha("Digite o valor #" + cont++);
            leitura = lerString();
            if(leitura.charAt(0) == 'p'){
                parar = true;
            }
            else{
                try{
                    lista.add(Integer.parseInt(leitura));
                }catch(Exception e){
                    escreverMsgAtencao("Digite um número inteiro, ou 'p' para parar\n");
                    cont--;
                }
            }
        }
        System.out.println();

        //Retorno:
        return lista;
    }

}
