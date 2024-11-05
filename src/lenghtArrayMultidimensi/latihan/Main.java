package lenghtArrayMultidimensi.latihan;

public class Main {
    public static void main(String[] args) {
        String[][] kontak = {
                {"alex", "*123#"}, // [0][0] - [0][1]
                {"budi", "*555#"}, // [1][0] - [1][1]
                {"intil", "*888#"} // [2][0] - [][]
        };

        for (int i = 0; i < kontak.length; i++) {
            for (int j = 0; j < kontak[i].length; j++) {
                System.out.print(kontak[i][j]);
            }
            System.out.println("");
        }



    }
}
