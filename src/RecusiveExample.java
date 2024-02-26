import java.util.Scanner;

public class RecusiveExample {
    static void f(int n) {
        //kullanıcdan alınan değeri 0 değerine gelne kadar yazdırır
        if (n <= 0) {
            System.out.print(n + " ");
            //- değeri yazdıktan sonra proamı 12. satıra geri götürür
            return ;
        }
        System.out.print(n+" ");
        f(n-5);
        // return ile geriye değer döndürür
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: ");
        int number = scanner.nextInt();
        f(number);

    }
}
