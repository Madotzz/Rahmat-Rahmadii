package day1_ngoding;

import java.util.Scanner;

public class Day20_ngoding {
    public static void main(String[] args) {
//     Membuat pola persegi menggunakan perulangan
       Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int angka = input.nextInt();
        for (int i = 1; i <= angka; i++) {
            for (int j = 1; j < angka; j++) {
                System.out.print("O  ");
            }
            System.out.println("O  ");
        }
        System.out.println();
        
    }
}
