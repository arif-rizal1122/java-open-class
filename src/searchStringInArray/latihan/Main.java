package searchStringInArray.latihan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] a = {
          "tahu",
          "tempe",
          "ayam", "ayam",

          "labi",
          "burung",
        };
        Scanner masuk = new Scanner(System.in);
        int detect = 0;

        for (int i = 0; i < a.length; i++) {
            System.out.println((i+1) + ". " + a[i]);
        }

        System.out.println("______________________________________________________________");
        System.out.print("cari : ");
        String input = masuk.nextLine();

        for (int j = 0; j < a.length; j++) {
            if (input.equals(a[j])) {
                System.out.println("index ke - " + (j+1));
                detect++;
            }
        }
        if (detect == 0){
            System.out.println("data input dari - " + input + " - tidak ada di index nya");
        }


    }
}
