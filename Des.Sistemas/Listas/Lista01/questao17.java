package Lista01;
import java.util.Scanner;

public class questao17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int anoAtual = 2022;

        System.out.println("Informe seu ano de nascimento: ");
        int anoNascimento = scan.nextInt();

        if(anoAtual - anoNascimento >= 16){
            System.out.println("Você pode votar esse ano!");

        }
        else{
            System.out.println("Você não pode votar esse ano!");
        }

    }
}
