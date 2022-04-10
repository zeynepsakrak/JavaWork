package replit;

import java.util.Scanner;

public class ENG_For_while_2 {
    public static void main(String[] args) {
        /*Ask user to enter 2 integer then find GCD (Greatest Common Divisor) and LCM (Least Common Multiple)
        Kullanıcıdan 2 tamsayı girmesini ve ardından GCD'yi (En Büyük Ortak Bölen)
         ve LCM'yi (En Küçük Ortak Kat) bulmasını isteyin
Input :
30 and 40
Expected OutPut:
GCD for 30 and 40 = 10
LCM for 30 and 40 = 120
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen iki tam sayı giriniz");
        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();
        int GCD=1;
        int LCM=0;
        for (int i = 1; i <= sayi1&&i <= sayi2; ++i) {
            if (((sayi1 % i) == 0) && ((sayi2 % i) == 0)){
                GCD=i;
            }
        }
        LCM=(sayi1*sayi2)/GCD;
        System.out.println("GCD for "+ sayi1+ " and "+ sayi2+" = "+ GCD);
        System.out.println("LCM for "+ sayi1+ " and "+ sayi2+" = "+ LCM);
    }
}
