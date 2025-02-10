import java.util.Objects;
public class Exo5 {
   public static void main(String[] args) throws Exception {
     Integer maVariable = null; // ou une valeur quelconque
Integer Resultat = Objects.requireNonNullElse(maVariable, 42);
        System.out.println(Resultat);


    }
}
