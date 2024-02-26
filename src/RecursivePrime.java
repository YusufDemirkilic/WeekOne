import java.util.Scanner;

public class RecursivePrime {
    static int f(int n, int divide) {
        //if the number "divide" is not divisible by the number "n "
        if (n != divide && n % divide == 0) {
            System.out.println(n + " sayı ASAL değildir.");
            return 0;
            // return value increment a by one
        } else if (n % divide != 0) {
            return f(n, divide + 1);

        } else {
            // print if teh number is prime
            System.out.println(n + " sayı ASAL sayıdır");
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı giriniz");
        int num = scanner.nextInt();
        f(num, 2);
    }
}
