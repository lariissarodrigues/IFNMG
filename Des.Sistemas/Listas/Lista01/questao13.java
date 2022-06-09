package Lista01;
import java.util.Scanner;

public class questao13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final double gravidade = 20.2;

        System.out.println("Informe o tempo de queda em minutos: ");
        double tempo = scan.nextDouble();

        double alt = ((gravidade * Math.pow(tempo * 60, 2) ) / 2);
        System.out.printf("Altura necessaria: %.2f metros", alt);





    }
}
