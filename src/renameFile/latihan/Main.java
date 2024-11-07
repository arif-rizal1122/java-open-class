package renameFile.latihan;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        String homeDir =System.getProperty("user.home");
        String dir = homeDir+"/Desktop/step_1/";
        String awal_, akhir_, ulang;



        do {
            System.out.println("ubah nama file");
            System.out.print("awal = ");
            awal_ = masuk.nextLine();
            System.out.print("menjadi = ");
            akhir_ = masuk.nextLine();

            File awal = new File(dir+awal_);
            File ubah = new File(dir+akhir_);
            boolean aksi = awal.renameTo(ubah);

            System.out.println("==============================");
            if (aksi == true) {
                System.out.println("berhasil rename file ");
            } else {
                System.out.println("gagal rename file ");
            }
            System.out.println("pilih lanjutkan y/n");
            ulang = masuk.nextLine();

        } while (ulang.equalsIgnoreCase("y"));
        System.out.println("proses selesai : ");



        System.out.println("==============================");
        File f = new File(dir);
        String[] daftar = f.list();

        for (int i = 0; i < daftar.length; i++) {
            System.out.println(daftar[i]);
        }




    }
}
