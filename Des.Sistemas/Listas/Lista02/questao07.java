import java.util.Scanner;

public class questao07 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
       controle: while (true) {
            System.out.println("Informe qual escala deseja fazer no campo abaixo");

            System.out.println("1. Celsius para Kelvin\n" +
                    "2. Celsius para Fahrenheit\n" +
                    "3. Fahrenheit para Celsius\n" +
                    "4. Kelvin para Celsius\n" +
                    "5. Fahrenheit para Kelvin\n" +
                    "6. Kelvin para Fahrenheit\n" +
                    "7. Sair do Programa");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1 -> {
                    celsiusToKelvin();
                }
                case 2 ->{
                    celsiusToFahrenheit();
                }
                case 3 ->{
                    fahrenheitToCelcius();
                }
                case 4 ->{
                    kelvinToToCelcius();
                }
                case 5 ->{
                    fahrenheitToKelvin();
                }
                case 6 ->{
                    kelvinToFahrenheit();
                }
                case 7 ->{
                    break controle;

                }
            }

        }
    }


    static void celsiusToKelvin(){
        System.out.println("-------------------------------------------------");
        System.out.printf("Digite a temperatura: ");
        double temperatura = scan.nextDouble();

        System.out.printf("Cº:%.2f\n", temperatura);
        System.out.printf("Kº = %.2f\n", temperatura + 273.15);
        System.out.println("-------------------------------------------------");
    }

    static void celsiusToFahrenheit(){
        System.out.println("-------------------------------------------------");
        System.out.printf("Digite a temperatura: ");
        double temperatura = scan.nextDouble();

        System.out.printf("Cº:%.2f\n", temperatura);
        System.out.printf("Fº = %.2f\n", (temperatura * 1.8) + 32);
        System.out.println("-------------------------------------------------");
    }

    static void fahrenheitToCelcius(){
        System.out.println("-------------------------------------------------");
        System.out.printf("Digite a temperatura: ");
        double temperatura = scan.nextDouble();

        System.out.printf("Fº:%.2f\n", temperatura);
        System.out.printf("Cº = %.2f\n", (temperatura - 32) / 1.8);
        System.out.println("-------------------------------------------------");
    }

    static void kelvinToToCelcius(){
        System.out.println("-------------------------------------------------");
        System.out.printf("Digite a temperatura: ");
        double temperatura = scan.nextDouble();

        System.out.printf("Kº:%.2f\n", temperatura);
        System.out.printf("Cº = %.2f\n", (temperatura - 273.15));
        System.out.println("-------------------------------------------------");
    }

    static void fahrenheitToKelvin(){
        System.out.println("-------------------------------------------------");
        System.out.printf("Digite a temperatura: ");
        double temperatura = scan.nextDouble();

        System.out.printf("Fº:%.2f\n", temperatura);
        System.out.printf("Kº = %.2f\n", (temperatura + 459.67) * 5/9);
        System.out.println("-------------------------------------------------");
    }

    static void kelvinToFahrenheit(){
        System.out.println("-------------------------------------------------");
        System.out.printf("Digite a temperatura: ");
        double temperatura = scan.nextDouble();

        System.out.printf("Kº:%.2f\n", temperatura);
        System.out.printf("Fº = %.2f\n", (temperatura - 273.15) * 9/5 + 32);
        System.out.println("-------------------------------------------------");
    }



}
/**
 * Codigo feito por: Larissa
 * Instituição: IFNMG-Campus Almenara
 * IDE: Intellij IDEA
 * GitHub: https://github.com/lrsrodrig
 * :D
 */