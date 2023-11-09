package day1_ngoding;

import java.util.Scanner;

public class Day32_ngoding {
    /*
    DERET FIBONACCI
    Fibonacci adalah deret bilangan yang mana bilangan saat ini adalah penjumlahan dari 2 bilangan sebelumnya
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("~~~~~DERET FIBONACCI~~~~~");
        int f1 = 0;
        int f2 = 1;
        System.out.print("Masukkan jumlah angka : ");
        int angka  = input.nextInt();
        int fn;
        System.out.print(f1 + ", ");
        System.out.print(f2);
        for (int i = 1; i < angka; i++) {
            fn = f2 + f1;
            System.out.print(" ," + fn);
            f1 = f2;
            f2 = fn;
        }
        System.out.println();
    }
}
