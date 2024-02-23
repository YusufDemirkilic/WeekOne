import java.util.Scanner;
public class EbokEkok {
    public static void main(String[] args) {
        // 2 sayı ile ebob ekok bulma
        int a, b, c, ebob = 1, ekok ;
        boolean d = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 1. sayıyı girin: ");
        a = scanner.nextInt();
        System.out.println("lütfen 2. sayıyı girin");
        b = scanner.nextInt();
        // büyük sayı a ise koşula girer
        if (b < a) {
            System.out.print("ebob: ");
            c = a;
            while (d) {
                //büyükten geriye gidince ikisinin ilk ortak böleni ebob olur
                if (a % c == 0 && b % c == 0) {
                    ebob = c;
                    System.out.println(c + ",");
                    d = false;
                }
                c--;
            }
            // ekok formülü ile hesaplama
            ekok   = (a * b) / ebob;
            System.out.println("ekok: " + ekok);
        } else {
            //b sayısının büyük olduğu ihtimal
            System.out.print("ebob: ");
            c = b;
            while (d) {
                if (a % c == 0 && b % c == 0) {
                    ebob = c;
                    System.out.println(c + ",");
                    d = false;
                }
                c--;
            }
           ekok = (a * b) / ebob;
            System.out.println("ekok: " + ekok  );
        }
    }
}
