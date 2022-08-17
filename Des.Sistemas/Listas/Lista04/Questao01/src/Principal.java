

public class Principal {
    public static void main(String[] args) {

        Caixa c1 = new Caixa();

        c1.setTamanho(30, 60, 70 );
        c1.setMaterial("Papelão");
        c1.setEstado(true);
        c1.setAbertura(true);

        System.out.println(c1);
    }
}
