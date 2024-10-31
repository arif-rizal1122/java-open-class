package operatorLogika.tutorial;

public class Main {
    public static void main(String[] args) {
        // operator logika adl operasi yg kota bisa lakukan terhadp tipe data boolean
        // AND, OR, XOR, negasi

        // or ||
        /**
         *  a        b        c
         *  _____________________
         *  0    +   0    =    0  false
         *  0    +   1    =    1  true
         *  1    +   0    =    1  true
         *  1    +   1    =    1  true
         *
         * */

        // and &&
        /**
         *  a        b        c
         *  _____________________
         *  0    *   0    =    0  false
         *  0    *   1    =    0  false
         *  1    *   0    =    0  false
         *  1    *   1    =    1  true
         *
         * */


        boolean a, b, c;

        System.out.println("===== OR ( || ) ======");
        a = false;
        b = false;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c); // false

        a = false;
        b = true;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c); // true

        a = true;
        b = true;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c); // true

        System.out.println("===== AND ( && ) ======");
        a = true;
        b = true;
        c = (a&&b);
        System.out.println(a + " && " + b + " = " + c); // true

        a = true;
        b = false;
        c = (a&&b);
        System.out.println(a + " && " + b + " = " + c); // false

        a = false;
        b = true;
        c = (a&&b);
        System.out.println(a + " && " + b + " = " + c); // false

        System.out.println("===== XOR /exclusive (^) ======");
        a = true;
        b = true;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c); // false

        a = true;
        b = false;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c); // true

        a = false;
        b = true;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c); // true

        a = false;
        b = false;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c); // false

        System.out.println("===== NOT / negasi / fleeping ( || ) ======");
        a = true;
        b = !a;
        System.out.println(a + " --> (!) " + b); // false

    }
}
