
package kuis;
import java.util.Scanner;
public class arraymultidimensi {
    public static void main(String[] args) {
        String[][] daftarBarang = {
            {"sampo", "sabun", "odol", "sabun"},
            {"1000", "2000", "3000", "4000"}
        };

        for (int i = 0; i < daftarBarang.length; i++){
            for ( int j = 0; j < daftarBarang.length+1; j ++) {
                System.out.println(daftarBarang[i][j]);
            }
        }
    }
}
    

