import java.util.Scanner;

public class Starspart2 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas in a number");
        n = scanner.nextInt();
        while (n > 0) {
            //alınan değer ile tek sayı formülünden değer yaz
            for (int f = 0; f < 2 * n - 1; f++) {
                System.out.print("*");
            }
            System.out.println();
            n--;
        }
    }
}
