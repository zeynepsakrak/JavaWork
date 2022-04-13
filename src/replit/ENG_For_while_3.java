package replit;

import java.util.*;

import static deneme.D02.tekrarsizListeOlustur;

public class ENG_For_while_3 {
    public static void main(String[] args) {
        /*Write a code that returns the duplicate chars in a String array.(interview Question)
Input :
String str=“Javaisalsoeasy”
Output: [a, s]*/
        String str="Javaisalsoeasy";
        System.out.println(str);
        String characters="";
        String harf="";
        for (int i = 0; i <str.length() ; i++) {
            String encoktekraredenharf=Character.toString(str.charAt(i));
            if (characters.contains(encoktekraredenharf)){
                if (!harf.contains(encoktekraredenharf)){
                    harf+=encoktekraredenharf + ",";
                }
            }
            characters+=encoktekraredenharf;
        }
        System.out.println(harf);
    }
        }


