package exercicios.parte_2._02_classes_e_objetos.exercicio_1;

public class Main {

    public static void main(String[] args) {

        Pessoa ana = new Pessoa("Ana");
        System.out.println(ana.toString());
        System.out.println("Idade esse ano: " + ana.idadeEsseAno());
        System.out.println("\n");

        Pessoa maria = new Pessoa("Maria", 1987, 1.75f);
        System.out.println(maria.toString());
        System.out.println("Idade esse ano: " + maria.idadeEsseAno());
        System.out.println("\n");

        Pessoa joao = new Pessoa("João", 2000, 1.95765f);
        System.out.println(joao.toString());
        System.out.println("Idade esse ano: " + joao.idadeEsseAno());
        System.out.println("\n");

        Pessoa fulano = new Pessoa();
        System.out.println(fulano.toString());
        System.out.println("Idade esse ano: " + fulano.idadeEsseAno());
        System.out.println("\n");



    }

}
