package exercicios.parte_2._02_classes_e_objetos.exercicio_4;

public class Televisao {

    /** Atributos */
    private Integer volume;
    private Integer canal;
    private final Integer totalCanais;

    /** Construtor */
    public Televisao(Integer totalCanais) {
        this.totalCanais = totalCanais;
        this.volume = 0;
        this.canal = 0;
    }

    /** Getters & Setters */
    public boolean setVolume(int _volume) {
        if(_volume < 0 || _volume > 100){
            return false;
        }
        this.volume = _volume;
        return true;
    }
    public boolean setCanal(int _canal) {
        if(_canal < 0 || _canal > totalCanais){
            return false;
        }
        this.canal = _canal;
        return true;
    }

    /** Métodos Gerais */
    public void escreveCanalAtual(){
        System.out.println("Canal: " + canal);
    }
    public void escreveVolumeAtual(){
        System.out.println("Volume: " + volume);
    }


}
