package Lista01; 
import java.util.Scanner; 
public class questao03 {
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in); 
        int numero1; 
        int numero2; 
        
        System.out.print("Informe o primeiro numero: ");
        numero1 = scan.nextInt(); 

        System.out.print("Informe sesgundo numero: ");
        numero2  = scan.nextInt(); 

         
        var resto = numero1 % numero2; 
        var div = numero1 / numero2; 

        System.out.printf("\nResultado da divisão: %d", div);
        System.out.printf("\nResto da divisão: %d", resto);

        scan.close(); 

    }
}
