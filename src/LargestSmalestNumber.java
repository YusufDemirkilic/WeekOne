import java.util.Scanner;

public class LargestSmalestNumber {
    public static void main(String[] args) {
        int N, big = Integer.MIN_VALUE, small = Integer.MAX_VALUE;

        Scanner scanner = new Scanner(System.in);
        System.out.println("kaç adet sayı girmek istiyorsunuz: ");
        N = scanner.nextInt();
        // N kadar değer kullanıcdan alıyoruz
        int[] num = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.println("Lütfen " + (i + 1) + ". sayıyı girin");
            num[i] = scanner.nextInt();
        }
        // her değeri  dizinin diğer elemanları ile karşılaştırıyoruz
        for (int k = 0; k < N; k++) {
            // en büyük değeri atıyoruz
            if (num[k] > big) {
                big = num[k];
            }
            //en küçük değeri atıyoruz
            if (num[k] < small) {
                small = num[k];
            }
        }
        System.out.println(" en büyük değer: " + big + "\n en küçük değer: " + small);
    }


}

