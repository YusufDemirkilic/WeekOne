import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        int a=0,b=1, num ,toplam=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Pleas enter number: ");
        num=scanner.nextInt();
        // kullanıcıdan alınan dögü sayısı ile 0 ve 1 ile başlangıç yapıyoruz
        for (int i=0;i<num;i++){
           toplam =a+b;
            System.out.print(a+" + "+b);
            System.out.println(" ="+toplam);
            // her takamı bir önceki rakama atama yapıyoruz
            a=b;
            b=toplam;
        }
    }
}
