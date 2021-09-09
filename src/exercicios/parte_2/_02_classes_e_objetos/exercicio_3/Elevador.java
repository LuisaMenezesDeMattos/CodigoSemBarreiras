package exercicios.parte_2._02_classes_e_objetos.exercicio_3;

public class Elevador {

    /** Atributos */
    private Integer andarAtual;
    private final int totalAndares;
    private Integer qtdPassageirosAtuas;
    private final int totalPossivelPassageiros;

    /** Construtor */
    public Elevador(int _totalAndares, int _totalPossivelPassageiros){
        this.totalAndares = _totalAndares;
        this.totalPossivelPassageiros = _totalPossivelPassageiros;
        this.andarAtual = 0;
        this.qtdPassageirosAtuas = 0;
    }

    /** Getters & Setters */
    public void setAndar(int andar){
        if(andar < 0 || andar > this.totalAndares){
            System.out.println(" * ERRO: Andar não existe!");
            return;
        }
        this.andarAtual = andar;
    }

    /** Métodos Gerais */
    private void escrevePassageiros(){
        String texto = "Passageiros agora: ";
        texto += this.qtdPassageirosAtuas;
        texto += " (de " + this.totalPossivelPassageiros + " possíveis)";
        System.out.println(texto);
    }
    private void escreveAndar(){
        String texto = "Andar atual: ";
        if(this.andarAtual == 0){
            texto += "térreo";
        }else{
            texto += this.andarAtual;
        }
        texto += " (de " + totalAndares + " andares)";
        System.out.println(texto);
    }
    public void escreverElevador(){
        System.out.println("----------------------------");
        System.out.println("Elevador:");
        escreveAndar();
        escrevePassageiros();
        System.out.println("----------------------------");
    }
    public void entrar(){
        System.out.println("\n> Tentar: entrar");
        if(this.qtdPassageirosAtuas == this.totalPossivelPassageiros){
            System.out.println(" * ERRO: Elevador lotado!");
            return;
        }
        this.qtdPassageirosAtuas++;
        escrevePassageiros();
    }
    public void sair(){
        System.out.println("\n> Tentar: sair");
        if(this.qtdPassageirosAtuas == 0){
            System.out.println(" * ERRO: Elevador vazio!");
            return;
        }
        this.qtdPassageirosAtuas--;
        escrevePassageiros();
    }
    public void subir(){
        System.out.println("\n> Tentar: subir");
        if(andarAtual == totalAndares){
            System.out.println(" * ERRO: Elevador já no topo do prédio!");
            return;
        }
        this.andarAtual++;
        escreveAndar();
    }
    public void descer(){
        System.out.println("\n> Tentar: descer");
        if(andarAtual == 0){
            System.out.println(" * ERRO: Elevador já no térreo!");
            return;
        }
        this.andarAtual--;
        escreveAndar();
    }

}
