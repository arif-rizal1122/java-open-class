package proggramDiskonDenganMethodProsedurDnFungsi.latihan;


import java.util.Scanner;

public class Main {

    public  static double hitungDISKON(double harga, double diskon){
        double x = harga * (diskon / 100); // ( 0.1%)
        double hasil = harga -= x;
        return  hasil;
    }

    public static void ThitungDISKON(double harga, double diskon){
        System.out.println("harga barang = Rp." + harga);
        System.out.println("diskon       = " + diskon + " %");
        System.out.println(" x = " + harga + " x (" + diskon + " / 100 )");
        System.out.println(hitungDISKON(harga, diskon));
    }

    public static void main(String[] args) {
        double harga, diskon, x;
        Scanner masuk = new Scanner(System.in);

        System.out.print("masukan harga : ");
        harga = masuk.nextDouble();
        if (harga > 500000){
            diskon = 15;
        } else if (harga >= 100000) {
            diskon = 10;
        } else {
            diskon = 0;
        }


//        System.out.print("masukan diskon : ");
//        diskon = masuk.nextDouble();

        System.out.println("________________________________");

        ThitungDISKON(harga, diskon);
        System.out.println("--------------------------------");
        System.out.println("harga asli : ");
        System.out.println(harga);

    }
}
