package td1.loop.conditions;



import java .util.Scanner;
public class ex5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("entrez l`heure\n");
        int heure = scanner.nextInt();
        System.out.println("choisissez une langue entrer e pour english et f pour french\n");
        char langue = scanner.nextLine().charAt(0);
        if (langue == 'e') {
            if ((heure > 0) && (heure < 18)) {
                System.out.println("Bonjour");
            }

            if ((heure > 18) && (heure < 22)) {
                System.out.println("Bonsoir");
            }

            if (heure > 22) {
                System.out.println("bonne nuit");
            }
        }

        else if (langue == 'f') {
            if ((heure > 0) && (heure < 18)) {
                System.out.println("good morning ");
            }

            if ((heure > 18) && (heure < 22)) {
                System.out.println("good evening ");
            }

            if (heure > 22) {
                System.out.println("good night");
            }
        }
    }
}