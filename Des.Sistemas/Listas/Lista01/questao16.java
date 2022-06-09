package Lista01;
import java.util.Scanner;

public class questao16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        var numero = scan.nextInt();

        if(numero % 2 == 0){
            System.out.printf("%d é par!", numero);
        }
        else{
            System.out.printf("%d é impar!", numero);
        }

    }

}
