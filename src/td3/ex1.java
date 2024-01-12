package td3;

public class ex1 {




    public static void main(String[] args) {
        point point1 = new point(3, 4);
        point1.deplace(1, 2);


        PointA pointA1 = new PointA(6, 7);
        pointA1.deplace(-1, -2);
        pointA1.affiche();
    }
}

class point {
    private int x, y;

    public point(int x, int y) {
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

class PointA extends point {
    public PointA(int x, int y) {
        super(x, y);
    }

    public void affiche() {
        System.out.println("Coordonnees : " + getX() + " " + getY());
    }
}

/*Si la classe Point ne disposait pas des méthodes getX et getY,
il serait impossible d'implémenter la méthode affiche
dans la classe PointA.*/