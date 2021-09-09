package exercicios.parte_2._02_classes_e_objetos.exercicio_4;

public class ControleRemoto {

    public static void aumentaVolume(int aumento, Televisao tv){
        boolean aumentou = tv.setVolume(aumento);
        if(aumentou){

        }
    }
    public static void diminuiVolume(int diminuicao, Televisao tv){
        boolean diminuiu = tv.setVolume(-diminuicao);
    }

}
