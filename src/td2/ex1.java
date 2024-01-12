package td2;



import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nom du point: ");
        char nom = scanner.next().charAt(0);
        System.out.print("Entrez l'abscisse du point: ");
        double abscisse = scanner.nextDouble();

        point point = new point (nom, abscisse);
        point.affiche();

        System.out.print("Entrez la valeur de la translation: ");
        double valeurTranslation = scanner.nextDouble();
        point.translate(valeurTranslation);
        point.affiche();
    }
}

class point {
    private char nom;
    private double abscisse;

    public point(char nom, double abscisse) {
        this.nom = nom;
        this.abscisse = abscisse;
    }

    public void affiche() {
        System.out.println("Point : " + nom + " ; Abscisse : " + abscisse);
    }

    public void translate(double valeurTranslation) {
        abscisse += valeurTranslation;
    }

    public char getNom() {
        return nom;
    }

    public void setNom(char nom) {
        this.nom = nom;
    }

    public double getAbscisse() {
        return abscisse;
    }

    public void setAbscisse(double abscisse) {
        this.abscisse = abscisse;
    }}

