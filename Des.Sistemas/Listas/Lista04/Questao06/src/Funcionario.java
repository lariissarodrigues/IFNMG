public class Funcionario {
    private final String CPF;
    private String nome;
    private double salario;
    private int quantFilho;

    public Funcionario(String cpf, String nome, Double salario, int quantFilho){
        this.CPF = cpf;
        this.nome = nome;
        this.salario = salario;
        this.quantFilho = quantFilho;
    }

    public String getCPF() {
        return CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getQuantFilho() {
        return quantFilho;
    }

    public void setQuantFilho(int quantFilho) {
        this.quantFilho = quantFilho;
    }
}
