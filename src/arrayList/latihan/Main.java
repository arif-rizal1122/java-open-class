package arrayList.latihan;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        int[] nomor = new int[3];
//        nomor[2] = 10;
//        nomor[1] = 5;
//        nomor[0] = 1;
//
//        System.out.println(nomor[0]);
//        System.out.println(nomor[1]);
//        System.out.println(nomor[2]);


        // Membuat ArrayList untuk menyimpan nama-nama buah
        ArrayList<String> buah = new ArrayList<>();
        // Menambahkan elemen ke dalam ArrayList
        buah.add("mangga"); // Menambahkan "mangga" ke dalam list
        buah.add("jeruk");  // Menambahkan "jeruk" ke dalam list
        buah.add("apel");   // Menambahkan "apel" ke dalam list

        // Menghapus elemen pertama (index 0) dari ArrayList
        buah.remove(0); // Menghapus "mangga", sehingga "jeruk" menjadi elemen pertama

        buah.set(1, "ubah jeruk"); // cara mengubah elemet index ke 1

        // Inisialisasi variabel x untuk menghitung index
        int x = 0;

        // Menggunakan enhanced for loop untuk iterasi melalui elemen dalam ArrayList
        for (String i : buah) {
            // Mencetak index dan nilai elemen saat ini
            System.out.println("index ke " + x + ": " + i);
            x++; // Meningkatkan nilai x untuk index berikutnya
        }

        // Mencetak jumlah elemen yang tersisa dalam ArrayList
        System.out.println("jumlah : " + buah.size()); // Menampilkan jumlah elemen yang tersisa

    }
}

