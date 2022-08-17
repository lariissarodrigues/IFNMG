public class Cafeteira {
    private final String MARCA;
    private boolean cafe;
    private boolean agua;
    private boolean poDeCafe;

    Cafeteira(String marca) {
        this.MARCA = marca;
    }


    public void colocarPo(boolean poDeCafe) {
        this.poDeCafe = poDeCafe;
    }


    public void agua(boolean agua) {
        this.agua = agua;
    }

    public void fazer() {
        if ((this.agua) && (this.poDeCafe)) {
            this.cafe = true;
            System.out.println("Cafe pronto");
        } else {
            this.cafe = false;
        }
    }

    public void tomar() {
        if(this.cafe){
            this.cafe = false;
            System.out.println("tomando...");

        } else {
            System.out.println("Falta algum componente!\nVeja se possui agua");
        }
    }

    public void limpar() {
        this.agua = false;
        this.cafe = false;

        System.out.println("limpando cafeteira...");
    }

}

