package td1.loop.conditions;



import java.util.Scanner;

public class ex6 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez la valeur de A : ");
        int a = scanner.nextInt();
        System.out.println("Entrez la valeur de B : ");
        int b = scanner.nextInt();
        scanner.close();

        String result = "";

        if (a == 0 || b == 0) {
            result = "zéro";
        } else if (a < 0 || b < 0) {
            result = "négatif";
        } else {
            result = "positif";
        }

        System.out.println("Le signe du produit de A et B est : " + result);
    }
}
