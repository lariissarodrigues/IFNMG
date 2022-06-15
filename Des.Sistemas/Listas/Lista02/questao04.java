import java.util.Scanner;

public class questao04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double opcao;

        controle: while(true){
            System.out.println("Escolha uma das opçẽos abaixo");
            System.out.println("1 - Somar, 2 – Subtrair, 3- Multiplicar, 4 – Dividir e 5 - Sair");
            opcao = scan.nextDouble();

            switch ((int) opcao){

                case 1 -> {
                    System.out.println("Digite dois numeros: ");
                    soma(scan.nextDouble(), scan.nextDouble());
                }

                case 2 -> {
                    System.out.println("Digite dois numeros: ");
                    sub(scan.nextDouble(), scan.nextDouble());
                }

                case 3 -> {
                    System.out.println("Digite dois numeros: ");
                    mult(scan.nextDouble(), scan.nextDouble());
                }

                case 4 -> {
                    System.out.println("Digite dois numeros: ");
                    div(scan.nextDouble(), scan.nextDouble());
                }

                case 5 -> {
                    break controle;
                }


            }

        }

    }
    static void soma(double numero1, double numero2){
        System.out.printf("A soma dos numeros: %.2f\n", numero1 + numero2);
    }

    static void sub(double numero1, double numero2){
        System.out.printf("A subtração dos numeros: %.2f\n", numero1 - numero2);
    }

    static void mult(double numero1, double numero2){
        System.out.printf("A multiplicação dos numeros: %.2f\n", numero1 * numero2);
    }

    static void div(double numero1, double numero2){
        System.out.printf("A divisão dos numeros: %.2f\n", numero1 / numero2);
    }



}
/**
 * Codigo feito por: Larissa
 * Instituição: IFNMG-Campus Almenara
 * IDE: Intellij IDEA
 * GitHub: https://github.com/lrsrodrig
 * :D
 */