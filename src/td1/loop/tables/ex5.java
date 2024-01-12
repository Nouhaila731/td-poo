package td1.loop.tables;



import java.util.Scanner;
public class ex5 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez la taille du tableau: ");
        int taille = scanner.nextInt();
        char[] tableau = new char[taille];
        char[] tableauDecale = new char[taille];

        for (int i = 0; i < taille; i++) {
            System.out.print("Entrez l'élément " + (i + 1) + " du tableau: ");
            tableau[i] = scanner.next().charAt(0);
        }

        System.out.print("Entrez l'élément à décaler: ");
        char elementDecale = scanner.next().charAt(0);

        for (int i = 0; i < taille; i++) {
            tableauDecale[i] = tableau[(i + 1) % taille];
        }

        System.out.println("Tableau modifié : ");
        for (int i = 0; i < taille; i++) {
            System.out.print(tableauDecale[i] + " ");
        }
    }
}
