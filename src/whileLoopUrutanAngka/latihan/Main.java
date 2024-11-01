package whileLoopUrutanAngka.latihan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner masuk = new Scanner(System.in);
        int awal, akhir, hasil, split;
        System.out.print("masukan awal = ");
        awal = masuk.nextInt();
        System.out.print("masukan akhir = ");
        akhir = masuk.nextInt();
        split = 1;

        int a = awal;
        while (a <= akhir) {
            hasil = a % 2;
            if (hasil == 1) {
                System.out.print(a + " ");

            if (split == 5) {
                System.out.println("");
                split = 0;
            }
                split++;
          }
            a++;
        }
    }
}
