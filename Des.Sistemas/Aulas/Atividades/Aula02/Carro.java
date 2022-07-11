public class Carro {
    String modelo;
    Double velocidade;
    String marca;
    double velocidadeMax = 10000;


    Carro(String marca, String modelo, double velocidade){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = velocidade;

    }

    void mostrarAtributos(){
        System.out.printf("Marca: %s\n", marca);
        System.out.printf("Modelo: %s\n", modelo);
        System.out.printf("Velocidade: %.2f k/h \n", velocidade);
    }

    double aumentarVelocidade(double aumentarVelo) {

        if(aumentarVelo > 0 & aumentarVelo < 1000) {
            this.velocidade += aumentarVelo;
        }
        else if(velocidade + aumentarVelo > velocidadeMax) {


        }

        return velocidade;
    }



    double diminuirVelocidade(double diminuirVelo){
        this.velocidade -= diminuirVelo;
        return  velocidade;
    }



}
