package minMaxArrayManual.latihan; // Deklarasi paket, menyatakan bahwa kelas ini adalah bagian dari paket 'minMaxArrayManual.latihan'

public class Main { // Deklarasi kelas publik Main
    public static void main(String[] args) { // Deklarasi metode utama yang akan dieksekusi saat program dijalankan
        // Mendefinisikan array 'a' dan menginisialisasinya dengan nilai 1 sampai 9
        int[] a = {1,2,3,4,5,6,7,8,9};

        // Mendapatkan jumlah elemen dalam array 'a'
        int jml = a.length;

        // Menginisialisasi variabel 'max_index' dan 'min_index' dengan nilai elemen pertama dari array
        int max_index = a[0], min_index = a[0];

        // Mencetak string "deret angka " tanpa baris baru
        System.out.print("deret angka ");

        // Melakukan iterasi melalui setiap elemen dalam array 'a'
        for (int i = 0; i < jml; i++) {
            // Mencetak setiap elemen dari array diikuti dengan spasi
            System.out.print(a[i] + " ");

            // Memeriksa apakah elemen saat ini lebih besar dari 'max_index'
            // Jika iya, memperbarui 'max_index' dengan elemen saat ini
            if (a[i] > max_index) {
                max_index = a[i];
            }

            // Memeriksa apakah elemen saat ini lebih kecil dari 'min_index'
            // Jika iya, memperbarui 'min_index' dengan elemen saat ini
            if (a[i] < min_index){
                min_index = a[i];
            }
        }

        // Mencetak baris baru
        System.out.println("");

        // Mencetak nilai maksimum yang ditemukan
        System.out.println(max_index);

        // Mencetak nilai minimum yang ditemukan
        System.out.println(min_index);
    }
}
