import java.util.Scanner;

public class RecusiveExample {
    static void f(int n) {

        if (n <= 0) {
            System.out.print(n + " ");
            return ;
        }
        System.out.print(n+" ");
        f(n-5);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: ");
        int number = scanner.nextInt();
        f(number);

    }
}
