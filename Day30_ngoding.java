package day1_ngoding;

import java.util.Scanner;

public class Day30_ngoding {
    public static void main(String[] args) {
        /*
        Menentukan nilai minimal dan maksimal dalam jumlah angka yang diinputkan menggunakan perulangan for 
        */
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Jumlah angka : ");
        int jumlah = input.nextInt();
        int angka, minimal = 1000, maksimal = 0;
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for (int i = 1; i <= jumlah; i++) {
            System.out.print("Angka ke-"+ i + " = ");
            angka = input.nextInt();
            if (angka > maksimal){
                maksimal = angka;
            }
            if (angka < minimal) {
                minimal = angka;
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Nilai minimalnya adalah  : " + minimal);
        System.out.println("Nilai maksimalnya adalah : " + maksimal);
    }
}
