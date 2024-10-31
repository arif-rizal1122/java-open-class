package pengelompokanOperasiAritmatika.latihan;

public class Main {
    public static void main(String[] args) {
        /**
         *  belajar memahami urutan eksekusi dari opertor-operator
         *
         *  perkalian dan perkalian akan dilakukan pertama kali.
         *
         * */
        int hasil = 2 * 5 +10;
        System.out.println(hasil); // hasil 20

        System.out.println("==========>>>>>>><<<<<<<<<==========");
        int hasil1 = 10 / 2 - 2 * 5;
        System.out.println(hasil1); // 5 - 10 = -5

        System.out.println("==========>>>>>>><<<<<<<<<==========");
        int hasil2 = 10 / 2  * 5;
        System.out.println(hasil2); // 5 * 5 = 25

        System.out.println("==========>>>>>>><<<<<<<<<==========");
        int hasil3 = 10 - 2 + 5 / 5 * 2;
        System.out.println(hasil3); // 5 * 2 = 10 / 7 = 1 - 12

        System.out.println("==========>>>>>>><<<<<<<<<==========");
        int hasil4 = (10 - 2) + 5 / 5 * 2;
        System.out.println(hasil4); // 10 - 2 = 8 / 5 = 1 * 10 = 10

    }
}
