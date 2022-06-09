package Lista01;

import java.util.Scanner;

public class questao08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        
        System.out.println("----- PREECHA SUAS INFORMAÇÕES NOS CAMPOS ABAIXO ------");


        System.out.print("Nome e sobrenome: ");
        String nome_sobre = scan.nextLine(); 

        System.out.println(" ---- ENDEREÇO ----"); 
         
        System.out.println("Nome da Rua: ");
        String nome_rua = scan.nextLine(); 


        System.out.println("Cidade: ");
        String cidade = scan.nextLine();

        System.out.println("Estado: ");
        String estado = scan.nextLine(); 

        System.out.println("Numeração da casa: ");
        int numero_casa = scan.nextInt(); 


        System.out.println("Nome: " + nome_sobre);
        System.out.printf("Endereço: %s, N: %d - %s, %s", nome_rua, numero_casa, cidade, estado);

        scan.close();



    }
    
}
