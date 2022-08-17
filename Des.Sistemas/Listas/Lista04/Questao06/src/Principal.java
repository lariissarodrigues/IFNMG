import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        FolhaDePagamento();


    }

    public static void FolhaDePagamento() {
        FolhaDePagamento folha1 = new FolhaDePagamento();
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("=====================MENU=====================");
            System.out.println("1-Adcionar funcionarios\n2-Gerar/Calcular folha de pagamento\n3-Alterar FUncionario");
            System.out.println("==============================================");

            int opcao = Integer.parseInt(scan.nextLine());

            switch (opcao) {
                case 1 -> {
                    System.out.println("Informe o nome:");
                    String nome = scan.nextLine();

                    System.out.println("Informar CPF: ");
                    String cpf = scan.nextLine();

                    System.out.println("Informe o salario: ");
                    Double salario = Double.parseDouble(scan.nextLine());

                    System.out.println("Informe a quantidade de filhos");
                    int quantFilhos = Integer.parseInt(scan.nextLine());

                    folha1.AddFuncionarios(new Funcionario(cpf, nome, salario, quantFilhos));
                }
                case 2 -> {
                    folha1.calcularFolhaDePagamento();
                }
                case 3 -> {
                    System.out.println("===============MENU DE ALTERAÇÃO===============");
                    System.out.println("Deseja alterar qual atributo:\n1-Nome\n2-Quantidade de filhos\n3-Salario");
                    int escolha = Integer.parseInt(scan.nextLine());
                    System.out.println("===============================================");
                    System.out.println("Informe o cpf: ");
                    String cpf = scan.nextLine();


                    switch (escolha) {
                        case 1 -> {
                            System.out.println("Insira novo nome:");
                            folha1.alterarFuncionario(cpf, scan.nextLine(), 0, -1);
                        }
                        case 2 -> {
                            System.out.println("Quantidade de filhos:");
                            folha1.alterarFuncionario(cpf, "", 0, Integer.parseInt(scan.nextLine()));
                        }
                        case 3 -> {
                            System.out.println("Novo salario:");
                            folha1.alterarFuncionario(cpf, "", Double.parseDouble(scan.nextLine()), -1);
                        }
                        default -> System.out.println("Opção não é falida");
                    }
                }
            }
        }
    }
}