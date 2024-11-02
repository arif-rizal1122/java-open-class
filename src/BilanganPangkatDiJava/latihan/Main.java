package BilanganPangkatDiJava.latihan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        int bil, pangkat, hasil;
        System.out.print("masukan bilangan : ");
        bil = masuk.nextInt();
        System.out.print("masukan pangkatnya : ");
        pangkat = masuk.nextInt();
        hasil = bil;

        for (int i = 1; i < pangkat ; i++) {
           hasil *= bil;
        }
        System.out.println(hasil);
    }
}
