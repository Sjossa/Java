public class Exo1 {
    // Attribut privé titre
    private String titre;

    // Constructeur
    public Exo1(String titre) {
        this.titre = titre;
    }

    // Getter pour accéder
    public String getTitre() {
        return titre;
    }


    public void setTitre(String titre) {
        this.titre = titre;
    }

    public static void main(String[] args) {
        // Création d'un objet Livre
        Exo1 monLivre = new Exo1("Martine au zoo");

        // Utilisation du getter pour accéder au titre
        System.out.println("Titre initial : " + monLivre.getTitre());

        // Utilisation du setter pour changer le titre
        monLivre.setTitre("Martine au cirque");

        // Utilisation du getter pour accéder au nouveau titre
        System.out.println("Nouveau titre : " + monLivre.getTitre());
    }
}
