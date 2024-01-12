package td1.loop.loop;




import java.util.Scanner;
public class ex3 {




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxNum = Integer.MIN_VALUE;
        int maxIndex = -1;
        for (int i = 1; i <= 20; i++) {
            System.out.println("Enter number " + i + ":");
            int number = scanner.nextInt();
            if (number > maxNum) {
                maxNum = number;
                maxIndex = i;
            }
        }
            /*
              do {
            System.out.println("The N:");
            n = scanner.nextInt();
            if (n > max) {
                max = n;
                p = j;

            }
            j++;
        } while (n != 0);
           */
        System.out.println("The maximum number is " + maxNum);
        System.out.println("This number was entered at position " + maxIndex);
    }



}

