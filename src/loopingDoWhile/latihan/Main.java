package loopingDoWhile.latihan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner maasuk = new Scanner(System.in);
        int awal, akhir, a, hasil;
        System.out.print("masukan awal : ");
        awal = maasuk.nextInt();
        System.out.print("masukan nilai akhir : ");
        akhir = maasuk.nextInt();
        a = awal;
        do {
            hasil = a % 2;
            if (hasil == 0) {
                System.out.println("Halo semua se : " + a);

            }
            a++;
        } while (a <= akhir);



    }
}
