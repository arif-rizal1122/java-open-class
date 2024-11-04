package minMaxPadaArray.latihan; // Deklarasi paket, menyatakan bahwa kelas ini adalah bagian dari paket 'minMaxPadaArray.latihan'

import java.util.Arrays; // Mengimpor kelas Arrays dari paket java.util untuk manipulasi array
import java.util.Collections; // Mengimpor kelas Collections dari paket java.util untuk operasi koleksi

public class Main { // Deklarasi kelas publik Main
    public static void main(String[] args) { // Deklarasi metode utama yang akan dieksekusi saat program dijalankan
        // Mendefinisikan array Integer dengan nama 'a' dan menginisialisasinya dengan nilai 0 sampai 9
        Integer [] a = {0,1,2,3,4,5,6,7,8,9};

        // Mengonversi array 'a' menjadi daftar (List) menggunakan Arrays.asList() dan mencari nilai maksimum dalam daftar menggunakan Collections.max()
        int max  = Collections.max(Arrays.asList(a));

        // Mengonversi array 'a' menjadi daftar (List) menggunakan Arrays.asList() dan mencari nilai minimum dalam daftar menggunakan Collections.min()
        int min  = Collections.min(Arrays.asList(a));

        // Mencetak nilai maksimum yang ditemukan ke konsol
        System.out.println(max);

        // Mencetak nilai minimum yang ditemukan ke konsol
        System.out.println(min);
    }
}
