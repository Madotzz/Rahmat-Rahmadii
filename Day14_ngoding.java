package day1_ngoding;

import java.util.Scanner;

public class Day14_ngoding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka awal : ");
        int awal = input.nextInt();
        System.out.print("Masukkan angka akhir :");
        int akhir = input.nextInt();
        for (int i = awal; i <= akhir; i++) {
            System.out.print("Masukkan angka : ");
            int angka = input.nextInt();
        }
        System.out.println("Perulangan Selesai");
    }
}
