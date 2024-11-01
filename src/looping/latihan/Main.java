package looping.latihan;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    // looping (a+=2) kelipatan (a++) increment (a--) decrement
        Scanner masuk =  new Scanner(System.in);

        int awal, akhir;

        System.out.println("print angka");
        System.out.println("awal  : ");
        awal = masuk.nextInt();
        System.out.println("akhir : ");
        akhir = masuk.nextInt();

        for (int a = awal; a <= akhir; a++) {
            System.out.println("variabel  -  a  :" + a); // 2, 4, 6 --> 10;
        }

    }
}
