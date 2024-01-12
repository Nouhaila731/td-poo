package td1.loop.loop;



import java.util.Scanner;
public class ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez la valeur de N : ");
        int n = scanner.nextInt();
        scanner.close();

        int somme = 0;
        for (int i = 1; i < n; i++) {
            if (i % 2 != 0) {
                somme += i;
            }
        }

        System.out.println("La somme des entiers impairs inférieurs à N est : " + somme);
    }
}
