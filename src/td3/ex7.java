package td3;

public class ex7 {

    public static void main(String[] args) {

        Employe employe1 = new Patron("Martin", "John", 5000);

        System.out.println(employe1.toString());

        System.out.println("Salaire: " + employe1.gains());

        Employe employe2 = new TravailleurCommission("Dupont", "Marie", 4000, 500, 20);

        System.out.println(employe1.toString());

        System.out.println("Salaire: " + employe2.gains());

        Employe employe3 = new TravailleurHoraire("Martin", "Luc", 200, 40);

        System.out.println(employe1.toString());

        System.out.println("Salaire: " + employe3.gains());

    }
}
abstract class Employe {
    private String nom;
    private String prenom;

    public Employe() {
        this.nom = "";
        this.prenom = "";
    }

    public Employe(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }

    public abstract double gains();
}
class Patron extends Employe {
    private double salaire;

    public Patron() {
        super();
        this.salaire = 0;
    }

    public Patron(String nom, String prenom, double salaire) {
        super(nom, prenom);
        this.salaire = salaire;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return "Patron{" +
                "salaire=" + salaire +
                "} " + super.toString();
    }

    @Override
    public double gains() {
        return salaire;
    }
}
class TravailleurCommission extends Employe {
    private double salaire;
    private double commission;
    private int quantite;

    public TravailleurCommission() {
        super();
        this.salaire = 0;
        this.commission = 0;
        this.quantite = 0;
    }

    public TravailleurCommission(String nom, String prenom, double salaire, double commission, int quantite) {
        super(nom, prenom);
        this.salaire = salaire;
        this.commission = commission;
        this.quantite = quantite;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    @Override
    public String toString() {
        return "TravailleurCommission{" +
                "salaire=" + salaire +
                ", commission=" + commission +
                ", quantite=" + quantite +
                "} " + super.toString();
    }

    @Override
    public double gains() {
        return salaire + (commission * quantite);
    }

}
class TravailleurHoraire extends Employe {
    private double retribution;
    private int heures;

    public TravailleurHoraire() {
        super();
        this.retribution = 0;
        this.heures = 0;
    }

    public TravailleurHoraire(String nom, String prenom, double retribution, int heures) {
        super(nom, prenom);
        this.retribution = retribution;
        this.heures = heures;
    }

    public double getRetribution() {
        return retribution;
    }

    public void setRetribution(double retribution) {
        this.retribution = retribution;
    }

    public int getHeures() {
        return heures;
    }

    public void setHeures(int heures) {
        this.heures = heures;
    }

    @Override
    public String toString() {
        return "TravailleurHoraire{" +
                "retribution=" + retribution +
                ", heures=" + heures +
                "} " + super.toString();
    }

    @Override
    public double gains() {
        return retribution * heures;
    }
}