package Lista01;
import java.util.Scanner;

public class questao18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final int senha = 1234;

        System.out.println("Informe sua senha: ");
        int tentativa = scan.nextInt();

        if(tentativa == senha ){
            System.out.println("Senha verificada com sucesso!");
        }
        else{
            System.out.println("Senha incorreta!");
        }


    }
}
