package operatorUnary.tutorial;

public class Main {
    public static void main(String[] args) {
        // unary = operasi yg dilakukan pada satu variabel

        // unary + dan -
        int angka = 1;
        System.out.printf("unary minus '-', %d menjadi %d\n", angka, -angka ); //unary minus '-', 1 menjadi -1
        System.out.printf("unary plus '+', %d menjadi %d\n", angka, +angka );

        // unary decrement dan increment
        int angka2 = 10;
        angka2++;
        angka2++;
        System.out.println("unary increment 'plus.++' " + angka2); // hasilnya 12 karena di ++ dua kali

        int angka3 = 10;
        angka3--;
        System.out.println("unary decrement 'minus.--' " + angka3); // hasilnya 9 karena di --

        int a = 5;
        System.out.printf("nilai dengan '++' prefix menjadi = %d \n", ++a); // hasilnya 6 ( nilai nya akan ditambah baru ditamppilkan
        int b = 5;
        System.out.printf("nilai dengan '++' postfix menjadi = %d \n", b++); // hasilnya 5 karena akan dieksekusi ketika akan ditampilkan kembali
        System.out.printf("nilai dengan '++' postfix menjadi = %d \n", b); // hasilnya 6 karena sudah mengambil dari ++ yg pertama

        // unary yg digunakan di dalam boolean denga ! negasi
        boolean ucup = true;
        System.out.println("nilai boolean = " + ucup); // true
        System.out.println("nilai boolean = " + !ucup); // false
    }
}
