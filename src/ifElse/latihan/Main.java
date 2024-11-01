package ifElse.latihan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner userInput = new Scanner(System.in);
    int a = userInput.nextInt();

    System.out.println("masukan nilai = ");

    // ini adalah cabangnya
        if (a == 5 ) {
            System.out.println("ini nilai " + a);
        } else {
            System.out.println("ini nilai selain angka 5 = "  + a);
        }
        System.out.println("selesai");
    }
}
