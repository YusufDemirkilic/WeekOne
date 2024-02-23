import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        //2 ile 10 arası kontorl edilecek mod değerleri dahil edilmedi
        for (int j = 2; j < 10; j++) {
            if (j == 2) {
                System.out.println("Prime Number: " + j);
                System.out.println("Prime Number: " + (j + 1));
            }
            if (!(j % 2 == 0) && !(j % 3 == 0)) {
                System.out.println("Prime number: " + j);
            }
        }//10 dan 100 e kadar olan sayılar kontrol edilecek
        for (int i = 2; i < 100; i++) {
            if (!(i % 2 == 0) && !(i % 3 == 0) && !(i % 5 == 0) && !(i % 7 == 0)) {

                System.out.println("Prime number: " + i);
            }

        }
    }
}
