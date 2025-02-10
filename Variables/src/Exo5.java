import java.util.Objects;
public class Exo5 {
   public static void main(String[] args) throws Exception {
     Integer Fake = null;
Integer Resultat = Objects.requireNonNullElse(Fake, 42);
        System.out.println(Resultat);
    }
}
