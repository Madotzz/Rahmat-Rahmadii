package day1_ngoding;

import java.util.Scanner;

public class Day31_ngoding {
    public static void main(String[] args) {
//      Menghitung nilai rata - rata menggunakan perulangan 
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah nilai : ");
        int jumlah = input.nextInt();
        double nilai, total = 0;
        for (int i = 1; i <= jumlah; i++) {
            System.out.print("Nilai ke-" + i + " = ");
            nilai = input.nextInt();
            total += nilai;
        }
        double rata = total / jumlah;
        System.out.println("Total nilainya adalah     : " + total);
        System.out.println("Rata-Rata nilainya adalah : " + rata);
    }
 
}
