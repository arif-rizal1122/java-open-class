package penerapanProsedurDNfungsi.latihan;

import java.util.Scanner;

public class Main {

    public static void operasi(int a, int b) {
      int c;
        c = a + b;
        System.out.println(a + " tambah " + b + " = " + c);

        c = a - b;
        System.out.println(a + " kurang " + b + " = " + c);

        c = a * b;
        System.out.println(a + " kali " + b + " = " + c);

        c = a / b;
        System.out.println(a + " bagi " + b + " = " + c);
    }



    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);

        int a, b;

        System.out.print("masukan nilai a = ");
        a = masuk.nextInt();
        System.out.print("masukan nilai b = ");
        b = masuk.nextInt();

        operasi(a, b);


    }


}
