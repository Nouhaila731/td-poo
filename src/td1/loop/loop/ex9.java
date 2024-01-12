package td1.loop.loop;



import java.util.Scanner;
public class ex9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println("la somme des chiffres composant" +number+ " : " + sum);
    }
}
