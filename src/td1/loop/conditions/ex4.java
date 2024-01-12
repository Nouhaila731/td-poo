package td1.loop.conditions;



import java.util.Scanner;
public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("entrez votre moyenne\n");
        int m = scanner.nextInt();
        if (m>=16) System.out.println("T.Bien");
        else if (m>= 14) System.out.println("Bien");
        else if (m>= 12) System.out.println("A.Bien");
        else if (m>=10) System.out.println("Passable");
        else System.out.println("Non Valide");
    }
}
