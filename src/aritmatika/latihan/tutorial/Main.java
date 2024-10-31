package aritmatika.latihan.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("===== SCANNER LOCAL LIBRARY ======");
        Scanner userInput = new Scanner(System.in);
        //        int input = userInput.nextInt();
        //        System.out.println("input = " + input);

        //        int input2 = userInput.nextInt();
        //        System.out.println("input = " + input2);

        System.out.println("===== SCANNER LOCAL LIBRARY ======");
        System.out.println("panjang = ");
        int panjang = userInput.nextInt();
        System.out.println("lebar = " );
        int lebar = userInput.nextInt();

        int luas = panjang + lebar;
        System.out.println("luas = " + luas);

    }
}
