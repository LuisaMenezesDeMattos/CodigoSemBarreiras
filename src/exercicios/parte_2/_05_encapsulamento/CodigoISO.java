package exercicios.parte_2._05_encapsulamento;

/** Classe que trata o código de países pela norma ISO 3166-1 */
public class CodigoISO {

    private final char[] codigo;

    public CodigoISO(String _codigo) {
        if(_codigo.isBlank() || _codigo.isEmpty() || _codigo.length() != 3){
            this.codigo = new char[]{'-', '-', '-'};
        }else{
            this.codigo = _codigo.toUpperCase().toCharArray();
        }
    }

    public boolean equals(CodigoISO codigoISO) {
        for(int i=0; i<3; i++){
            if(codigoISO.codigo[i] != this.codigo[i]){
                return false;
            }
        }
        return true;
    }

}
