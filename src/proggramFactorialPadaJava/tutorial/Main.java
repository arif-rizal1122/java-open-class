package proggramFactorialPadaJava.tutorial;

public class Main {
    public static void main(String[] args) {
        /**
         * Bilangan faktorial
         *
         * 5! = 5 x 4 x 3 x 2 x 1
         *    = 120
         * 3! = 3 x 2 x 1
         *    = 6
         * */

        // Mendeklarasikan variabel 'angka' yang akan dihitung faktorialnya
        int angka = 5; // Misalnya, kita ingin menghitung 5!

        // Inisialisasi variabel 'hasil' dengan nilai awal sama dengan 'angka'
        int hasil = angka; // 'hasil' akan menyimpan hasil faktorial

        // Mencetak nilai faktorial yang sedang dihitung
        System.out.println(angka + "! = ");

        // Loop untuk menghitung faktorial
        for (int i = angka; i > 0; i--) {
            // Mencetak nilai 'i' saat ini
            System.out.print(i);

            // Jika 'i' lebih besar dari 1, cetak " x " untuk memisahkan angka
            if (i > 1) {
                System.out.print(" x ");
            }

            // Jika 'i' tidak sama dengan 'angka', kalikan 'hasil' dengan 'i'
            // Ini mencegah penggandaan angka awal (angka) pada hasil
            if (angka != i) {
                hasil *= i; // Mengalikan hasil dengan nilai 'i'
            }
        }

        // Mencetak baris baru setelah loop selesai
        System.out.println("");

        // Mencetak hasil akhir dari faktorial
        System.out.println("hasil = " + hasil);
    }
}