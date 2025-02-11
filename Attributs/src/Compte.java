public class Compte {
    private static int nombreDeComptes = 0;


    public Compte() {
        nombreDeComptes++;
    }


    public static int getNombreDeComptes() {
        return nombreDeComptes;
    }
}
