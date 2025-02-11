public class Exo2 {
    public String nom = "tommy";
    public int nombre = 12;


    public Exo2(String nom) {
        this.nom = nom;
    }

    public Exo2(int nombre) {
        this.nombre = nombre ;
    }

    public static void main(String[] args) {

        Exo2 obj1 = new Exo2("Johnny");


        Exo2 obj2 = new Exo2(13);

        System.out.println(obj1.nom + " " + obj2.nombre + " ans"); // Affiche "Johnny 13"
    }
}
