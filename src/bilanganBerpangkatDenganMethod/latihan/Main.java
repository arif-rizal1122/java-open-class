package bilanganBerpangkatDenganMethod.latihan;

import java.util.Scanner;

public class Main {

    public static int pangkat(int a, int p){
        int hasil = a ;

        for (int i = 1; i < p; i++) { // angka * angka * angka
            hasil *= a;
        }
        return hasil;
    }

    public static void TPangkat(int a, int p){
        System.out.println(a + " pangkat " +p+ " = " );
        System.out.println(pangkat(a, p));
    }


    public static void main(String[] args) {
       int angka, pangkat, hasil;
       Scanner masuk = new Scanner(System.in);
        System.out.print("masukan angka = ");
       angka = masuk.nextInt();
        System.out.print("masukan pangkat = ");
       pangkat = masuk.nextInt();

       TPangkat(angka, pangkat);

    }
}
