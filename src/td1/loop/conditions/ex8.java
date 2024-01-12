package td1.loop.conditions;



import java.util.Scanner;
public class ex8 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le numéro du mois : ");
        int month = scanner.nextInt();
        System.out.println("Entrez l'année : ");
        int year = scanner.nextInt();
        scanner.close();

        int daysInMonth = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = 30;
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
                break;
            default:
                System.out.println("Mois invalide.");
                return;
        }

        System.out.println("Le nombre de jours dans ce mois est : " + daysInMonth);
    }
}
