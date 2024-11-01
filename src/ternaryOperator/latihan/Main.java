
package ternaryOperator.latihan;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // ternary operator
        // variable x = expresi ? statment_true : statment_false

        int input, x;

        Scanner inputUser = new Scanner(System.in);
        System.out.print("masukan nilai : ");
        input = inputUser.nextInt();

        // mengunakan ternari operator
        x = (input == 10) ? (input*input) : (input/2); // jika input nya 10 maka akan dikali 10 * 10 = 100 jika selain itu input nya bukan 10 maka nilainya akan dibagi dua
        // mengunakan if else statment

//           if (input == 10) {
//              X = (input*input);
//           } else {
//              x = (input/2);
//           }

        System.out.print("hasilnya " + x);
    }


}