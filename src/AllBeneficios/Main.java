/**
 * Fazer um programa java para controlar os gastos dos meus cartões de benefícios.
 *
 * Temos 3 categorias de benefícios: Alimentação, refeição e transporte.
 *
 * Ao iniciar o programa, devemos perguntar qual o valor inicial de cada categoria.
 *
 * Após informar os valores iniciais, o usuário poderá começar a realizar suas transações.
 *
 * Cada transação deverá decrementar o valor do saldo de cada categoria.
 *
 * O usuário poderá fazer várias transações.
 * */

package AllBeneficios;

import java.util.Scanner;

public class Main {

    /** Lê um valor em reais */
    static double lerDinheiro(String identacao){
        double dinheiro = -1;
        boolean entradaInvalida = true;
        do{
            try{
                System.out.print(identacao + "> ");
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
        System.out.println(identacao + "Saldo novo: R$" + saldo);
        return saldo;
    }

    /** PROGRAMA */
    public static void main(String[] args) {

        //Informar os saldos
        System.out.println("\nBEM-VINDO(A)");
        System.out.println("Antes de iniciar o programa, favor informar os saldos iniciais");
        System.out.println("Saldo do cartão de alimentação:");
        double saldoAlimentacao = lerDinheiro("");
        System.out.println("Saldo do cartão de refeição:");
        double saldoRefeicao = lerDinheiro("");
        System.out.println("Saldo do cartão de transporte:");
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
                System.out.println(" |");
                System.out.println(" | VISUALIZAÇÃO DE SALDOS");
                System.out.println(" |  | Saldo de Alimentação: R$" + saldoAlimentacao);
                System.out.println(" |  | Saldo de Refeição: R$" + saldoRefeicao);
                System.out.println(" |  | Saldo de Transporte: R$" + saldoTransporte);
                System.out.println(" | -----------------------------------------");
            }
            else if (operacao == 2){
                //Opcao 2: Efetuar pagamento
                System.out.println(" |");
                System.out.println(" | PAGAMENTO");
                System.out.println(" | Com qual cartão deseja efetuar o pagamento?");
                System.out.println(" |  | 1 - Alimentação ");
                System.out.println(" |  | 2 - Refeição ");
                System.out.println(" |  | 3 - Transporte");
                int cartao = lerOpcao(" |  | ");
                while(cartao != 1 && cartao != 2 && cartao != 3){
                    System.out.println(" |  | Escolha uma das opções dadas!");
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

        System.out.println("--- PROGRAMA FINALIZADO ---");

    }
}


