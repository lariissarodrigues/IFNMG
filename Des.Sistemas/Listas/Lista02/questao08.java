import java.util.Scanner;

public class questao08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        System.out.println("informe um numero: ");
        numero = scan.nextInt();
        System.out.println("----MULTIPLICÇÃO----");
        for(int mult = 0; mult <= 10; mult++){
            System.out.printf("%d x %d = %d\n", numero, mult,(numero * mult));
        }
        System.out.println("-----DIVISÃO------");
        for(int div = 1; div <= 10; div++){
            System.out.printf("%d ÷ %d = %.2f\n", numero, div,(double)numero / div);
        }

    }
}
/**
 * Codigo feito por: Larissa
 * Instituição: IFNMG-Campus Almenara
 * IDE: Intellij IDEA
 * GitHub: https://github.com/lrsrodrig
 * :D
 */
