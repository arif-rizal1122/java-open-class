package ganjilGenapLoopingFor.latihan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner masok = new Scanner(System.in);
        int awal, akhir, hasil;
        System.out.print("awal = ");
        awal = masok.nextInt();
        System.out.print("akhir = ");
        akhir = masok.nextInt();
        // Loop dari 0 sampai 10

        if (awal < akhir) {
            for (int i = awal; i < akhir; i++) {
                hasil = i % 2;
                if (hasil == 1) {
                    System.out.println(i +  "  hasil ganjil nya");
                }
             }
            } else {
            System.out.println(awal + " salah input");
        }
    }
}
