package projects;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P05 {

    /*
        Given int array
        remove the duplicated values from the array
        print non-duplicated array length
        for example:
        Array is 1,2,2,2,3,3,3,4,4,4,5,5,5
//1 2 2 2 3 3 3 4 4 4 5 5 5
        result should be 5
        NOTE: while printing the result dont use for loop
        use System.out.println(Arrays.toString(your_array_name));
     */


    /*
       Verilen int array
       duplicated(tekrarlanan) öğeleri array den kaldır
      non-duplicated(tekrarlanmayan) öğe sayisini print et
       Örnek:
       Array is 1,2,2,2,3,3,3,4,4,4,5,5,5
       //1 2 2 2 3 3 3 4 4 4 5 5 5
       result  5 olmalı
       NOT: resultu print ederken for loop kullanmayın
       System.out.println(Arrays.toString(your_array_name));  kullanın
    */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String myStr = scan.nextLine();

        String[] arr = myStr.split(" ");

        int[] useThisArray = new int[arr.length];

        for (int i = 0; i < useThisArray.length; i++) {

            int num = Integer.parseInt(arr[i]);

            useThisArray[i] = num;

        }


//        code start here
//        dont change anything before this line
//        your Array is useThisLine

        // Kodlamaya burdan başla.bu satırdan önceki satirlarda hicbirşeyi  degiştirme.
        //   useThisLine arrayini kullan



        //System.out.println(Arrays.toString(useThisArray));
        Arrays.sort(useThisArray);
        //System.out.println(Arrays.toString(useThisArray));

        int count=0;
        ArrayList<Integer> your_array_name= new ArrayList<Integer>();
        for (int i = 0; i <  useThisArray.length; i++) {
            count=0;
            for (int j = 0; j < useThisArray.length; j++) {
                if(useThisArray[i] == useThisArray[j]){
                    count++;
            }
            }

            if(i!=0 && useThisArray[i-1]!=useThisArray[i])
            {
                System.out.println(String.format("%d 'den %d tane var.", useThisArray[i], count));
                your_array_name.add(useThisArray[i]);
            }
            if(i==0 && useThisArray[i+1]!=useThisArray[i])
            {
                your_array_name.add(useThisArray[i]);
                System.out.println(String.format("%d 'den %d tane var.", useThisArray[i], count));
            }

        }
        System.out.println(" tekrarsız eleman sayısı "+ your_array_name.size());
        System.out.println(your_array_name);

    }
}