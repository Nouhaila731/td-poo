package td1.loop.conditions;



import java.util.Scanner;
public class ex9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez la première variable : ");
        int a = scanner.nextInt();
        System.out.println("Entrez la deuxième variable : ");
        int b = scanner.nextInt();
        scanner.close();

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        System.out.println("Les variables dans l'ordre croissant sont : " + a + " puis " + b);
    }
}
