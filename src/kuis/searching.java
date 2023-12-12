
package kuis;
import java.util.Scanner;
public class searching {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int i = 0;
        String namabarang [] = {"sampo", "sabun", "odol", "sikat gigi", "handuk"};
        System.out.print("Barang yang dicari:");
        boolean ketemu= false;
        String cari = s.next();
        for (i = 0; i < namabarang.length; i++) {
            if (namabarang[i].compareToIgnoreCase(cari)==0) {
                ketemu = true;
                break;
            } 
        }
            if (ketemu==true){
                System.out.println(namabarang[i] + " ada di urutan " + (i+1));
            } else {
                System.out.println("Barang tidak ada");
            }
            
        }
    }

