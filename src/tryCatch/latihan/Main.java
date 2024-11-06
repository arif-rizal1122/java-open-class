package tryCatch.latihan;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String ulang;
        Scanner masuk = new Scanner(System.in);

         int x, y,  z;

        do {
        System.out.print("masukan nilai x nya = ");
        x = masuk.nextInt();
        System.out.print("masukan nilai y nya = ");
        y = masuk.nextInt();
            try {
                z = x / y;
                System.out.println("hasilnya : " + z);
                System.out.println("=======================================================");
            } catch (Exception e) {
                System.out.println("pembagi salah : ");
                System.out.println("error nya : ");
                e.printStackTrace();
            }
            System.out.println("pilih ulangi proggram y/n?");
            ulang = masuk.next();
            System.out.println("=======================================================");
        } while (ulang.equalsIgnoreCase("y"));




        System.out.println("proggram selesai : ");
        masuk.close();

    }
}
