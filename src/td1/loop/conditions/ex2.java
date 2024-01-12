package td1.loop.conditions;



import java.util.Scanner;
public class ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez les coefficients a, b et c : ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();


        double determinant = b * b - 4 * a * c;

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("L'équation a une infinité de solutions.");
                } else {
                    System.out.println("L'équation n'a pas de solutions.");
                }
            } else {
                System.out.println("L'équation est lineaire, x = " + (-c / b));
            }
        } else {
            if (determinant < 0) {
                System.out.println("L'équation n'a pas de solutions réelles.");
            } else if (determinant == 0) {
                double x = -b / (2 * a);
                System.out.println("Les solutions de l'équation sont x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(determinant)) / (2 * a);
                double x2 = (-b - Math.sqrt(determinant)) / (2 * a);
                System.out.println("Les solutions de l'équation sont x = " + x1 + " et x = " + x2);
            }
        }
    }
}
