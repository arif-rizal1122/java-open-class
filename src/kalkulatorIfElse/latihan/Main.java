package kalkulatorIfElse.latihan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int pil, porsi, harga = 0;
        Scanner masuk = new Scanner(System.in);

        System.out.println("menu makanan");
        System.out.println("1. bakso\n2. mie ayam");
        System.out.println("pilih: ");
        pil = masuk.nextInt();

        switch (pil) {
            case 1:
                System.out.println("porsi : ");
                porsi = masuk.nextInt();
                System.out.println("bakso (5k/porsi)");
                harga = 500 * porsi;
                break;
            case 2:
                System.out.println("porsi : ");
                porsi = masuk.nextInt();
                System.out.println("mie ayam (10k/porsi)");
                harga = 700 * porsi;
                break;
            default:
                System.out.println("pilihan salah");
                break;
        }
        System.out.println("total : Rp." + harga);

    }
}
