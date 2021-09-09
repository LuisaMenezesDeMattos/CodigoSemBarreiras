package exercicios.parte_2._05_encapsulamento;

import java.util.ArrayList;

public class Pais {

    /** Atributos */
    private CodigoISO codigoISO;
    private String nome;
    private Integer populacao;
    private Double dimensaoKmQuadrados;
    private ArrayList<CodigoISO> paisesNaFronteira;

    /** Construtor */
    public Pais(CodigoISO _codigoISO, String _nome, Double _dimensaoKmQuadrados){
        this.codigoISO = _codigoISO;
        this.nome = _nome;
        if(_dimensaoKmQuadrados < 0){
            this.dimensaoKmQuadrados = 0.0;
        }else{
            this.dimensaoKmQuadrados = _dimensaoKmQuadrados;
        }
    }

    /** Métodos */

    public boolean equals(Pais pais) {
        return this.codigoISO.equals(pais.codigoISO);
    }

    public Double calculaDensidade(){
        try{
            return populacao/dimensaoKmQuadrados;
        }catch(Exception e){
            return null;
        }
    }

    public ArrayList<CodigoISO> vizinhosEmComum(Pais outroPais){
        ArrayList<CodigoISO> retorno =  new ArrayList<>();
        for(CodigoISO meuVizinho : this.paisesNaFronteira){
            for(CodigoISO vizinhoDoOutro : outroPais.paisesNaFronteira){
                if(vizinhoDoOutro.equals(meuVizinho)){
                    retorno.add(meuVizinho);
                }
            }
        }
        return retorno;
    }
}
