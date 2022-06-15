import java.util.Scanner;

public class questao05 {
    public static void main(String[] args) {
        double compra;
        double desconto = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor total da compra: ");
        compra = scan.nextDouble();

        System.out.println("Informe seu codigo de cliente: ");
        int codigo = scan.nextInt();

        switch (codigo){
            case 1 ->{
                desconto = 0;
            }
            case 2 ->{
                desconto = 0.05;
            }
            case 3 ->{
                desconto = 0.10;
            }

        }
        System.out.printf("Valor inicial:%.2f\n", compra);
        System.out.printf("Desconto aplicado:%.2f%%\n", desconto);
        System.out.printf("Valor final:%.2f\n", compra * (1 - desconto));



    }
}
/**
 * Codigo feito por: Larissa
 * Instituição: IFNMG-Campus Almenara
 * IDE: Intellij IDEA
 * GitHub: https://github.com/lrsrodrig
 * :D
 */