import java.util.Scanner;

public class questao03 {
    public static void main(String[] args) {

        int numero;
        int total = 0;

        Scanner scan = new Scanner(System.in);

        while(true){
            try {
                System.out.println("Informe um numero: ");
                numero = scan.nextInt();
                if (numero == 0) {
                    break;

                }else if (numero % 2 == 0) {
                    total++;
                }
            }catch (Exception e){
                System.out.println("DIGITE APENAS NUMEROS INTEIROS!!");
                break;
            }
        }
        scan.close();
        System.out.printf("Total de numeros pares: %d", total);

    }
}
/**
 * Codigo feito por: Larissa
 * Instituição: IFNMG-Campus Almenara
 * IDE: Intellij IDEA
 * GitHub: https://github.com/lrsrodrig
 * :D
 */