import java.util.Random;

public class Exo9 {

   public static void main(String[] args) {
       Random rand = new Random();
       int num = rand.nextInt(42) + 1;

       System.out.println("Nombre généré : " + num);

       boolean Nb42 = (num == 42);
       System.out.println(Nb42);
   }
}
