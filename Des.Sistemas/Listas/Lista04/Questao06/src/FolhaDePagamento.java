
import java.util.Scanner;
public class FolhaDePagamento {

    private Funcionario[] funcionarios = new Funcionario[5];
    private int quantFuncionarios;


    public void calcularFolhaDePagamento() {
        System.out.println("========================================");
        try {
            for (var l1 : funcionarios) {
                System.out.printf("Funcionario: %s\n", l1.getNome());
                System.out.printf("CPF: %s\n", l1.getCPF());
                System.out.printf("Filhos: %s\n", l1.getQuantFilho());
                System.out.printf("Salario: %s\n", l1.getSalario() + 100 * l1.getQuantFilho());
                System.out.println();
            }
        } catch (Exception e) {
            //
        }
        System.out.println("========================================");


    }

    public void AddFuncionarios(Funcionario funcionario) {
        try {
            this.funcionarios[quantFuncionarios] = funcionario;
            this.quantFuncionarios++;


        } catch (Exception e) {
            // Apenas uma gambiarra.
        }


    }


    public void alterarFuncionario(String cpf, String nome, double salario, int quantfilhos) {
        Funcionario func = null;
        try {
            for (var l1 : funcionarios) {
                if (cpf.equals(l1.getCPF())) {
                    func = l1;

                }
            }
        } catch (Exception e){
            //
        }
        if (func != null) {
            if (nome != "") {
                func.setNome(nome);
            }
            if (salario > 0) {
                func.setSalario(salario);
            }
            if (quantfilhos > -1) {
                func.setQuantFilho(quantfilhos);
            }
        }

    }
}