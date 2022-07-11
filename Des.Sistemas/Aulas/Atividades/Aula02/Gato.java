public class Gato {
    String nome;
    int idade;
    String raca;
    String nomeDono;

    Gato(int idade, String nome, String raca, String nomeDono){
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
        this.nomeDono = nomeDono;
    }

    void miar(){
        System.out.printf("%s miou!", this.nome);
    }
    void mostrarCara(){
        System.out.println("\nNome:" + nome);
        System.out.println("Idade:" + idade);
        System.out.println("Raça: " + raca);
        System.out.println("Nome do dono:" + nomeDono);

    }

}
