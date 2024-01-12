package td2;

public class ex6 {
    public static void main(String[] args) {
        Banque compte1 = new Banque(1, 5000.75f, "AB 1200");


        compte1.afficherInformations();

        System.out.println("Solde: " + compte1.avoirSolde());

        System.out.println("CIN: " + compte1.avoirlnf());


        compte1.diposer(500);

        compte1.afficherInformations();

        System.out.println("Solde: " + compte1.avoirSolde());


        compte1.retirer(200);

        compte1.afficherInformations();

        System.out.println("Solde: " + compte1.avoirSolde());

    }
}


class Banque{
    int NCompte;
    float  solde;
    String cin;

    public Banque(int NCompte, float  solde, String cin) {
        this.NCompte = NCompte;
        this.solde = solde;
        this.cin = cin;
    }

    public void diposer(double somme){
        this.solde += somme;
    }
    public boolean retirer(double somme){
        if((solde - somme)>= 0) {
            solde -= somme;
            return  true;
        }
        return false;
    }
    public void afficherInformations() {

        System.out.println("NCompte: " + NCompte);


        System.out.println("Solde: " + solde);

        System.out.println("CIN: " + cin);

    }
    public float avoirSolde() {

        return solde;

    }
    public String avoirlnf() {

        return cin;

    }


    @Override
    public String toString() {
        return "Banque{" +
                "NCompte=" + NCompte +
                ", solde=" + solde +
                ", cin='" + cin + '\'' +
                '}';
    }
}