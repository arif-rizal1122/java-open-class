package methodParamProsedurDfungsi.latihan;

import java.util.Scanner;

public class Main {

    // fungsi
    public static String siswa(String nama, int umur) {
       return nama + " berumur " + umur;
    }

    // prosedur
    public static void siswi(String name, int age){
        System.out.println(name + " berumur " + age + " th");
    }


//    public static

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);

        System.out.println("____________________________________________");
        System.out.print("masukan nama : ");
        String nm = masuk.nextLine();

        System.out.print("masukan umur : ");
        int umr = masuk.nextInt();
        masuk.nextLine();
        System.out.println(siswa(nm, umr));

        System.out.println("____________________________________________");
        System.out.println("masukan nama : ");
        String name = masuk.nextLine();

        System.out.print("masukan umur : ");
        int age = masuk.nextInt();
        masuk.nextLine();
        siswi(name, age);


    }


}
