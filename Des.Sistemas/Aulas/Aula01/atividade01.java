package Aula;
import java.util.Scanner;
public class atividade01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o primeiro numero: ");
        int numero01 = scan.nextInt();

        System.out.println("Informe o primeiro numero: ");
        int numero02 = scan.nextInt();

        if (numero01 > numero02) {
            System.out.printf("%d é maior que %d", numero01, numero02);

        } else if (numero02 > numero01) {
            System.out.printf("%d é maior que %d", numero02, numero01);

        } else {
            System.out.println("Os numeros são iguais!");
        }
        scan.close();
        }
    }