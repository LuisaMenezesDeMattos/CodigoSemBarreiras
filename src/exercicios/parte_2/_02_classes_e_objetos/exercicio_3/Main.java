package exercicios.parte_2._02_classes_e_objetos.exercicio_3;

public class Main {
    public static void main(String[] args) {

        Elevador elevador = new Elevador(10, 6);
        elevador.escreverElevador();

        for(int i=0; i<11; i++){
            elevador.subir();
        }
        elevador.escreverElevador();

        for(int i=0; i<7; i++){
            elevador.entrar();
        }
        elevador.escreverElevador();

        for(int i=0; i<11; i++){
            elevador.descer();
        }
        elevador.escreverElevador();

        for(int i=0; i<7; i++){
            elevador.sair();
        }
        elevador.escreverElevador();

    }
}
