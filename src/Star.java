import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        int n, a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas in a number");
        n = scanner.nextInt();
        a = n - 1;
        // tek sayı ile boşluk yapıldı
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }//yıldız yapıldı
            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //üçgenin altı için 1 adm ileriden başlandı
        for (int m = 1; m < n; m++) {
            for (int v = 0; v < m; v++) {
                System.out.print(" ");
            }
            for (int f = 0; f < 2 * a - 1; f++) {
                System.out.print("*");
            }
            System.out.println();
            a--;
        }
    }
}
