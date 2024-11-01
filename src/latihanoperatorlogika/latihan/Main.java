package latihanoperatorlogika.latihan;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        /**
         * membuat sebuah object untuk menangkap input dari user
         *
         * */
        System.out.println("========== <><>______<><> ===========");

         Scanner inputUser = new Scanner(System.in);
         int nilaiBenar = 6;
         int nilaiTebakan;
         boolean statusTebakan;

         System.out.println("masukan nilai tebakan anda: ");
         nilaiTebakan =  inputUser.nextInt();
         System.out.println("nilai tebakan nya adalah " + nilaiTebakan);

         // operasi logika
         statusTebakan = (nilaiTebakan == nilaiBenar);
         System.out.println("tebakan anda = " + statusTebakan);

         // operasi aljabar boolean (true / false)

         System.out.println("masukan nilai diantar 4 dan 9");
         nilaiTebakan = inputUser.nextInt();
         statusTebakan = (nilaiTebakan > 4 ) && (nilaiTebakan < 9);
         System.out.println("tebakan anda : " + statusTebakan);
    }
}
