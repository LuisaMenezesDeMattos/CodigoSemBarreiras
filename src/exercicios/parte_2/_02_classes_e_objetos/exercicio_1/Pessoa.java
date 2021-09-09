package exercicios.parte_2._02_classes_e_objetos.exercicio_1;

import java.text.DecimalFormat;

public class Pessoa {

    /** Atributos */
    private String nome;
    private Integer anoNascimento;
    private Float altura;

    /** Construtores */
    public Pessoa(){}
    public Pessoa(String _nome){
        this.nome = _nome;
    }
    public Pessoa(String _nome, Integer _anoNascimento, Float _altura){
        setNome(_nome);
        setAnoNascimento(_anoNascimento);
        setAltura(_altura);
    }

    /** Getters & Setters */
    public String getNome(){
        return this.nome;
    }
    public void setNome(String _nome){ this.nome = _nome; }
    public Integer getAnoNascimento(){
        return this.anoNascimento;
    }
    public void setAnoNascimento(int _ano){
        this.anoNascimento = _ano;
    }
    public Float getAltura(){
        return this.getAltura();
    }
    public void setAltura(float _altura){
        String alturaDuasCasaDecimais = new DecimalFormat(".00").format(_altura);
        alturaDuasCasaDecimais = alturaDuasCasaDecimais.replaceAll(",", ".");
        this.altura = Float.parseFloat(alturaDuasCasaDecimais);
    }

    /** Métodos gerais */
    public String toString(){
        String texto = "Nome: " + this.nome;
        texto += ", Ano de Nascimento: " + this.anoNascimento;
        texto += ", Altura: " + this.altura;
        return texto;
    }
    public Integer idadeEsseAno(){
        try{
            return 2021 - anoNascimento;
        }catch(Exception e){
            System.out.println(" * ERRO: problema com o ano cadastrado!");
        }
        return null;
    }

}
