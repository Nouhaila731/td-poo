package td3;

public class ex3 {



    public static void main(String[] args) {
        Point point1 = new Point(3, 4);
        point1.affCoord();

        Centre centre1 = new Centre(6, 7, "Centre 1");
        centre1.affNom();
        centre1.affiche();

        Cercle cercle1 = new Cercle(1, 2, "Cercle 1", 5);
        cercle1.affNom();
        cercle1.affiche();
        cercle1.afficherRayon();
    }
}

class Point {
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void affCoord() {
        System.out.println("Coordonnees : " + x + " " + y);
    }

    private int x, y;
}

class Centre extends Point {
    private String nom;

    public Centre(int x, int y, String nom) {
        super(x, y);
        this.nom = nom;
    }

    public void affNom() {
        System.out.println("Nom : " + nom);
    }

    public void affiche() {
        affCoord();
        affNom();
    }
}

class Cercle extends Centre {
    private int rayon;

    public Cercle(int x, int y, String nom, int rayon) {
        super(x, y, nom);
        this.rayon = rayon;
    }

    public void afficherRayon() {
        System.out.println("Rayon : " + rayon);
    }
}
