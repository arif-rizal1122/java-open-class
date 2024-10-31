package operatorAssignment.tutorial;

public class Main {
    public static void main(String[] args) {
        // operator assignment atau =

        // assignment operator jumlah
        int a = 1;
        a += 10;
        System.out.println("nilai = " + a); // hasilnya 11

        // assignment operator pengurangan
        int b = 100;
        b -= 10;
        System.out.println("nilai = " + b);  // hasilnya 90

        // assignment operator pembagian
        int c = 100;
        c /= 10;
        System.out.println("nilai = " + c);  // hasilnya 90

        // assignment operator perkalian
        int d = 100;
        d *= 10;
        System.out.println("nilai = " + d);  // hasilnya 1000

        // assignment operator modulus
        int e = 10;
        e %= 7; // Ketika Anda menggunakan operator modulus, Anda membagi bilangan pertama dengan bilangan kedua dan mengambil sisa dari pembagian tersebut. Misalnya, jika Anda memiliki a % b, hasilnya adalah sisa dari a dibagi b
        System.out.println("nilai = " + e);  // hasilnya 3 karena
    }
}
