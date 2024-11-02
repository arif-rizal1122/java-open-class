package ArrayInputOutput.latihan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        System.out.print("masukan jumlah index : ");
        int jmlIndex = masuk.nextInt();
        int [] a = new int[jmlIndex];
        System.out.print("masukan nilai untuk array nya = ");

        System.out.println("___________________________________");

        for (int i = 0; i < a.length; i++) {
            System.out.print("index ke " + i + " : ");
            a[i] = masuk.nextInt();
        }
        System.out.println("___________________________________");
        for (int j = 0; j < a.length; j++) {
            System.out.print(a[j] + " ");
        }

    }
}
