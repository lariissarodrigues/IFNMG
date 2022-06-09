package Lista01;
import java.util.Scanner;

public class questao19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a quantidade de laranjas: ");
        int laranjas  = scan.nextInt();

        if(laranjas >= 12){
            double valor  = laranjas * 0.30;
            System.out.printf("Preço da compra: %.2fR$", valor);
        }
        else{
            double valor = laranjas * 0.50;
            System.out.printf("Preço da compra: %.2fR$\n", valor);
        }

    }
}
