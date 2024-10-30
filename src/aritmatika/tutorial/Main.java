package aritmatika.tutorial;

public class Main {
    public static void main(String[] args) {
        /**
         * Operasi Arimatika
         *
         * - penjumlahan
         * - pengurangan
         * - perkalian
         * - pembagian
         * - modulus
         * **/

        int variable1 = 5;
        int variable2 = 6;

        int hasil;
        // penjumlahan
        hasil = variable1 + variable2;
        System.out.println(variable1 + "+" + variable2 + "=" + hasil);
        // pengurangan
        hasil = variable1 - variable2;
        System.out.println(variable1 + "-" + variable2 + "=" + hasil);
        System.out.printf(" %d - %d = %d \n", variable1, variable2, hasil);

        // perkalian
        hasil = variable1 * variable2;
        System.out.println(variable1 + "*" + variable2 + "=" + hasil);

        // pembagian
        hasil = variable1 / variable2;
        System.out.println(variable1 + "/" + variable2 + "=" + hasil);
    }
}
