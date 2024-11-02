package NilaiMaxdanMin.latihan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner masuk = new Scanner(System.in);

        // Mendeklarasikan variabel untuk menyimpan jumlah angka, angka yang dimasukkan, nilai maksimum, dan nilai minimum
        int jml, angka, max = 0, min = 100; // max diinisialisasi dengan 0 dan min dengan 100 sebagai nilai awal

        // Meminta pengguna untuk memasukkan jumlah angka yang akan dimasukkan
        System.out.print("jumlah angka = ");
        jml = masuk.nextInt(); // Membaca jumlah angka dari input pengguna

        // Mencetak garis pemisah untuk kejelasan output
        System.out.println("___________________________________________");

        // Loop untuk meminta input angka dari pengguna
        for (int i = 1; i <= jml; i++) { // Loop dari 1 hingga jml (inklusif)
            System.out.print("angka ke- = " + i + ": "); // Mencetak pesan untuk meminta angka ke-i
            angka = masuk.nextInt(); // Membaca angka yang dimasukkan oleh pengguna

            // Memeriksa apakah angka yang dimasukkan lebih besar dari nilai maksimum saat ini
            if (angka > max) {
                max = angka; // Jika ya, perbarui nilai maksimum
            }

            // Memeriksa apakah angka yang dimasukkan lebih kecil dari nilai minimum saat ini
            if (angka < min) {
                min = angka; // Jika ya, perbarui nilai minimum
            }
        }

        // Mencetak garis pemisah untuk kejelasan output
        System.out.println("____________________________________________");

        // Mencetak nilai maksimum dan minimum yang ditemukan
        System.out.println("nilai maks = " + max);
        System.out.println("nilai min = " + min);

        // Menutup objek Scanner untuk mencegah kebocoran sumber daya
        masuk.close();
    }
}