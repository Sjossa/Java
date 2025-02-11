public class Exo4 {
    public static void main(String[] args) {

        Compte compte1 = new Compte();
        Compte compte2 = new Compte();
        Compte compte3 = new Compte();


        System.out.println("Nombre de comptes créés : " + Compte.getNombreDeComptes());


        Compte compte4 = new Compte();
        Compte compte5 = new Compte();

        System.out.println("Nombre de comptes créés après création du 4ème compte : " + Compte.getNombreDeComptes());
    }
}

