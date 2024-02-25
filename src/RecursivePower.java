import java.util.Scanner;

public class RecursivePower {
    static int f(int n, int n_up) {
        //üst 1 olduğunda 1 sonucu döndürüyoruz
        if ( n_up == 0) {
            return 1;
        } else {
            //kullanıcıdan alınan değer ile üstü düşürüp çarpıyoruz
            int result = f(n, n_up - 1) * n;

            return result;
        }

    }

    public static void main(String[] args) {
        int num, num1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Taban sayısını giriniz: ");
        num = scanner.nextInt();
        System.out.println("Üst değerini giriniz: ");
        num1 = scanner.nextInt();
        System.out.println("üst hesabı: "+f(num, num1));
    }
}
