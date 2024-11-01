package ifElse2.latihan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    // if else if statment
        Scanner inputUser = new Scanner(System.in);
        System.out.println("masukan angka");
        int a = inputUser.nextInt();
        if (a == 5) {
            System.out.println("nilai 5");
        } else if (a > 10 && a < 20) {
            System.out.println("masih adalah ruang");
        } else if (a >= 20) {
            System.out.println("kebesaran");
        } else {
            System.out.println("terserah deh");
        }
        inputUser.close();
    }
}
