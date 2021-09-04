package AllBeneficios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    /** Escreve um valor em reais */
    static String escreverEmReais(double valor){
        return new DecimalFormat("'R$'.00").format(valor);
    }

    /** Lê um valor em reais */
    static double lerDinheiro(String identacao){
        double dinheiro = -1;
        boolean entradaInvalida = true;
        do{
            try{
                System.out.print(identacao + "> R$ ");
                dinheiro = new Scanner(System.in).nextDouble();
                entradaInvalida = false;
            }catch (Exception e){
                System.out.println(identacao + "ERRO: Digite um número válido");
                entradaInvalida = true;
            }
            if(!entradaInvalida && dinheiro < 0){
                System.out.println(identacao + "ERRO: Não é possível usar valores negativos");
                entradaInvalida = true;
            }
        }while(entradaInvalida);
        return dinheiro;
    }

    /** Lê a opção do usuário */
    static int lerOpcao(String identacao){
        int opcao = 0;
        boolean entradaInvalida = true;
        do{
            try{
                System.out.print(identacao + "> ");
                opcao = new Scanner(System.in).nextInt();
                entradaInvalida = false;
            }catch (Exception e){
                System.out.println(identacao + "ERRO: Digite um número válido");
                entradaInvalida = true;
            }
        }while(entradaInvalida);
        return opcao;
    }

    /** Recebe um dado saldo e tenta efetuar um pagamento sobre aquele saldo */
    public static double efetuarPagamento(double saldo, String identacao){
        System.out.println(identacao + "Informe o valor do pagamento:");
        double pagamento = lerDinheiro(identacao);
        if(pagamento > saldo){
            System.out.println(identacao + "Saldo indisponível!");
            return saldo;
        }
        saldo = saldo - pagamento;
        System.out.println(identacao + "Pagamento efetuado com sucesso!");
        System.out.println(identacao + "Saldo novo: " + escreverEmReais(saldo));
        return saldo;
    }

    /** PROGRAMA */
    public static void main(String[] args) {

        //Informar os saldos
        System.out.println("\nGERENCIADOR DE CARTÕES ALL BENEFÍCIOS");
        System.out.println("Bem vindo(a)!");
        System.out.println("Antes de iniciar o programa, favor informar os saldos iniciais");
        System.out.println("Saldo do Vale-Alimentação All Benefícios TM:");
        double saldoAlimentacao = lerDinheiro("");
        System.out.println("Saldo do Vale-Refeição All Benefícios TM:");
        double saldoRefeicao = lerDinheiro("");
        System.out.println("Saldo do Vale-Transporte All Benefícios TM:");
        double saldoTransporte = lerDinheiro("");

        //Operações do usuário
        boolean repetir = true;
        System.out.println("\n");
        do {
            System.out.println("-----------------------------------------");
            System.out.println("Escolha a operação que deseja realizar:");
            System.out.println(" | 1 - Visualizar saldos");
            System.out.println(" | 2 - Efetuar um pagamento");
            System.out.println(" | 3 - Fechar o programa");
            int operacao = lerOpcao(" | ");
            while (operacao != 1 && operacao != 2 && operacao != 3) {
                System.out.println(" | ERRO: Digite um número válido");
                operacao = lerOpcao(" | ");
            }
            if (operacao == 1) {
                //Operacao 1: Printar os saldos na tela
                System.out.println(" | VISUALIZAÇÃO DE SALDOS");
                System.out.println(" |  | Saldo de Alimentação: " + escreverEmReais(saldoAlimentacao));
                System.out.println(" |  | Saldo de Refeição: " + escreverEmReais(saldoRefeicao));
                System.out.println(" |  | Saldo de Transporte: " + escreverEmReais(saldoTransporte));
                System.out.println(" | -----------------------------------------");
            }
            else if (operacao == 2){
                //Opcao 2: Efetuar pagamento
                System.out.println(" | PAGAMENTO");
                System.out.println(" | Com qual cartão deseja utilizar?");
                System.out.println(" |  | 1 - Alimentação ");
                System.out.println(" |  | 2 - Refeição ");
                System.out.println(" |  | 3 - Transporte");
                int cartao = lerOpcao(" |  | ");
                while(cartao != 1 && cartao != 2 && cartao != 3){
                    System.out.println(" |  | ERRO: Digite um número válido");
                    cartao = lerOpcao(" |  | ");
                }
                switch (cartao) {
                    case 1:
                        System.out.println(" |  | PAGAMENTO COM VALE-ALIMENTAÇÃO");
                        saldoAlimentacao = efetuarPagamento(saldoAlimentacao, " |  |  | ");
                        break;
                    case 2:
                        System.out.println(" |  | PAGAMENTO COM VALE-REFEIÇÃO");
                        saldoRefeicao = efetuarPagamento(saldoRefeicao, " |  |  | ");
                        break;
                    case 3:
                        System.out.println(" |  | PAGAMENTO COM VALE-TRANSPORTE");
                        saldoTransporte = efetuarPagamento(saldoTransporte, " |  |  | ");
                        break;
                }
                System.out.println(" | -----------------------------------------");
            }
            else{
                //Fechar o programa
                repetir = false;
            }

        }while (repetir) ;

        System.out.println("\nA All Benefícios agradece a preferência");
        System.out.println("--- PROGRAMA FINALIZADO ---");


    }
}


