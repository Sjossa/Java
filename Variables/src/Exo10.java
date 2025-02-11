public class Exo10 {
  public class Main {
    public static void main(String[] args) {

        boolean my42Boolean = true;
        byte my42Byte = 1;
        short my42Short = 10;
        int my42Int = 100;
        long my42Long = 1000L;
        float my42Float = 3.14f;
        double my42Double = 3.14159;
        char my42Char = 'A';
        String my42String = "Hello, World!";
        Object my42Object = new Object();

        // Affichage des types des variables
        System.out.println("Type de my42Boolean: " + ((Object)my42Boolean).getClass().getName());
        System.out.println("Type de my42Byte: " + ((Object)my42Byte).getClass().getName());
        System.out.println("Type de my42Short: " + ((Object)my42Short).getClass().getName());
        System.out.println("Type de my42Int: " + ((Object)my42Int).getClass().getName());
        System.out.println("Type de my42Long: " + ((Object)my42Long).getClass().getName());
        System.out.println("Type de my42Float: " + ((Object)my42Float).getClass().getName());
        System.out.println("Type de my42Double: " + ((Object)my42Double).getClass().getName());
        System.out.println("Type de my42Char: " + ((Object)my42Char).getClass().getName());
        System.out.println("Type de my42String: " + my42String.getClass().getName());
        System.out.println("Type de my42Object: " + my42Object.getClass().getName());
    }
}


}
