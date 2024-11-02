package nilaiRata2PadaArray.latihan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);

        System.out.println("masukan jumlah array : ");
        int jmlIndex = masuk.nextInt();
        int[] a = new int[jmlIndex];
        int total = 0;
        double rata2;
        /**
         * rumus mencari nilai rata-rata
         *
         * rata-rata = total / jumlah;
         *           = (5 + 7 + 3 + 1 + 8 + 9) 34 / 6
         *           =
         * */

        for (int i = 0; i < jmlIndex; i++) {
            System.out.print("masukan nilai untuk index ke " + i + " ");
            a[i] = masuk.nextInt();
            total += a[i];
        }

        rata2 = (double) total/jmlIndex;
        System.out.println("________________________");
        System.out.print("deret angka : ");

        for (int f = 0; f < jmlIndex; f++) {
            System.out.print(a[f]);
            if (f < jmlIndex -1){
                System.out.print(" ");
            }
        }
        System.out.println(" ");
        System.out.println("nilai rata-rata " + rata2);
        masuk.close();
    }
}
