package polaPersegiDgnLoop.latihan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner masuk = new Scanner(System.in);

      int jml, awal;

        System.out.print("masukan awal = ");
        awal = masuk.nextInt();
        System.out.print("masukan angka akhir nya = ");
        jml = masuk.nextInt();


        for (int i = awal; i <= jml; i++) {
            for (int j = awal; j <= jml; j++) {
                System.out.print("x ");
            }
            System.out.println("0 ");
        }
        masuk.close();
    }
    /** 1 dan 5
     * x x x x x 0
     * x x x x x 0
     * x x x x x 0
     * x x x x x 0
     * x x x x x 0
     *
     * */
}
