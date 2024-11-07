package linkedListPadaAray.latihan;


import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> hewan = new LinkedList<>();

        hewan.add("semut");
        hewan.add("monyet");
        hewan.add("ayam");
        int x = 0;

//        hewan.remove(1);
          hewan.removeFirst();
          hewan.removeLast();

        for (String i : hewan) {
            System.out.println("index ke = "+x+" : " + i);
            x++;
        }


        System.out.println("jumlah index = " + hewan.size());
    }
}
