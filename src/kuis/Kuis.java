
package kuis;
import java.util.Scanner;
public class Kuis {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        String namaBarang [] = {"sampo", "sabun", "odol", "sikat gigi", "handuk"};
        int harga [] = {1000, 3000, 4000, 2000, 8000};
        System.out.println("Daftar barang :");
        for (int i = 0; i < namaBarang.length; i++) {
        
            System.out.println(namaBarang[i] + " = " + harga[i]);
        }
        System.out.println("");
        System.out.println("1. Urut barang berdasarkan harga terrendah\n2. Urut barang berdasarkan harga tertinggi\n3. Urut barang berdasarkan abjad");
        System.out.print("Masukkan pilihan = ");
        int pilih = s.nextInt();
        switch (pilih) {
            case 1: 
                for (int i = 0; i < harga.length; i++) {
                        for (int j=0; j < harga.length-1; j++) {
                            if (harga [j] > harga [j+1] ) {
                                int temp = harga[j];
                                harga[j] = harga[j+1];
                                harga[j+1] = temp;
                            }
                        }
                    }
                for (int i = 0; i < harga.length; i++) {
                        System.out.print(harga[i] + ", ");
                }
                break;
            case 2:  
                for (int i = 0; i < harga.length; i++) {
                        for (int j=0; j < harga.length-1; j++) {
                            if (harga [j] < harga [j+1] ) {
                                int temp = harga[j];
                                harga[j] = harga[j+1];
                                harga[j+1] = temp;
                                
                            }
                        }
                    }
                for (int i = 0; i < harga.length; i++) {
                                System.out.print(harga[i]+", ");
                            }
                break;
            case 3: 
                for (int i = 0; i<namaBarang.length-1; i++) {
                        for (int j = i+1; j<namaBarang.length; j++) {
                            if (namaBarang[i].compareToIgnoreCase(namaBarang[j])>0){
                                String temp = namaBarang[j];
                                namaBarang[j] = namaBarang[i];
                                namaBarang [i] = temp;
                            }
                        }
                    }
                    for (int i = 0; i< namaBarang.length; i++) {
                        System.out.print(namaBarang[i]+ ",");
                    }
                    break;
        }
    }
    
}
