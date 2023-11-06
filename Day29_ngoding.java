package day1_ngoding;

import java.util.Scanner;

public class Day29_ngoding {
    public static void main(String[] args) {
//      Membuat inputan angka yang outputnya menampilkan jumlah angka yang habis dibagi tiga
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int angka = input.nextInt();
        for (int i = 1; i <= angka; i++) {
            if (i % 3 == 0 ){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
