package exercicios.extras.jogo_da_forca;

import java.util.ArrayList;
import java.util.Random;

class Palavra {

    /** Atributos */
    private final ArrayList<Character> correta;
    private final ArrayList<Character> corretaSemAcento;
    private ArrayList<Character> revelada;
    private final int tamanho;

    /** Construtor */
    public Palavra(){
        this.correta = gerarPalavra();
        this.tamanho = this.correta.size();
        this.corretaSemAcento = new ArrayList<>();
        this.revelada = new ArrayList<>();
        for(Character letra : this.correta){
            this.corretaSemAcento.add(tirarAcento(letra));
            this.revelada.add('_');
        }
    }

    /** Getters & Setters */
    public ArrayList<Character> getPalavraRevelada(){
        return this.revelada;
    }
    public String getPalavraCorreta(){
        return converterArrayListEmString(this.correta);
    }

    /** Métodos privados */
    private ArrayList<Character> gerarPalavra(){
        String[] listaPalavras = {
                "Amarelo", "Amiga", "Amor", "Ave", "Avião", "Avó", "Balão", "Bebê", "Bolo", "Branco", "Cama", "Caneca",
                "Celular", "Clube", "Copo", "Doce", "Elefante", "Escola", "Estojo", "Faca", "Foto", "Garfo", "Geleia",
                "Girafa", "Janela", "Limonada", "Mãe", "Meia", "Noite", "Óculos", "ônibus", "Ovo", "Pai", "Pão", "Parque",
                "Passarinho", "Peixe", "Pijama", "Rato", "Umbigo"
        };
        Random random = new Random();
        String palavra = listaPalavras[random.nextInt(listaPalavras.length)].toLowerCase();
        ArrayList<Character> retorno = new ArrayList<>();
        for(int i=0; i<palavra.length(); i++){
            retorno.add(palavra.charAt(i));
        }
        return retorno;
    }
    private Character tirarAcento(Character letra){
        letra = letra.toString().toLowerCase().toCharArray()[0];
        if(letra == 'á' || letra == 'à' || letra == 'ã' || letra == 'â'){
            return 'a';
        } else if(letra == 'é' || letra == 'ê'){
            return 'e';
        } else if(letra == 'í'){
            return 'i';
        } else if(letra == 'ó' || letra == 'õ' || letra == 'ô'){
            return 'o';
        } else if(letra == 'ú' || letra == 'ü'){
            return 'u';
        } else if(letra == 'ç'){
            return 'c';
        }
        return letra;
    }
    private String converterArrayListEmString(ArrayList<Character> array){
        String retorno = "";
        for(Character l : array){
            retorno += l;
        }
        return retorno;
    }

    /** Métodos públicos */
    public Boolean checarLetra(Character letra){
        int posicao = 0;
        Boolean achouLetra = false;
        for(Character l : corretaSemAcento){
            if(l.equals(letra)){
                revelada.set(posicao, correta.get(posicao));
                achouLetra = true;
            }
            posicao++;
        }
        return achouLetra;
    }
    public Boolean sePalavraCompletamenteRevelada(){
        for(Character l : revelada){
            if(l.equals('_')){
                return false;
            }
        }
        return true;
    }



}
