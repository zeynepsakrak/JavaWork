package replit;

public class ENG_For_while_5 {
    public static void main(String[] args) {
        /* Print even numbers from 20 to 0 but do not use decrement (i--).

OUTPUT : Even Numbers from 100 to 0 are: 20 18 16 14 12 10 8 6 4 2 0  */
        int s=20;
        System.out.println("20'den 0'a kadar olan çift sayılar");
        for (int i = 0; i <= s ; i++) {
            if (i%2==0){
                System.out.print(i+" ");
            }}
    }
}
