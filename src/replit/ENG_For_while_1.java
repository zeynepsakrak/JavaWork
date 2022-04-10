package replit;

import java.util.Scanner;

public class ENG_For_while_1 {
    //Ask user to enter a name and a character, then check how many times the character is repeated in the name using loops in the name
    //e.g:
    //char ch1= 'a' ;
    //String name =“John came late"
    //Expected Output: Number of a = 2
    //*Kullanıcıdan bir isim ve bir karakter girmesini isteyin,
   // ardından isimdeki döngüleri kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir isim giriniz");
        String name= scan.nextLine();
        System.out.println("lütfen bir karakter giriniz");
        char ch= scan.next().charAt(0);

        int sayac=0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i)==ch){
                sayac++;
            }

        }
        System.out.println(name+" isminde "+ch+" karakteri "+sayac+" defa vardır.");
    }
}
