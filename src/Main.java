import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int num,clonnum,step=0,divide=1,remainder,total=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Pleas enter number: ");
        num=scanner.nextInt();
        // kullanıcıdan alınan sayıyı clon bir sayıya aktarıyoruz
        clonnum=num;
        while((num  !=0)){
            //basamk bulmak için her seferinde 10a bölüp kalan ile basamak değerini öğreniyoruz
            divide = num/10;
            num=divide;
            step++;
            System.out.println(step);
        }
        // basamk sayısınca clon sayının basamk değerlerini topluyoruz
        for (int i=0;i<step;i++){
            remainder= clonnum%10;
            total +=remainder;
            clonnum= clonnum/10;
            System.out.print(remainder+"+");
        }
        System.out.println("= "+total);


}
}