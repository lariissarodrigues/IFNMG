package Lista01;

import java.util.Scanner;

public class questao21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro lado:");
        double lado1 = scan.nextDouble();

        System.out.println("Digite o segundo lado:");
        double lado2 = scan.nextDouble();

        System.out.println("Digite o terceiro lado:");
        double lado3 = scan.nextDouble();

        if(lado1 == lado2 && lado1 == lado3){
            System.out.println("Equilatero");
        }
        else if(lado1 == lado2 || lado2 == lado3 || lado3 == lado1){
            System.out.println("Isoceles");
        }
        else{
            System.out.println("Escaleno");
        }

    }
}
