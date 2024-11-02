package deretFibornaciDgnForLoop.latihan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * FIBONACCI
         *
         * Deret bilangan yang mana bilangan saat ini adalah
         * penjumlahan dari 2 bilangan sebelumnya
         *
         * Contoh:
         * f1 = 0
         * f2 = 1
         * n  = 3
         *
         * f3 = f2 + f1
         *     = 1  + 0
         *     = 1
         * 0, 1, 1
         *
         * n  = 4
         * f4 = f(n-1) + f(n-2)
         *    = f3 + f2
         *    = 1  + 1
         *    = 2
         * 0, 1, 1, 2
         *
         * */

        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner masuk = new Scanner(System.in);

        // Mendeklarasikan variabel untuk dua bilangan pertama dalam deret Fibonacci
        int f1 = 0; // Bilangan pertama
        int f2 = 1; // Bilangan kedua
        int n; // Variabel untuk menyimpan jumlah bilangan Fibonacci yang akan dihasilkan

        // Meminta pengguna untuk memasukkan jumlah bilangan Fibonacci yang diinginkan
        System.out.print("masukan jumlah nya : ");
        n = masuk.nextInt(); // Membaca input jumlah dari pengguna

        int fn; // Variabel untuk menyimpan bilangan Fibonacci saat ini

        // Mencetak dua bilangan pertama dari deret Fibonacci
        System.out.print("deret fibonacci: ");
        System.out.print(f1 + ", "); // Mencetak f1
        System.out.print(f2); // Mencetak f2

        // Loop untuk menghitung dan mencetak deret Fibonacci
        for (int i = 1; i < n; i++) { // Loop dimulai dari 1 hingga n-1
            fn = f2 + f1; // Menghitung bilangan Fibonacci saat ini sebagai penjumlahan dari dua bilangan sebelumnya
            System.out.print(" , " + fn); // Mencetak bilangan Fibonacci saat ini

            // Memperbarui nilai f1 dan f2 untuk iterasi berikutnya
            f1 = f2; // f1 menjadi f2
            f2 = fn; // f2 menjadi bilangan Fibonacci saat ini (fn)
        }

        // Menutup objek Scanner untuk mencegah kebocoran sumber daya
        masuk.close();
    }
}