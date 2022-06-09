package Lista01; 
import java.util.Scanner; 

public class questao01{ 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 

        System.out.print("Informe o primeiro numero: ");
        var numero_1 = scan.nextInt(); 

        System.out.print("Informe um seguno numero: ");
        var numeoro_2 = scan.nextInt(); 

        var resultado = numero_1 + numeoro_2;
        System.out.printf("A soma dos numeros %d e %d é %d", numero_1, numeoro_2, resultado);

        scan.close();
        







    }
}