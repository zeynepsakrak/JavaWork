package replit;

import java.util.Scanner;

public class ENG_For_while_4 {
    public static void main(String[] args) {
        /*Write a return method that accepts an integer as input and calculates factorial and prints like output.

Input : 6

Output: 6!=65432*1=720  */
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz: ");
        int a= scan.nextInt();
        int fak=1;
        for (int i = 1; i<=a ; i++) {
            fak = fak * i;
        }
        System.out.println(a+" sayısının faktoriyeli= "+fak);
    }
}
