import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class PalindromNuber {
    static boolean isPalindrom(int number){
        int temp=number,reversnumber=0,lastnumber;
        while(temp !=0){
            lastnumber=temp %10;
            reversnumber=(reversnumber*10)+lastnumber;
            temp /=10;
        }
        if (reversnumber==number)
        return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("lütfen bir sayı giriniz: ");
        int number=scanner.nextInt();
        System.out.println("palindrom sayımı: "+isPalindrom(number));



    }
}
