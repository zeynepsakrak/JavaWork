package deneme;

import java.util.*;

public class D01 {


    public static void main(String[] args) {
        /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
         *  1. Kullanicidan ismini isteyelim
         *  2. Kullanici adindaki bosluklari silelim.
         *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
         *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
         *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.

         */

        Scanner scan=new Scanner(System.in);
        List<String> isimList = new ArrayList<>();
        System.out.println("lütfen 3 isim giriniz");
        for (int i = 0; i <3 ; i++) {
            System.out.println("ismi giriniz:");
            String isim=scan.nextLine().trim();

            if(isimList.contains(isim)){
                Random r=new Random(); //random sınıfı
                int a=r.nextInt(10);
                System.out.println("tekrarlı kullanıcı var");
                isimList.add(isim+a);

            }else {
                System.out.println("kullanıma uygun");
                isimList.add(isim);
            }


        }
        System.out.println(isimList);



    }
}