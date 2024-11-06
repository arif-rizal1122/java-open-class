package randomInJava.latihan; // Mendefinisikan paket untuk kelas ini

import java.util.Random; // Mengimpor kelas Random untuk menghasilkan angka acak
import java.util.Scanner; // Mengimpor kelas Scanner untuk input dari pengguna (meskipun tidak digunakan dalam kode ini)

public class Main { // Mendefinisikan kelas utama

    public static void main(String[] args) { // Metode utama yang dijalankan saat program dieksekusi

        Random acak = new Random(); // Membuat objek Random untuk menghasilkan angka acak

        // Mendefinisikan array string yang berisi nama-nama buah
        String buah[] = {
                "mangga",
                "jeruk",
                "apel",
                "jeruk",
                "pepaya"
        };

        // Mendeklarasikan variabel untuk batasan dan indeks
        int angka, batas, x = 0, y = buah.length; // x diinisialisasi dengan 0, y diisi dengan panjang array buah
        System.out.println(y); // Menampilkan panjang array buah (jumlah elemen dalam array)

        // Menghasilkan angka acak antara 0 dan y-1 (indeks array)
        angka = x + (int) (Math.random() * ((y - x) + 1)); // Menghitung angka acak
        // Math.random() menghasilkan angka acak antara 0.0 (inklusif) dan 1.0 (eksklusif)
        // Dengan mengalikan dengan (y - x + 1), kita mendapatkan rentang dari 0 hingga y (inklusif)
        // Kemudian kita menambahkan x (0) untuk mendapatkan rentang yang diinginkan

        // Menampilkan buah yang dipilih secara acak berdasarkan indeks yang dihasilkan
        System.out.println(buah[angka]); // Menampilkan nama buah yang terpilih secara acak
    }
}