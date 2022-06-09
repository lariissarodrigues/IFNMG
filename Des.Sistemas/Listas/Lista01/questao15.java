package Lista01;
import java.util.Scanner;

public class questao15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("-------------INFORME O QUE SE PEDE NO CAMPO ABAIXO--------------");

        System.out.println("Altura: ");
        double altura = scan.nextDouble();

        System.out.println("Peso:  ");
        double peso = scan.nextDouble();


        double imc = (peso / Math.pow(altura, 2));

        if (imc < 18.5) {
            System.out.println("MAGREZA!");
        }
        else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("SAUDAVEL!");
        }
        else if (imc >= 25 && imc <= 29.9) {
            System.out.println("SOBRE-PESO");
        }
        else if (imc >= 30 && imc <= 34.9) {
            System.out.println("Obesidade I GRAU");
        }
        else if (imc >= 35 && imc <= 39.9) {
            System.out.println("Obesidade II GRAU");
        }
        else if (imc > 30) {
            System.out.println("Obesidade III GRAU");
        }
        scan.close();
    }
}