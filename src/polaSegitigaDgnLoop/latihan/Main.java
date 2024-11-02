package polaSegitigaDgnLoop.latihan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        System.out.println("masukan angka = ");
        int jml = masuk.nextInt();  // Mengatur jumlah baris segitiga
        // Loop pertama untuk mengatur jumlah baris
        System.out.println("_______________________________________");
        for (int i = 1; i <= jml; i++) {
            // Loop kedua untuk mencetak karakter 'x' di setiap baris
            for (int j = 1; j < i; j++) {
                System.out.print("x ");
            }
            // Mencetak karakter '0' dan pindah ke baris berikutnya
            System.out.println("0 ");
        }
    }
}
