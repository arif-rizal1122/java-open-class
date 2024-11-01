package whileLoop.latihan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        for (int i = 0; i <=  10; i++) {
//            System.out.println(i + " kali dipanggil a");
//        }
        Scanner masuk = new Scanner(System.in);
        int awal, akhir;
        System.out.print("masukan angka awal : ");
        awal = masuk.nextInt();
        System.out.print("masukan angka akhir : ");
        akhir = masuk.nextInt();
        int b = awal;
        if (awal < akhir) {
            while (b <= akhir) {
                System.out.println(b + " kali di panggil b");
                b++;
            }
        }  else if (awal > akhir){
            while (b >= akhir) {
                System.out.println(b + " kali di panggil b");
                b--;
            }
        } else {
            System.out.println("salah tipe data");
        }
        masuk.close();
    }
}
