import java.util.Arrays;

public class Exo8 {
    public static void main(String[] args) {

        char[] myArray42 = "quarante-deux".toCharArray();


        String chaine = String.valueOf(myArray42);

        System.out.println(Arrays.toString(myArray42));
        System.out.println("La grande réponse sur la vie, l’univers et le reste ! " + chaine);
    }
}
