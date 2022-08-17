public class Carro {

    private final double VELOCIDADEMAX;
    private String marca;
    private double velocidade;
    private double aceleracao;

    private boolean ligado;



    public Carro(double velocidadeMax, double aceleracao) {

        if ((velocidadeMax > 0) && (aceleracao > 0)) {
            this.aceleracao = aceleracao;
            this.VELOCIDADEMAX = velocidadeMax;
        } else {
            this.aceleracao = 0;
            this.VELOCIDADEMAX = 0;
        }
    }

    public void desligar(boolean desligar){
        if(this.ligado){
            this.ligado = false;
        } else {
            System.out.println("O carro já está desligado!");
        }
    }

    public void acelerar(){
        if( (this.ligado)  && (this.aceleracao <= this.VELOCIDADEMAX)){
            this.velocidade = this.aceleracao + this.velocidade;

        } else {
            System.out.println("O carro está desligado ou a velocidade maxima foi ultrapassada");
        }
    }
    public void frear(){
        this.velocidade = 0;
    }

    public void isLigado(boolean estado){
        this.ligado = estado;
    }

    public double getvelocidade(){
        return this.velocidade;
    }
    public double getVelocidadeMax(){
        return this.VELOCIDADEMAX;
    }


}
