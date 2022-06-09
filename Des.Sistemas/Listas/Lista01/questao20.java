package Lista01;
import java.util.Scanner;

public class questao20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Primeiro numero: ");
        int numero1 = scan.nextInt();

        System.out.println("Primeiro numero: ");
        int numero2 = scan.nextInt();

        System.out.println("Primeiro numero: ");
        int numero3 = scan.nextInt();

        if(numero1 < numero2 && numero1 < numero3){
            System.out.printf("%d é o menor numero!", numero1);
        }
        else if(numero2 < numero1 && numero2 < numero3){
            System.out.printf("%d é o menor numero!", numero2);
        }
        else if(numero3 < numero1 && numero3< numero2){
            System.out.printf("%d é o menor numero!", numero3);
        }
        else{
            System.out.println("Os numeros são iguais!");
        }




    }
}
