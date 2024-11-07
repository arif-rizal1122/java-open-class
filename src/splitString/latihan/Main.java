package splitString.latihan;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

//          Scanner masuk = new Scanner(System.in);
//          System.out.print("input tanggal lahir = ");
//          String ttl = masuk.nextLine();

            String ttl = "nganjuk, 30 novenber 2023";
//          String split[] = ttl.split(" "); // split by spasi
          String splitt[]    = ttl.split(", "); // split by koma
          String splitt_[]   = splitt[1].split(" "); // split didalam split

          String tgl = splitt_[0];
          String bln = splitt_[1];
          String thn = splitt_[2];
          String tmpt = splitt_[0];

          System.out.println("tempat\t: " + tmpt);
          System.out.println("tanggal\t: " + tgl);
          System.out.println("bulan\t: " + bln);
          System.out.println("tahun\t: " + thn);

          System.out.println("===========================================");
          System.out.println(splitt_[0]);
          System.out.println("\n{ " + ttl + " }");
    }






}
