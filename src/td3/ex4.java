package td3;

public class ex4 {

    public static void main(String[] args) {
        Batiment batiment = new Batiment("1 rue de l'école");
        Maison maison = new Maison("2 rue des écoles", 4);
        Immeuble immeuble = new Immeuble("3 rue des écoles", 8);

        System.out.println(batiment.toString());
        System.out.println(maison.toString());
        System.out.println(immeuble.toString());
    }
}

class Batiment {
    private String adresse;

    public Batiment() {
        this.adresse = "non spécifié";
    }

    public Batiment(String adresse) {
        this.adresse = adresse;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }


}

class Maison extends Batiment {
    private int nbChambres;

    public Maison() {
        this.nbChambres = 0;
    }

    public Maison(String adresse, int nbChambres) {
        super(adresse);
        this.nbChambres = nbChambres;
    }

    public int getNbChambres() {
        return nbChambres;
    }

    public void setNbChambres(int nbChambres) {
        this.nbChambres = nbChambres;
    }


}

class Immeuble extends Batiment {
    private int nbAppart;

    public Immeuble() {
        this.nbAppart = 0;
    }

    public Immeuble(String adresse, int nbAppart) {
        super(adresse);
        this.nbAppart = nbAppart;
    }

    public int getNbAppart() {
        return nbAppart;
    }

    public void setNbAppart(int nbAppart) {
        this.nbAppart = nbAppart;
    }


}
