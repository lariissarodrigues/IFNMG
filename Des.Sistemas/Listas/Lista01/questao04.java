package Lista01;
import java.util.Scanner; 
public class questao04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        System.out.println("------------------INFORME AS NOTAS DO ALUNO NOS CAMPOS ABAIXO--------------------------");
        System.out.println("Primeira nota: ");
        var nota1 = scan.nextDouble(); 

        System.out.println("Segunda nota: ");
        var nota2 = scan.nextDouble(); 

        System.out.println("Terceira nota: ");
        var nota3 = scan.nextDouble(); 

        System.out.println("Quarta nota: ");
        var nota4 = scan.nextDouble(); 
        System.out.println("---------------------CALCULANDO-------------------------");


        var result = ((nota1 + nota2 + nota3 + nota4) /2); 
        System.out.println("--------------------------------------------------------");
        
        System.out.printf("MEDIA DO ALUNO: %.2f", result);

        scan.close(); 


    }
    
}
