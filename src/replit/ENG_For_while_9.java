package replit;

import java.util.Scanner;

public class ENG_For_while_9 {
    public static void main(String[] args) {
        /*        Write a java program to reverse the number which user entered.

Input :1238
Output :Reverse Of The Number: 8321 */

        Scanner scan=new Scanner(System.in);
        int sayi= scan.nextInt();
        int kalan=0;
        while (sayi>0){
            System.out.print(sayi%10);
            sayi/=10;

        }

    }
}
