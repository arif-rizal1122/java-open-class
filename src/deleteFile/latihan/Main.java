package deleteFile.latihan;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        System.out.print("masukan nama file nya = ");

        String namaFile = masuk.nextLine();
        String homeDir = System.getProperty("user.home");

        String dir = homeDir+"/Desktop/step_1/";

        File objFile = new File(dir+namaFile);

        boolean aksi = objFile.delete();
        if (aksi) {
            System.out.println("file berhasil dihapus ");
        } else {
            System.out.println("file gagal dihapus ");
        }


    }
}
