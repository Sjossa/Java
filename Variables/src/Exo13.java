public class Exo13 {
    public static void main(String[] args) {
        
        int a = 24;
        int b = 42;

        System.out.println("Avant l'échange : a = " + a + ", b = " + b);


        int remplacement = a;
        a = b;
        b = remplacement;

        System.out.println("Après l'échange : a = " + a + ", b = " + b);
    }
}
