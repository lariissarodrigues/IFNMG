public class Principal {
    public static void main(String[] args) {
        Carro c1 = new Carro(400, 10);

        c1.isLigado(false);
        c1.acelerar();
        System.out.println(c1.getvelocidade());
    }
}
