package fileProggram.latihan;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class JavaFile {
    public static void main(String[] args) {
          Scanner masuk = new Scanner(System.in);
          String namaFile;
          String extension;

          System.out.print("masukan nama file : ");
          namaFile = masuk.nextLine();
          System.out.println("masukan nama extension : ");
          extension = masuk.nextLine();

          try {
              File myobj = new File(namaFile+extension);
              if (myobj.createNewFile()) {
                  System.out.println("file berhasil dibuat : ");
              } else {
                  System.out.println("file gagal disimpan : ");
              }
          } catch (IOException e) {
              System.out.println("terjadi kesalahan");
              e.printStackTrace();
          }



    }
}