package projects;

import java.io.OptionalDataException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Registration {
    private static OptionalDataException zaman;

    public static void main(String[] args) {
        List<String> userReg= new ArrayList<>();
        List<Integer> zaman= new ArrayList<>();
        String User= " ";
        register(zaman,userReg,User);
        printHappyUsers(zaman, userReg);
    }

    private static void register(List<Integer> zaman, List<String> userReg, String User) {
        LocalDateTime tm = null;
        Scanner scan = new Scanner(System.in);
        String dewamkee;
        do {
            System.out.print("kullanıcı giriniz : ");
            User = scan.next();
            LocalTime Tm= LocalTime.now();
            System.out.println(Tm);
            userReg.add(User);
            zaman.add(Tm.getSecond());
            System.out.println("baska kullanıcı varmı? : E/H");
            dewamkee = scan.next();
        } while (dewamkee.equalsIgnoreCase("E"));
        return;
    }

    private static void printHappyUsers(List<Integer> zaman, List<String> userReg) {

        Integer zamanArr[] =(zaman.toArray(new Integer[0]));
        for (int i = 0; i < zamanArr.length; i++) {
            if (zamanArr[i]<=10) {
                System.out.println(zamanArr[i]);
                System.out.println("şanslı kullanici senii " +userReg.get(i));
            }
        }
    } }

