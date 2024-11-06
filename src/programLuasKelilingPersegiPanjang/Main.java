package programLuasKelilingPersegiPanjang;

import java.util.Scanner;

public class Main {

    public  static  double Luas(double p, double l) {
        double L = p * l;
        return L;
    }

    public static double Keliling(double p, double l){
        double K = 2 * (p + l);
        return K;
    }

    public static void TLuas(double p, double l){
        System.out.println("L = p x l" );
        System.out.println("L = " +p+ " x " +l);
        System.out.println("L = " +Luas(p, l));
    }

    public static void TKeliling(double p, double l) {
        System.out.println("K = (2 x p) + (2 x l)");
        System.out.println("K = (2 x " +p+ ") + ( 2 x " + l + " )");
        System.out.println("K = " + Keliling(p, l));
    }


    public static void main(String[] args) {
        /**
         *
         * L = p x l
         * K = (2 x p) + (2 x 1)
         *
         *
         * */

        double L, K, p, l;
        Scanner masuk = new Scanner(System.in);
        System.out.print("masukan panjang = ");
        p = masuk.nextInt();
        System.out.print("masukan luas = ");
        l = masuk.nextInt();

        System.out.println("LUAS = ");
        TLuas(p, l);
        System.out.println("___________________________________________________________________________");
        System.out.println("KELILING = ");
        TKeliling(p, l);





    }
}
