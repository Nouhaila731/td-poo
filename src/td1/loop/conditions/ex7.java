package td1.loop.conditions;



import java.util.Scanner;
public class ex7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un entier de trois chiffres non nuls : ");
        int n = scanner.nextInt();


        int[] digits = new int[10];
        while (n > 0) {
            digits[n % 10]++;
            n /= 10;
        }

        System.out.println("Les nombres formables sont : ");
        for (int i = 100; i < 1000; i++) {
            int count = 0;
            int number = i;
            while (number > 0) {
                count += digits[number % 10];
                number /= 10;
            }
            if (count == 3) {
                System.out.println(i);
            }
        }
    }
}

