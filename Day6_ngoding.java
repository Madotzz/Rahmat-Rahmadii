package day1_ngoding;

import java.util.Scanner;

public class Day6_ngoding {
    public static void main(String[] args) {
//      Operasi Perbandingan menggunakan inputan Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka pertama : ");
        int angka1 = input.nextInt();
        System.out.print("Masukkan angka kedua : ");
        int angka2 = input.nextInt();
        boolean hasil;
        hasil = angka1 == angka2;
        System.out.println("Apakah angka1 == angka2 ? " + hasil);
        hasil = angka1 != angka2;
        System.out.println("Apakah angka1 != angka2 ? " + hasil);
        hasil = angka1 >= angka2;
        System.out.println("Apakah angka1 >= angka2 ? " + hasil);
        hasil = angka1 <= angka2;
        System.out.println("Apakah angka1 <= angka2 ? " + hasil);
        hasil = angka1 > angka2;
        System.out.println("Apakah angka1 > angka2 ? " + hasil);
        hasil = angka1 < angka2;
        System.out.println("Apakah angka1 < angka2 ? " + hasil);
    }
}
