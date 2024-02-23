import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {
      int number;
      double har=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter in number");
        number=scanner.nextInt();
        for (int i=1;i<=number;i++){
            har +=(1.0/i);
        }
        System.out.println(har);

    }
}
