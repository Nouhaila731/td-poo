package td1.loop.loop;



import java.util.Scanner;
public class ex5 {

    public static void main(String[] args) {

        int n ;
        int Un=0;
        int Un1=1;
        int Un2=1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("entrez un entier n positif");
        n = scanner.nextInt();
        if (n==0 || n==1) {
            System.out.println(1);
            return;
        }
        System.out.print("1 1 ");
        for (int i = 2; i <= n; i++) {
            Un = Un1 + Un2;
            Un2 = Un1;
            Un1 = Un;
            System.out.print(Un + " ");
        }}}




