public class Principal {
    public static void main(String[] args) {
         Cafeteira cafe1 = new Cafeteira("LG");
         cafe1.colocarPo(true);
         cafe1.agua(true);

         cafe1.fazer();
         cafe1.tomar();
         cafe1.limpar();

        System.out.println("-------------------------------------------- ");
         cafe1.agua(true);
         cafe1.fazer();
         cafe1.tomar();
         cafe1.limpar();






    }
}
