package day1_ngoding;

import java.util.Scanner;

public class Day21_ngoding {
//    Membuat bilangan berpangkat menggunakan perulangan 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int angka = input.nextInt();
        System.out.print("Masukkan pangkat : ");
        int pangkat = input.nextInt();
        int hasil = angka;
        for (int i = 1; i < pangkat; i++) {
            hasil *= angka;
        }
        System.out.println("Hasil : " + hasil);
    }
}
