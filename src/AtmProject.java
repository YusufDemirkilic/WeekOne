import java.util.Scanner;

public class AtmProject {
    public static void main(String[] args) {
        // atm proje ad soyad alınacak
        // 3 defa yanlış girme hakkı olacak
        int right = 3;
        String userName, password;

        Scanner scanner = new Scanner(System.in);
        while (right > 0) {
            System.out.print("Username: ");
            userName = scanner.nextLine();
            System.out.print("Password: ");
            password = scanner.nextLine();
            //kullanıcı bilgileri doğru ise hesaba giriş yapılacak
            if (userName.equals("yusuf") && password.equals("password")) {
                System.out.println("sisteme giriş yapıldı.");
                System.out.println("Merhaba, Bankaya hoşgeldiniz." +
                        "\n 1. para yatırma " +
                        "\n 2. para çekme" +
                        "\n 3. bakiye sorgulama" +
                        "\n 4. çıkışyap \n");
                int balance, amount, select = scanner.nextInt();
                amount = 5000;
                // seçilen işleme göre case durumu çalışacak ve program bitecek
                switch (select) {
                    case 1:
                        System.out.println("Hesap bakiyesi: " + amount +
                                "\nLütfen yatırmak istediğiniz tutarı giriniz: ");
                        balance = scanner.nextInt();
                        amount += balance;
                        System.out.println("Toplam hesap bakiyesi: " + amount);
                        break;
                    case 2:
                        System.out.println("Hesap bakiyesi: " + amount +
                                "\nLütfen Çekmek istediğiniz tutarı giriniz: ");
                        balance = scanner.nextInt();
                        if (balance <= amount) {
                            System.out.println("paraç çekimi yapıldı, kalan tutar " + (amount - balance));

                        } else {
                            System.out.println("Çekilen tutatar hesap bakiyesinden  yüksek olamaz.");
                        }
                        break;
                    case 3:
                        System.out.println("Hesabınızdaki toplam bakiye: " + amount);
                        break;
                    case 4:
                        System.out.println("çıkış yapıldı");
                        break;
                    default:
                        System.out.println("Hatalı seçim yaptınız...");

                }

                break;
            }
            //hesap bilgisini 3 defa yanlış girerse hesabı bloke olacak
            else {
                System.out.println("Kullanıcı adı şifreniz yanış tekrar girin");
                right--;
                if (right == 0) {
                    System.out.println("hesabınız bloke olmuştur. lütfen banka ile iletişime geçiniz");
                } else {
                    System.out.println("kalan hakkınız: " + right);
                }
            }
        }
    }
}
