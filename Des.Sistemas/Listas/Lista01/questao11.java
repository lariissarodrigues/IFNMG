package Lista01;
import java.util.Scanner; 

public class questao11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 

        System.out.println("Informe a quantidade de horas: ");
        double horas  = scan.nextDouble(); 

        System.out.printf("%.0f horas equivalem a %.0f segundos", horas, (horas*60*60 ));


        scan.close(); 

        
        }
    }
    

