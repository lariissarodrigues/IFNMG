package Lista01;
import java.util.Scanner; 

public class questao10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 

        System.out.println("Informe a quantidade de minutos: ");
        double minutos = scan.nextDouble(); 

        System.out.printf("%.0f minutos equivalem a %.0f horas", minutos, (minutos/60));

        scan.close(); 

        

    }
    
}
//Quantidade de minutos que equivalem a horas