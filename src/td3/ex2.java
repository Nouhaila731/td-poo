package td3;

public class ex2 {


    public static void main(String[] args) {
        PointNom pointNom1 = new PointNom(3, 4, 'A');
        pointNom1.affCoordNom();

        pointNom1.setPointNom(6, 7, 'B');
        pointNom1.affCoordNom();

        pointNom1.setNom('C');
        pointNom1.affCoordNom();
    }
}

class PointNom extends Pointt {
    private char nom;

    public PointNom(int x, int y, char nom) {
        super(x, y);
        this.nom = nom;
    }

    public void setPointNom(int x, int y, char nom) {
        super.setPoint(x, y);
        this.nom = nom;
    }

    public void setNom(char nom) {
        this.nom = nom;
    }

    public void affCoordNom() {
        System.out.println("Coordonnees : " + getX() + " " + getY() + " - Nom : " + nom);
    }
}

class Pointt {
    private int x, y;

    public Pointt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void deplace(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
