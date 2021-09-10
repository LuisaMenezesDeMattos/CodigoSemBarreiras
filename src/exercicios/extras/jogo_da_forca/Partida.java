package exercicios.extras.jogo_da_forca;

import java.util.ArrayList;

public class Partida {

    /** Atributos */
    private Palavra palavra = new Palavra();
    private Integer tentativasErradas = 0;
    private Boolean finalizada = false;
    private ArrayList<Character> letrasUsadas = new ArrayList<>();
    public static Integer qtdPartidas = 0;
    public static Integer partidasGanhas = 0;
    public static Integer partidasPerdidas = 0;
    private static final Integer errosPermitidos = 9;

    /** Construtor */
    public Partida(){
        qtdPartidas++;
    }

    /** Getters & Setters */
    public Boolean isFinalizada(){
        return this.finalizada;
    }
    public Integer getTentativasErradas(){
        return this.tentativasErradas;
    }

    /** Métodos públicos */
    public Boolean sePerdeu(){
        if(this.tentativasErradas > errosPermitidos){
            this.finalizada = true;
            partidasPerdidas++;
            return true;
        }
        return false;
    }
    public Boolean seGanhou(){
        if(palavra.sePalavraCompletamenteRevelada()){
            this.finalizada = true;
            partidasGanhas++;
            return true;
        }
        return false;
    }
    public Boolean seLetraJaUsada(Character letra){
        for(var l : letrasUsadas){
            if(l.equals(letra)){
                return true;
            }
        }
        return false;
    }
    public Boolean tentarLetra(Character letra){
        letrasUsadas.add(letra);
        Boolean achouLetra = palavra.checarLetra(letra);
        if(!achouLetra){
            tentativasErradas++;
        }
        return achouLetra;
    }
    public String mostraVidas(){
        return (errosPermitidos - tentativasErradas + 1) + "";
    }
    public String letrasUsadas(){
        if(letrasUsadas.size() == 0){
            return "nenhuma ainda";
        }
        String retorno = "";
        for(Character l : letrasUsadas){
            retorno += l + " ";
        }
        return retorno;
    }
    public String palavraRevelada(){
        ArrayList<Character> palavraRevelada = palavra.getPalavraRevelada();
        String retorno = "";
        for(Character l : palavraRevelada){
            retorno += "[" + l + "] ";
        }
        return retorno;
    }
    public String palavraCorreta(){
        return palavra.getPalavraCorreta();
    }


}
