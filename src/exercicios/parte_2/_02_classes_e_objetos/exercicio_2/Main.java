package exercicios.parte_2._02_classes_e_objetos.exercicio_2;

public class Main {
    public static void main(String[] args) {

        Agenda agenda = new Agenda();
        agenda.imprimeAgenda();

        System.out.println("\n------------------------------------\n");

        agenda.armazenaPessoa("Maria", 1980, 1.56f);
        agenda.armazenaPessoa("João", 1999, 1.90f);
        agenda.armazenaPessoa("Felipe", 2002, 1.85f);
        agenda.armazenaPessoa("Ana", 1987, 1.76f);
        agenda.imprimeAgenda();

        System.out.println("\n------------------------------------\n");

        System.out.println("Posição de Maria: " + agenda.buscaPessoa("Maria"));
        System.out.println("Posição de Ana: " + agenda.buscaPessoa("Ana"));
        System.out.println("Posição de Marcos: " + agenda.buscaPessoa("Marcos"));

        System.out.println("\n------------------------------------\n");

        System.out.println("Pessoa na posição #1: ");
        agenda.imprimePessoa(0);
        System.out.println("Pessoa na posição #4: ");
        agenda.imprimePessoa(3);
        System.out.println("Pessoa na posição #9: ");
        agenda.imprimePessoa(8);

        System.out.println("\n------------------------------------\n");
        agenda.removePessoa("Maria");
        System.out.println("Pessoa na posição #1: ");
        agenda.imprimePessoa(0);
        agenda.imprimeAgenda();

    }
}
