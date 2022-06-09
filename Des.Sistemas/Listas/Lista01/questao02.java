package Lista01;
import java.util.Scanner; 

public class questao02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double numero1; 
        double numero2; 

        System.out.print("Informe o primeiro numero: ");
        numero1 = scan.nextDouble(); 

        System.out.print("Informe um seguno numero: ");
        numero2 = scan.nextDouble(); 

        var resultado = numero1 + numero2;
        System.out.printf("A soma dos numeros %.2f e %.2f é: %.2f", numero1, numero2, resultado);

        scan.close();
        
    }
}
