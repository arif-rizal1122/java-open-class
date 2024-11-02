package mencariNilaiRataRata.latihan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner masuk = new Scanner(System.in);

        System.out.print("masukan berpa nilai yg mau dijumlahkan = ");
        // Mendeklarasikan variabel 'jml' untuk jumlah nilai yang akan dimasukkan
        int jml = masuk.nextInt(); // Dalam hal ini, kita akan meminta 3 nilai
        double nilai, total = 0, rerata; // 'nilai' untuk menyimpan nilai yang dimasukkan, 'total' untuk menyimpan jumlah total nilai

        // Loop untuk meminta input nilai dari pengguna
        for (int i = 1; i <= jml; i++) {
            // Mencetak pesan untuk meminta pengguna memasukkan nilai ke-i
            System.out.print(" nilai ke = " + i + ": ");
            // Membaca nilai yang dimasukkan oleh pengguna dan menyimpannya dalam variabel 'nilai'
            nilai = masuk.nextDouble();
            // Menambahkan nilai yang dimasukkan ke dalam total
            total += nilai; // total = total + nilai
        }
        rerata = total/ jml;
        // Mencetak total dari semua nilai yang dimasukkan
        System.out.println("total = " + total);
        System.out.println("rerata = " + rerata);
        // Menutup objek Scanner untuk mencegah kebocoran sumber daya
        masuk.close();
    }
}