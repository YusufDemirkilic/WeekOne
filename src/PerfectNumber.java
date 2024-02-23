import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        int a, b = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 1. sayıyı girin: ");
        a = scanner.nextInt();
        // kalansız bölen ayıları bulup topluyoruz
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                b += i;
            }
        }
        //toplam sayıya eşitse çıktıyı veriyoruz
        if (b == a) {
            System.out.println(a + " bir mükemmel sayıdır.");
        } else {
            System.out.println(a + " bir mükemme sayı değildir.");
        }

    }
}