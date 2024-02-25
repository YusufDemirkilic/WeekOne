import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String menu = "1- Toplama İşlemi\n" +
                "2- Çıkarma İşlemi\n" +
                "3- Çarpma İşlemi\n" +
                "4- Bölme işlemi\n" +
                "5- Üslü Sayı Hesaplama\n" +
                "6- Faktoriyel Hesaplama\n" +
                "7- Mod Alma\n" +
                "8- Dikdörtgen Alan ve Çevre Hesabı \n" +
                "0- Çıkmak için";
        int select;
        do {
            // yapılacak işlemimizi seçiyoruz
            System.out.println(menu);
            System.out.print("\n Lütfen bir işlem seçiniz :");
            select= scanner.nextInt();
            // seçilen işlemler ile metodları gidiyoruz
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    retangle();
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);


    }

    //toplama
    static int plus() {
        int num1, num2;
        Scanner scan = new Scanner(System.in);
        System.out.println("1. sayıyı giriniz: ");
        num1 = scan.nextInt();
        System.out.println("2. sayıyı giriniz: ");
        num2 = scan.nextInt();
        int result = num1 + num2;
        System.out.println("sonuc: " + result);
        return result;
    }
//çıkarma
    static int minus() {
        int num1, num2;
        Scanner scan = new Scanner(System.in);
        System.out.println("1. sayıyı giriniz: ");
        num1 = scan.nextInt();
        System.out.println("2. sayıyı giriniz: ");
        num2 = scan.nextInt();
        int result = num1 - num2;
        System.out.println("sonuc: " + result);
        return result;
    }
//çarpma
    static void times() {
        int num1, num2;
        Scanner scan = new Scanner(System.in);
        System.out.println("1. sayıyı giriniz: ");
        num1 = scan.nextInt();
        System.out.println("2. sayıyı giriniz: ");
        num2 = scan.nextInt();
        int result = num1 * num2;
        System.out.println("sonuc: " + result);

    }
//bölme
    static void divided() {
        int num1, num2;
        Scanner scan = new Scanner(System.in);
        System.out.println("1. sayıyı giriniz: ");
        num1 = scan.nextInt();
        System.out.println("2. sayıyı giriniz: ");
        num2 = scan.nextInt();
        int result = num1 / num2;
        System.out.println("sonuc: " + result);

    }
//üstlü sayı
    static void power() {
        int num1, num2;
        Scanner scan = new Scanner(System.in);
        System.out.println("sayı giriniz: ");
        num1 = scan.nextInt();
        System.out.println("üst değerini giriniz: ");
        num2 = scan.nextInt();
        int result = 1;
        for (int i = num2; 0 < i; i--) {
            result *= num1;
        }
        System.out.println("sonuc: " + result);


    }
//faktoriyal
    static void factorial() {
        int result = 1, num1;
        Scanner scan = new Scanner(System.in);
        System.out.println("faktoriyel sayıyısını giriniz: ");
        num1 = scan.nextInt();
        for (int i = 1; i <=num1; i++) {
            result *= i;
        }
        System.out.println("sonuc: " + result);

    }
//mod
    static void mod() {
        int result = 1, num1, num2;
        Scanner scan = new Scanner(System.in);
        System.out.println("mod alınacak sayıyı giriniz: ");
        num1 = scan.nextInt();
        System.out.println("mod bölen sayıyı giriniz: ");
        num2 = scan.nextInt();
        result = num1 % num2;
        System.out.println("sonuç: " + result);

    }
//dikdörtgen alan ve çevre
    static void retangle() {
        int num1, num2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Taban değerini giriniz: ");
        num1 = scan.nextInt();
        System.out.println("Yükseklik değerini giriniz: ");
        num2 = scan.nextInt();

        int result = num1 * num2;
        int result2= (num1+num2)*2;
        System.out.println("alan:  " + result);
        System.out.println("çevre: "+result2);


    }
}
