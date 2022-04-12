package replit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ENG_Method_Array_1 {
    public static void main(String[] args) {
        /*Write a return method to reverse number.

Input : 12345

Output : 54321*/
        Scanner scan=new Scanner(System.in);
        int sayi= scan.nextInt();
        ArrayList<Integer> num=new ArrayList<>();
        int kalan=0;
        while (sayi>0){
            kalan=sayi%10;
            sayi/=10;
            num.add(kalan);
        }
        for (int i = 0; i < num.size(); i++) {
            System.out.print(num.get(i));
        }
    }
}
