package td1.loop.tables;



import java.util.Scanner;
public class ex3 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nombre d'étudiants: ");
        int nbreEtudiants = scanner.nextInt();
        double[] moyennes = new double[nbreEtudiants];
        System.out.print("Entrez le seuil: ");
        double seuil = scanner.nextDouble();
        int compteur = 0;

        for (int i = 0; i < nbreEtudiants; i++) {
            System.out.print("Entrez la moyenne de l'étudiant " + (i + 1) + ": ");
            moyennes[i] = scanner.nextDouble();
            if (moyennes[i] >= seuil) {
                compteur++;
            }
        }

        System.out.println("Nombre d'étudiants avec une moyenne supérieure ou égale au seuil: " + compteur);
    }
}