package Lista01;
import java.util.Scanner; 

public class questao06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double polegadas; 
        double metros; 

        System.out.print("Informe a quantidade de polegadas: ");
        polegadas = scan.nextDouble(); 

        System.out.print("Informe a quantidade de metros: ");
        metros = scan.nextDouble(); 

        double conver = polegadas * metros; 

        System.out.printf("Medidas informados: %.2f e %.2f", polegadas, metros);
        System.out.printf("\nConversão: %.2f  polegadas", conver);

        scan.close(); 



        
        

        
         
    }
    
}
