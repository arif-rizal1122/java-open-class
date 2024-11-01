package switchcase.latihan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);

        System.out.print("Masukkan nama: ");  // Tambahkan prompt sebelum menerima input
        String input = inputUser.nextLine();  // Menggunakan nextLine() untuk mengambil seluruh baris input

        System.out.println("Panggil nama: " + input);

        switch (input.toLowerCase()) {  // Menggunakan toLowerCase() untuk menangani input dengan huruf besar/kecil yang berbeda
            case "otong":
                System.out.println("Saya Otong hadir boss");
                break;
            case "ucup":
                System.out.println( input + "adalah saya, dan hadir bosq");
                break;
            default:
                System.out.println(input + " tidak hadir bossq");
                break;
        }

        System.out.println("Program selesai");

        inputUser.close();  // Menutup Scanner untuk menghindari kebocoran resource
    }
}
