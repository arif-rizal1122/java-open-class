package DowhileLatihan.latihan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nama, alamat, loop;

        do {
            Scanner masuk = new Scanner(System.in);
            System.out.print("nama : ");
            nama = masuk.nextLine();
            System.out.print("alamat : ");
            alamat = masuk.nextLine();
            System.out.println(" _________________________________________________________________");
            System.out.println(nama + " tingal di " + alamat);
            System.out.println("ulang y/n: ");
            loop = masuk.nextLine();
            if (!loop.equalsIgnoreCase("y") && !loop.equalsIgnoreCase("n")) {
                System.out.println("YTTA");
            }
            System.out.println("proggram selesai");
        } while (loop.equalsIgnoreCase("y"));






    }
}
