package td1.loop.conditions;


import java.util.Scanner;
public class ex1 {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez trois variables : ");
        double var1 = scanner.nextDouble();
        double var2 = scanner.nextDouble();
        double var3 = scanner.nextDouble();
        scanner.close();

        double max = maxOfThree(var1, var2, var3);
        System.out.println("Le maximum des trois variables est : " + max);
    }

    public static double maxOfThree(double var1, double var2, double var3) {
        return Math.max(var1, Math.max(var2, var3));
    }
}
