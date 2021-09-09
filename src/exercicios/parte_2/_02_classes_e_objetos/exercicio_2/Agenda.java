package exercicios.parte_2._02_classes_e_objetos.exercicio_2;

import exercicios.parte_2._02_classes_e_objetos.exercicio_1.Pessoa;

public class Agenda {

    /** Atributos */
    private Pessoa[] pessoas = new Pessoa[10];

    /** Construtor */
    public Agenda(){
    }


    /** Métodos gerais */

    // Armazena uma nova pessoa
    public void armazenaPessoa(String nome, int anoNascimento, float altura){
        int i = 0;
        while(i < 10){
            if(pessoas[i] == null){
                pessoas[i] = new Pessoa(nome, anoNascimento, altura);
                break;
            }
            i++;
        }
        if(i == 10){
            System.out.println("Limite máximo cadastrado!");
        }
    }

    // Remove uma pessoa
    public void removePessoa(String nome){
        int indexPessoa = buscaPessoa(nome);
        if(indexPessoa == -1){
            System.out.println("Pessoa não encontrada!");
        }else{
            pessoas[indexPessoa] = null;
            System.out.println(nome + " removido(a) com sucesso!");
        }
    }

    // Informa em que posição da agenda está a pessoa
    public int buscaPessoa(String nome){
        for(int i=0; i<10; i++){
            if(pessoas[i] != null && pessoas[i].getNome().equals(nome)){
                return i;
            }
        }
        return -1;
    }

    // Imprime os dados de todas as pessoas da agenda
    public void imprimeAgenda(){
        System.out.println("\nAGENDA COMPLETA:");
        int qtdContatosVazios = 0;
        for(int i=0; i<10; i++){
            if(pessoas[i] == null){
                qtdContatosVazios++;
            }else{
                System.out.println(pessoas[i].toString());
            }
        }
        if(qtdContatosVazios == 10){
            System.out.println("Não há pessoas cadastradas na agenda");
        }
    }

    // Imprime os dados da pessoa que está na posição “i” da agenda.
    public void imprimePessoa(int index){
        if(pessoas[index] == null){
            System.out.println("Não há pessoa nessa posição da agenda.");
        }else{
            System.out.println(pessoas[index].toString());
        }
    }

}
