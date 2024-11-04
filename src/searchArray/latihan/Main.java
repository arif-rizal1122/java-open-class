package searchArray.latihan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        int [] a = {3,5,6,3,2,9,10};
        System.out.print("data : ");

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+ " ");
        }
        System.out.println("");
        System.out.println("masukan searching : ");
        int cari = masuk.nextInt(), count = 0;
        System.out.println("_______________________________________");
        System.out.println("hasil cari");

        for (int j = 0; j < a.length; j++) {
            if (cari == a[j]) {
                System.out.println("index-" + j);
                count++;
             }
            }
        if (count == 0) {
            System.out.println("data tidak ada");
        }
        }

}
