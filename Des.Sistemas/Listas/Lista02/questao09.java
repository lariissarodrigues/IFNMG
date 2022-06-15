import java.util.Scanner;

public class questao09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int result = 1;

        System.out.println("Informe um numero: ");
        int numero = scan.nextInt();

        for(int fatorial = 1; fatorial <= numero; fatorial++){
            result *= fatorial;
        }
        System.out.printf("Fatorial = %d", result);
    }
}
/**
 * Codigo feito por: Larissa
 * Instituição: IFNMG-Campus Almenara
 * IDE: Intellij IDEA
 * GitHub: https://github.com/lrsrodrig
 * :D
 */