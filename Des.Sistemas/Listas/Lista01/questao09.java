package Lista01;
import java.util.Scanner; 
public class questao09 {
    public static void main(String[] args){ 
        Scanner scan = new Scanner(System.in); 
        
        System.out.println("Cotação do dola: "); 
        double cota = scan.nextDouble(); 

        System.out.println("Informe a quantidade de R$: "); 
        double reais = scan.nextDouble(); 

        System.out.println("----------CONVERTENDO----------");
        System.out.printf("Conversão: %.2f", (cota / reais)); 

        scan.close(); 

 



        


        

    }

    
}
/*Escreva um programa que receba o valor da cotação do dólar em reais, 
em seguida receba um
determinado valor em 
real e faça a conversão. Imprima o resultado. */ 