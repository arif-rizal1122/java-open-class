import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double x[] = {4, 5, 6, 7, 4, 2, 6, 1}; // Array yang akan diurutkan

        // Mencari nilai maksimum dan minimum
        double mx = x[0]; // Inisialisasi mx dengan elemen pertama
        double mn = x[0]; // Inisialisasi mn dengan elemen pertama

        for (int i = 0; i < x.length; i++) {
            mx = Math.max(mx, x[i]); // Mencari nilai maksimum
            mn = Math.min(mn, x[i]); // Mencari nilai minimum
        }

        // Mengurutkan array dari yang terkecil ke yang terbesar
        Arrays.sort(x); // Mengurutkan array dari yang terkecil

        // Menampilkan hasil
        System.out.println("Nilai maksimum: " + mx); // Menampilkan nilai maksimum
        System.out.println("Nilai minimum: " + mn); // Menampilkan nilai minimum
        System.out.println("Array yang diurutkan dari yang terkecil: " + Arrays.toString(x)); // Menampilkan array yang sudah diurutkan

        // Membalikkan array untuk mendapatkan urutan dari yang terbesar ke yang terkecil
        double[] reversed = new double[x.length];
        for (int i = 0; i < x.length; i++) {
            reversed[i] = x[x.length - 1 - i]; // Mengisi array terbalik
        }

        // Menampilkan hasil
        System.out.println("Array yang diurutkan dari yang terbesar: " + Arrays.toString(reversed)); // Menampilkan array yang sudah diurutkan
    }
}