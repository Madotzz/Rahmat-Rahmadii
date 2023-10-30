package day1_ngoding;

import java.util.Scanner;

public class Day22_ngoding {
    public static void main(String[] args) {
//      Membuat program faktorial menggunakan perulangan
       Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int angka = input.nextInt();
        int hasil = angka;
        System.out.print("Bilangan faktorial dari " + angka + " adalah = ");
        for (int i = angka; i > 0; i--) {
            System.out.print(i);
            if (i > 1){
                System.out.print(" x ");
            }
            if (angka != i){
                hasil *= i;
            }
        }
        System.out.println();
        System.out.println("Hasilnya adalah = " + hasil);
    }
}
